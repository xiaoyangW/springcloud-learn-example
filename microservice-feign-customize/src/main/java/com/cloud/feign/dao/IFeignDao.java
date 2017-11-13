package com.cloud.feign.dao;

import com.cloud.feign.dto.ResponseDto;
import com.cloud.feign.feign.TestConfiguration;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "micoserice-user",configuration = TestConfiguration.class)
public interface IFeignDao {
    //@RequestMapping(value = "/user/getuser",method = RequestMethod.GET)
    @RequestLine("GET /user/getuser")
    ResponseDto getUser();

}
