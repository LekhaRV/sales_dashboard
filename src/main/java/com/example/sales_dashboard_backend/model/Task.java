package com.example.sales_dashboard_backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "task")
@Data
public class Task {
    @Id@GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lead_id")
    private Lead lead;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo;

    @Enumerated(EnumType.STRING)
    private TaskType type;

    private String description;
    private LocalDateTime dueDate;
    private boolean completed;

    public enum TaskType{
        CALL, EMAIL, UPDATE, REMINDER
    }

}
