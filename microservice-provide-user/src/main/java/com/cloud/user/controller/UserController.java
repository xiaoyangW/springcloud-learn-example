package com.cloud.user.controller;

import com.cloud.user.entity.ResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getuser")
    public ResponseDto getUser(){
        ResponseDto dto = new ResponseDto();
        dto.setCode(0);
        dto.setMsg("user--------------111");
        return dto;
    }

}
