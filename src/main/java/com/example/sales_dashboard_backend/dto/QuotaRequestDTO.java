package com.example.sales_dashboard_backend.dto;

import java.math.BigDecimal;

import lombok.Data;


@Data
public class QuotaRequestDTO {
    private Long repId;
    private String period;
    private BigDecimal targetValue;
}


