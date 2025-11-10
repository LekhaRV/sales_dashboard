package com.example.sales_dashboard_backend.dto;

import java.time.LocalDateTime;

import lombok.Data;


@Data
public class TaskRequestDTO {
    private Long leadId;
    private Long assignedToId;
    private String type;
    private String description;
    private LocalDateTime dueDate;
}


