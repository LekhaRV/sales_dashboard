package com.example.sales_dashboard_backend.model;

import java.time.LocalDateTime;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tasks")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_seq")
    @SequenceGenerator(name = "task_seq", sequenceName = "task_seq", allocationSize = 1)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "lead_id", nullable = false)
    private Lead lead;

    @ManyToOne(optional = false)
    @JoinColumn(name = "assigned_to", nullable = false)
    private User assignedTo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskType type;

    @NotBlank
    private String description;

    private LocalDateTime dueDate;

    private boolean completed;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    public enum TaskType {
        CALL, EMAIL, UPDATE, REMINDER
    }
}

