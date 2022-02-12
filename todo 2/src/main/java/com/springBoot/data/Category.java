package com.springBoot.data;

import java.util.List;

public class Category {

    private String id;

    private String category;
    private List<Task> tasks;

    public Category() {

    }

    public Category(String id, String category, Task task) {
        this.id = id;
        this.category = category;
        this.tasks.add(task);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
