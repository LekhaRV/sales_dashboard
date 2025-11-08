package com.example.sales_dashboard_backend.model;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "quota")
@Data
public class Quota {
    @Id@GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "rep_id")
    private User rep;

    @Enumerated(EnumType.STRING)
    private Period period;

    private BigDecimal targetValue;

    public enum Period{
        MONTHLY, QUARTERLY
    }

}
