package com.example.sales_dashboard_backend.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ReportResponseDTO {
    private Long id;
    private String title;
    private String team;
    private String generatedBy;
    private LocalDateTime createdAt;
}

