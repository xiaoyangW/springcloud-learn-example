package com.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wxy
 * bus刷新节点 curl -X POST http://host/bus/refresh
 */
@RestController
public class TestController {
    @Value("${config.version}")
    private String version;

    @GetMapping("/version")
    public String test(){
        return version;
    }

}
