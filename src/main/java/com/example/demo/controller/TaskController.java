package com.example.demo.controller;

import com.example.demo.entity.Status;
import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public void addTask(@RequestBody Task task) {
        System.out.println(task);
        taskService.addTask(task);
    }

    @GetMapping
    public List<Task> getAll() {
        return taskService.getAll();
    }

    @GetMapping("/{id}")
    public Task getById(@PathVariable Long id) {
        return taskService.getById(id);
    }

    @PutMapping
    public void update(@RequestBody Task task) {
        taskService.update(task);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        taskService.deleteById(id);
    }

    @DeleteMapping()
    public void deleteAll() {
        taskService.deleteAll();
    }

}
