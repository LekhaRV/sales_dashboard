package com.example.sales_dashboard_backend.model;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "quotas")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Quota {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quota_seq")
    @SequenceGenerator(name = "quota_seq", sequenceName = "quota_seq", allocationSize = 1)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "rep_id", nullable = false)
    private User rep;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Period period;

    @Column(nullable = false)
    private BigDecimal targetValue;

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

    public enum Period {
        MONTHLY, QUARTERLY
    }
}
