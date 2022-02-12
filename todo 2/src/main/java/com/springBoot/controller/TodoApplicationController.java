package com.springBoot.controller;

import com.springBoot.TodoService.CategoryService;

import com.springBoot.data.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/category")
public class TodoApplicationController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> findAll(){
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable String id){
        return categoryService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        categoryService.deleteById(id);

    }

    @PostMapping
    public void save(@RequestBody Category category){
        categoryService.save(category);

    }



}
