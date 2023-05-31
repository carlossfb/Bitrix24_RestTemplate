package com.bitrix24.carlossfb.consume_api.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bitrix24.carlossfb.consume_api.DTO.ObjectTask;
import com.bitrix24.carlossfb.consume_api.util.MyDateFormat;



@Service
public class TaskService {
    public ObjectTask getTasks(String userId){
        MyDateFormat format = new MyDateFormat();
        String today = format.myDateFormat(new Date());

        return new RestTemplate()
            .getForEntity("https://xxxxx-xxxxx.bitrix24.com/rest/1/xxxxxxxx/task.elapseditem.getlist.json?order[TASK_ID]=asc&filter[<CREATED_DATE]="+today+"&filter[USER_ID]="+userId, ObjectTask.class).getBody();
    }



}

