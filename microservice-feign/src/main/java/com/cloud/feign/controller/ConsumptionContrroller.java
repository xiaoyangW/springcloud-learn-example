package com.cloud.feign.controller;


import com.cloud.feign.dao.IFeignDao;
import com.cloud.feign.dto.ResponseDto;
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

    private IFeignDao iFeignDao;

    @Autowired
    public ConsumptionContrroller(IFeignDao iFeignDao) {
        this.iFeignDao=iFeignDao;
    }

    @GetMapping("/getuser")
    public ResponseDto getUser(){
        return iFeignDao.getUser();
    }

}
