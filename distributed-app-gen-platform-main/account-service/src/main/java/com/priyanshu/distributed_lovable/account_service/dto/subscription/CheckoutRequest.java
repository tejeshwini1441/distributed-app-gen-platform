package com.priyanshu.distributed_lovable.account_service.dto.subscription;

import jakarta.validation.constraints.NotBlank;

public record CheckoutRequest(
        @NotBlank Long planId
) {
}
