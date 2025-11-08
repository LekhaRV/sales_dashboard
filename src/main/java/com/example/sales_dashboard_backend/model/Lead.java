package com.example.sales_dashboard_backend.model;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
@Entity
@Table(name = "Lead")
@Data
public class Lead {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    
    @Email
    private String email;

    private String Company;
    
    @Enumerated(EnumType.STRING)
    private LeadSource source;

    @Enumerated(EnumType.STRING)
    private LeadStatus status;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo;

    private LocalDateTime createdAt;

    public enum LeadSource{
        WEBSITE,REFERRAL,CAMPAIGN
    }

    public enum LeadStatus{
        NEW, CONTACTED, QUALIFIED
    }

}
