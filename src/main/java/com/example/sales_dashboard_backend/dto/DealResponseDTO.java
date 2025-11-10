package com.example.sales_dashboard_backend.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class DealResponseDTO {
    private Long id;
    private String leadName;
    private String repName;
    private BigDecimal value;
    private String stage;
    private LocalDate expectedClose;
    private LocalDate closedAt;
}
