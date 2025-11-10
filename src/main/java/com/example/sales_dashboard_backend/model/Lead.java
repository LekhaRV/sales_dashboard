package com.example.sales_dashboard_backend.model;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.*;
import lombok.*;
@Entity
@Table(name = "leads")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lead_seq")
    @SequenceGenerator(name = "lead_seq", sequenceName = "lead_seq", allocationSize = 1)
    private Long id;

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    @Size(max = 15)
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LeadSource source;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LeadStatus status;

    @ManyToOne(optional = false)
    @JoinColumn(name = "assigned_to", nullable = false)
    private User assignedTo;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

    public enum LeadSource {
        WEBSITE, REFERRAL, CAMPAIGN
    }

    public enum LeadStatus {
        NEW, CONTACTED, QUALIFIED
    }
}
