package com.example.sales_dashboard_backend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RoleRequestDTO {
    @NotBlank
    private String name;
}


