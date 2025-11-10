package com.example.sales_dashboard_backend.repository;
import com.example.sales_dashboard_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}