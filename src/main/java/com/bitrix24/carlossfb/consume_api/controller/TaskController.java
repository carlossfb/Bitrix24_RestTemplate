package com.bitrix24.carlossfb.consume_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitrix24.carlossfb.consume_api.DTO.ObjectDepartament;
import com.bitrix24.carlossfb.consume_api.DTO.ObjectUser;
import com.bitrix24.carlossfb.consume_api.service.DepartmentService;
import com.bitrix24.carlossfb.consume_api.service.UserService;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    UserService userService;
    
    @Autowired
    DepartmentService departamentService;
    
    // @GetMapping("/task")
    // public ResponseEntity<ObjectTask> getTasks(){

    //   ObjectTask task = taskService.getTasks();
    //   return ResponseEntity.ok(task);
    // }

    @GetMapping("/")
    public ResponseEntity<ObjectDepartament> getDepartment(){
      ObjectDepartament response =  departamentService.getDepartament();
      return ResponseEntity.ok(response);
    }
    @GetMapping("/department/{dep}")
    public ResponseEntity<ObjectUser> getUsers(@PathVariable("dep") Number ufDepartment){
      ObjectUser user = userService.getUsers(ufDepartment);
      return ResponseEntity.ok(user);
    }



}
