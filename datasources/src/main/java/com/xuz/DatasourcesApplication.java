package com.xuz;

import com.xuz.config.DBConfig1;
import com.xuz.config.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
// 加载两个配置实体类
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class DatasourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatasourcesApplication.class);
    }
}
