package com.springBoot.repository;

import com.springBoot.data.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TodoRepository {

    private List<Category> categories = new ArrayList<>();

    public List<Category> findAll(){
        return this.categories;
    }

    public void save(Category category){
        this.categories.add(category);

    }

    public Category findById(String id){

        return  this.categories.stream().filter(category ->  category.getId().equalsIgnoreCase(id)).findFirst().get();

    }
    public void deleteById(String id){
        this.categories=this.categories.stream().filter(category -> !category.getId().equalsIgnoreCase(id)).collect(Collectors.toList());

    }


}
