package com.imooc.spring.ioc.class13;

import com.imooc.spring.ioc.class13.Bean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xudongmei
 * @data 2019/5/6
 * @time 下午7:56
 */
@Configuration
public class MyConfiguration {
    @Bean(value = {"bean1", "bean2"})
    public Bean1 bean1() {  // 此处方法名就为bean的id
        return new Bean1();
    }
}
