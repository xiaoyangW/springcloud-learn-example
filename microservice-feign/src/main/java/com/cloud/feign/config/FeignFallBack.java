package com.cloud.feign.config;

import com.cloud.feign.dao.IFeignDao;
import com.cloud.feign.dto.ResponseDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author wxy
 */
@Component
public class FeignFallBack implements IFeignDao {
    @Override
    public ResponseDto getUser() {
        ResponseDto dto = new ResponseDto();
        dto.setCode(1);
        return dto;
    }
}
