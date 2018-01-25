package com.cloud.feign.dao;

import com.cloud.feign.dto.ResponseDto;
import com.cloud.feign.feign.TestConfiguration;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "micoserice-zipkin",configuration = TestConfiguration.class)
public interface IFeignDao {
    //@RequestMapping(value = "/zipkin/getuser",method = RequestMethod.GET)
    @RequestLine("GET /zipkin/getuser")
    ResponseDto getUser();

}
