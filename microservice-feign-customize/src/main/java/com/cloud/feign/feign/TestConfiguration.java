package com.cloud.feign.feign;

import feign.Contract;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

}
