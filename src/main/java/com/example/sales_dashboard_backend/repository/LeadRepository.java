package com.example.sales_dashboard_backend.repository;

import com.example.sales_dashboard_backend.model.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LeadRepository extends JpaRepository<Lead, Long> {

}
