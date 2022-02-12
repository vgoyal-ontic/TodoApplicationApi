package com.springBoot.controller;


import com.springBoot.TodoService.TaskService;
import com.springBoot.data.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class TaskController {


    @Autowired
    private TaskService taskService;

    @PutMapping("/{categoryId}")
    public void addTask(@PathVariable String categoryId,@RequestBody Task task){
        taskService.save(categoryId,task);

    }

    @DeleteMapping("/{categoryId}/{id}")
    public void deleteById(@PathVariable String id,@PathVariable String categoryId){
        taskService.deleteById(categoryId,id);
    }




}
