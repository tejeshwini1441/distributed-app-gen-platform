package com.priyanshu.distributed_lovable.account_service.dto.subscription;

public record PlanResponse(
        Long id,
        String stringPriceId,
        Integer maxProjects,
        Integer maxTokensPerDay,
        Boolean unlimitedAI,
        String price
) {
}
