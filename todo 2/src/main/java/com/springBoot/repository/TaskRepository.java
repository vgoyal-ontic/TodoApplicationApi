package com.springBoot.repository;

import com.springBoot.data.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskRepository {

    @Autowired
    private final TodoRepository todoRepository;

    public TaskRepository(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public List<Task> findAll(String categoryId){

        return todoRepository.findById(categoryId).getTasks();
    }

    public Task findById(String categoryId, String taskId ){
        return todoRepository
                .findById(categoryId)
                .getTasks()
                .stream()
                .filter(task->task.getId().equalsIgnoreCase(taskId))
                .findFirst()
                .get();


    }

    public void save(String categoryId,Task task){

        todoRepository.findById(categoryId).getTasks().add(task);

    }

    public void deleteById(String categoryId,String taskId){

        todoRepository
                .findById(categoryId)
                .setTasks(todoRepository.findById(categoryId).getTasks()
                        .stream()
                        .filter(task->  !task.getId().equalsIgnoreCase(taskId))
                        .collect(Collectors.toList()));


    }






}
