package com.example.sales_dashboard_backend.dto;

import lombok.Data;
import jakarta.validation.constraints.*;

@Data
public class LeadRequestDTO {
    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    @Size(max = 15)
    private String phone;

    private String source;
    private String status;
    private Long assignedToId;
}

