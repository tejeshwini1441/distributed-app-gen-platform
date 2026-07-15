package com.priyanshu.distributed_lovable.account_service.dto.subscription;

import com.priyanshu.distributed_lovable.common_lib.dto.PlanDto;

import java.time.Instant;

public record SubscriptionResponse(
        PlanDto plan,
        String staus,
        Instant periodEnd,
        Long tokenUsedThisCycle
) {
}
