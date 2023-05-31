package com.bitrix24.carlossfb.consume_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitrix24.carlossfb.consume_api.DTO.ObjectDepartment;
import com.bitrix24.carlossfb.consume_api.DTO.ObjectUser;
import com.bitrix24.carlossfb.consume_api.service.DepartmentService;
import com.bitrix24.carlossfb.consume_api.service.UserService;

@RestController
@RequestMapping("/api")
public class TaskController {

    @Autowired
    UserService userService;
    
    @Autowired
    DepartmentService departmentService;
    
    // @GetMapping("/task")
    // public ResponseEntity<ObjectTask> getTasks(){

    //   ObjectTask task = taskService.getTasks();
    //   return ResponseEntity.ok(task);
    // }

    @GetMapping("/")
    public ResponseEntity<ObjectDepartment> getDepartment(){
      ObjectDepartment response =  departmentService.getDepartment();
      return ResponseEntity.ok(response);
    }
    @GetMapping("/department/{dep}")
    public ResponseEntity<ObjectUser> getUsers(@PathVariable("dep") Number ufDepartment){
      ObjectUser user = userService.getUsers(ufDepartment);
      return ResponseEntity.ok(user);
    }



}
