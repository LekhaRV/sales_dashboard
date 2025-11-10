package com.example.sales_dashboard_backend.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;


@Data
public class QuotaResponseDTO {
    private Long id;
    private String repName;
    private String period;
    private BigDecimal targetValue;
    private LocalDateTime createdAt;
}

