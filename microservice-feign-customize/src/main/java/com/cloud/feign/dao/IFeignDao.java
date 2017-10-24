package com.cloud.feign.dao;

import com.cloud.feign.dto.ResponseDto;
import com.cloud.feign.feign.TestConfiguration;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "micoserice-user",configuration = TestConfiguration.class)
public interface IFeignDao {
    //@RequestMapping(value = "/user/getuser",method = RequestMethod.GET)
    @RequestLine("GET /user/getuser")
    ResponseDto getUser();

}
