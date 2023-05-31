package com.bitrix24.carlossfb.consume_api.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bitrix24.carlossfb.consume_api.DTO.ObjectDepartment;

@Service
public class DepartmentService {
    
    public ObjectDepartment getDepartment(){
        return new RestTemplate().getForEntity("https://xxxxx-xxxxx.bitrix24.com/rest/1/xxxxxxxx/department.get.json", ObjectDepartment.class).getBody();
    }
}
