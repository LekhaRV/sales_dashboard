package com.example.sales_dashboard_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "team")
@Data
public class Team {
    @Id@GeneratedValue
    private Long id;

    private String name;
    private String region;

}
