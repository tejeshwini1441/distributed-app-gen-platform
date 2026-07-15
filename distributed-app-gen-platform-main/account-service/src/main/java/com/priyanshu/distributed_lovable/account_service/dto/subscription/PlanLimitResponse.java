package com.priyanshu.distributed_lovable.account_service.dto.subscription;

public record PlanLimitResponse(
        String name,
        Integer maxTokenPerDay,
        Integer maxProjects,
        Boolean unlimitedAi
) {
}
