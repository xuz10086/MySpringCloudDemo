package com.xuz.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class AccessFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(AccessFilter.class);

    /**
     * 返回过滤类型，有：pre，route，post，error
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 返回执行优先级，数字越小，优先级越高，越早执行
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 设置过滤条件
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     * 具体的操作
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        Object accessToken = request.getParameter("accessToken");
        if(accessToken == null) {
            log.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        log.info("access token ok");
        return null;
    }
}
