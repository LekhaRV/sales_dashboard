package com.example.sales_dashboard_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "report")
@Data
public class Report {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    @ManyToOne
    @JoinColumn(name = "generated_by")
    private User generatedBy;

    @Column(columnDefinition =  "TEXT")
    private String filterJson;

    @Column(columnDefinition =  "TEXT")
    private String dataJson;

    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist(){
        this.createdAt = LocalDateTime.now();

    }

}
