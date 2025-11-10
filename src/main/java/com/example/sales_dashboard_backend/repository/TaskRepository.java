package com.example.sales_dashboard_backend.repository;

import com.example.sales_dashboard_backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
