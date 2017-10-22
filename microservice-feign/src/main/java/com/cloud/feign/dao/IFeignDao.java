package com.cloud.feign.dao;

import com.cloud.feign.dto.ResponseDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("micoserice-user")
public interface IFeignDao {

    @RequestMapping(value = "/user/getuser",method = RequestMethod.GET)
    ResponseDto getUser();

}
