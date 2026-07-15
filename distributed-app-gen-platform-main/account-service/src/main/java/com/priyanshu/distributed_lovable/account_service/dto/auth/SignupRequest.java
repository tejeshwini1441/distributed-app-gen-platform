package com.priyanshu.distributed_lovable.account_service.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record SignupRequest(
        @Email @NotBlank String username,
        @NotBlank String name,
        @Size(min=4, max = 50) String password
) {
}
