package com.springBoot.TodoService;

import com.springBoot.data.Task;
import com.springBoot.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {


    @Autowired
    private TaskRepository taskRepository;


    public List<Task> findAll(String categoryId){
        return taskRepository.findAll(categoryId);

    }

    public Task findById(String categoryId,String taskId){
        return taskRepository.findById(categoryId,taskId);

    }

    public void save(String categoryId,Task task){
        taskRepository.save(categoryId,task);


    }


    public void deleteById(String categoryId,String taskId){
        taskRepository.deleteById(categoryId,taskId);

    }





}
