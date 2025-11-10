package com.example.sales_dashboard_backend.dto;
import lombok.Data;
import jakarta.validation.constraints.*;

@Data
public class UserRequestDTO {
    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    private Long roleId;
    private Long teamId;
}
