package com.cloud.ribbon.controller;


import com.cloud.ribbon.dto.ResponseDto;
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

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getuser")
    public ResponseDto getUser(){
        return restTemplate.getForObject("http://MICOSERICE-USER/user/getuser",ResponseDto.class);
    }

}
