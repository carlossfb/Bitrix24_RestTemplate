package com.bitrix24.carlossfb.consume_api.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bitrix24.carlossfb.consume_api.DTO.ObjectDepartament;

@Service
public class DepartmentService {
    
    public ObjectDepartament getDepartament(){
        return new RestTemplate().getForEntity("https://xxxxxxxxx.bitrix24.com/rest/1/xxxxxxxxx/department.get.json", ObjectDepartament.class).getBody();
    }
}
