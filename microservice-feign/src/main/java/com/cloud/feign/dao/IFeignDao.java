package com.cloud.feign.dao;

import com.cloud.feign.config.FeignFallBack;
import com.cloud.feign.dto.ResponseDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Repository
@FeignClient(value = "micoserice-user",fallback = FeignFallBack.class)
public interface IFeignDao {

    @RequestMapping(value = "/user/getuser",method = RequestMethod.GET)
    ResponseDto getUser();

}
