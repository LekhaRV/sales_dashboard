package com.example.sales_dashboard_backend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class TeamRequestDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String region;
}


