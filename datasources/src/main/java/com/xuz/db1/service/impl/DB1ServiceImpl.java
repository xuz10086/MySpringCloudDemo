package com.xuz.db1.service.impl;

import com.xuz.db1.mapper.UserMapper;
import com.xuz.db1.pojo.User;
import com.xuz.db1.service.DB1Service;
import com.xuz.db2.mapper.DepMapper;
import com.xuz.db2.pojo.Dep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DB1ServiceImpl implements DB1Service {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DepMapper depMapper;

    @Override
    public void insertDB(User user) {
        // 向数据源1 插入用户信息
        int count = userMapper.insertSelective(user);
        // 同时向数据源2 插入部门信息
        Dep dep = new Dep();
        dep.setVcDepName("测试部门1");
        depMapper.insert(dep);
//        int i = 1/0;
    }
}
