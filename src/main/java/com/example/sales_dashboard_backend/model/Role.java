package com.example.sales_dashboard_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "role")
@Data
public class Role {
    @Id@GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private RoleName name;

    public enum RoleName{
        REP, MANAGER, EXECUTIVE
    }

}
