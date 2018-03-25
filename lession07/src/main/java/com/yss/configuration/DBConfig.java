package com.yss.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 12:20 2018/3/25
 */
@Configuration
public class DBConfig {
    /**
     * 配置德鲁伊连接池
     * @return 然后数据源
     */
    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }
}
