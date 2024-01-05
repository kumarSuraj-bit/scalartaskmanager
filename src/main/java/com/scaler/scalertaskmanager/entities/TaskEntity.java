package com.scaler.scalertaskmanager.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskEntity {
    private int id;
    private String title;
    private String description;
    private Date deadline;
    private Boolean completed;
}
