package com.bitrix24.carlossfb.consume_api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bitrix24.carlossfb.consume_api.DTO.ObjectUser;
import com.bitrix24.carlossfb.consume_api.model.Task;
import com.bitrix24.carlossfb.consume_api.model.User;



@Service
public class UserService {

    @Autowired
    TaskService taskService;

    public ObjectUser getUsers(Number ufDepartament){
        ObjectUser user = new RestTemplate().getForEntity("xxxxx-xxxxx.bitrix24.com/rest/1/xxxxxxxx/user.get.json?filter[UF_DEPARTMENT]="+ufDepartament, ObjectUser.class).getBody();

        for(int i = 0; user.getResult().length > i ; i++){
            User[] userArr = user.getResult();
            Task[] task = taskService.getTasks(userArr[i].getId()).getResult();
            userArr[i].setTask(task);
          }
    
        return user;
 }



}

