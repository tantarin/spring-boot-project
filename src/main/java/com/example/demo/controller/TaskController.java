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

    @GetMapping
    public List<Task> getAll() {
        return taskService.getAll();
    }

    @PostMapping
    public void addTask(@RequestBody Task task) {
        taskService.addTask(task);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        taskService.deleteById(id);
    }


    //    @GetMapping("/{name}")
//    public Task getByName(@PathVariable String name) {
//        return taskService.getByName(name);
//    }
//
//    @GetMapping
//    public List<Task> getByStatus(@RequestParam Status status) {
//        return taskService.getByStatus(status);
//    }

}
