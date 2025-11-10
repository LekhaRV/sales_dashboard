package com.example.sales_dashboard_backend.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TaskResponseDTO {
    private Long id;
    private String leadName;
    private String assignedTo;
    private String type;
    private String description;
    private boolean completed;
    private LocalDateTime dueDate;
}


