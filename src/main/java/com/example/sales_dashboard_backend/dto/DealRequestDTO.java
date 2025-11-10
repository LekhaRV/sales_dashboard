package com.example.sales_dashboard_backend.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Data;

@Data
public class DealRequestDTO {
    private Long leadId;
    private Long repId;
    private Long teamId;
    private BigDecimal value;
    private String stage;
    private LocalDate expectedClose;
}


