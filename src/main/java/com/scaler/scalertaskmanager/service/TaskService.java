package com.scaler.scalertaskmanager.service;

import com.scaler.scalertaskmanager.entities.TaskEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class TaskService {
    private final ArrayList<TaskEntity> tasks = new ArrayList<>();
    private int taskId = 1;

    public TaskEntity addTask(String title, String description, String deadline) {
        TaskEntity task = new TaskEntity();
        task.setId(taskId);
        task.setCompleted(false);
        task.setTitle(title);
        task.setDescription(description);
        //task.setDeadline(new Date(deadline));
        tasks.add(task);
        taskId++;
        return task;
    }

    public TaskEntity getTaskById(int id) {
        for (TaskEntity task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public ArrayList<TaskEntity> getTasks() {
        return tasks;
    }

}
