package com.springBoot.TodoService;


import com.springBoot.data.Category;

import com.springBoot.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryService {

    @Autowired
    private TodoRepository todoRepository;



    public List<Category> findAll(){
        return  todoRepository.findAll();
    }


    public Category findById(String id){
        System.out.println(todoRepository.findById(id).getId());
        return todoRepository.findById(id);
    }

    public void save(Category category){
        todoRepository.save(category);

    }

    public void deleteById(String id){
        todoRepository.deleteById(id);
    }


}
