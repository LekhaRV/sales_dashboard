package com.example.sales_dashboard_backend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReportRequestDTO {
    @NotBlank
    private String title;

    private Long teamId;
    private Long generatedById;
    private String filterJson;
    private String dataJson;
}

