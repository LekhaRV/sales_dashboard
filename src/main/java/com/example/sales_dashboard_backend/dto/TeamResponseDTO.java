package com.example.sales_dashboard_backend.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TeamResponseDTO {
    private Long id;
    private String name;
    private String region;
    private LocalDateTime createdAt;
}

