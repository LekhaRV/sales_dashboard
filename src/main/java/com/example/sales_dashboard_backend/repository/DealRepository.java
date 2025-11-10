package com.example.sales_dashboard_backend.repository;

import com.example.sales_dashboard_backend.model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DealRepository extends JpaRepository<Deal, Long> {

}