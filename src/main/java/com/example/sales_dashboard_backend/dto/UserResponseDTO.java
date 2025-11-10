package com.example.sales_dashboard_backend.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserResponseDTO {
    private Long id;
    private String name;
    private String email;
    private String role;
    private String team;
    private LocalDateTime createdAt;
}


