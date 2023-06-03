package com.example.demo.service;

import com.example.demo.entity.Status;
import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

//    public Task getByName(String name) {
//        taskRepository.
//    }

    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }

//    public List<Task> getByStatus(Status status) {
//        List<Task> result = new ArrayList<>();
//        for (Task t : taskList) {
//            if(t.getStatus().equals(status))
//            result.add(t);
//        }
//        return result;
//    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public void addTask(Task task) {
        taskRepository.save(task);
    }

    public Task getById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public void update(Task task) {
        taskRepository.save(task);
    }

    public void deleteAll() {
        taskRepository.deleteAll();
    }

}
