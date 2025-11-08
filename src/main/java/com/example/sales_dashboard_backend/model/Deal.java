package com.example.sales_dashboard_backend.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "deals")
@Data
public class Deal {
    @Id@GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lead_id")
    private Lead lead;

    @ManyToOne
    @JoinColumn(name = "rep_id")
    private User rep;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    private BigDecimal value;

    @Enumerated(EnumType.STRING)
    private DealStage stage;

    private LocalDate expectedClose;
    private LocalDate closedAt;

    public enum DealStage{
        NEGOTIATION, CLOSED_WON, CLOSED_LOST
    }

}
