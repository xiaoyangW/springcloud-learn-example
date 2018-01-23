package com.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wxy
 *使用@RefreshScope开启手动刷新配置开启refresh节点 使用命令 curl -X POST http://hostname/refresh
 */
@RestController
@RefreshScope
public class TestController {
    @Value("${config.version}")
    private String version;

    @GetMapping("/version")
    public String test(){
        return version;
    }

}
