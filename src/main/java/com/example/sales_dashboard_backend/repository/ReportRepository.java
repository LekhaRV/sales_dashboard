package com.example.sales_dashboard_backend.repository;
import com.example.sales_dashboard_backend.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
    
}
