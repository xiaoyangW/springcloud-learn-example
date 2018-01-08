package com.cloud.controller;


import com.cloud.dto.ResponseDto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wxy
 */
@RestController
@RequestMapping("/consumation")
public class ConsumptionContrroller {
    private RestTemplate restTemplate;
    @Autowired
    public ConsumptionContrroller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "error")
    @GetMapping("/getuser2")
    public ResponseDto getUser(){
        return restTemplate.getForObject("http://MICOSERICE-USER/user/getuser",ResponseDto.class);
    }

    public ResponseDto error(){
        ResponseDto dto = new ResponseDto();
        dto.setCode(1);
        dto.setMsg("error");
        return dto;
    }

}
