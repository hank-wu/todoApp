package com.todo.todoApp.application;

import com.todo.todoApp.domain.model.Task;
import com.todo.todoApp.domain.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskUseCaseImpl implements TaskUseCaseInterface{
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> read() {
        return taskRepository.select();
    }
}