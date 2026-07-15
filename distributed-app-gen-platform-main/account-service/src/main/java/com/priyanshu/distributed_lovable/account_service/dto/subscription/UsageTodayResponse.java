package com.priyanshu.distributed_lovable.account_service.dto.subscription;

public record UsageTodayResponse(
        Integer tokenUsed,
        Integer tokenLimit,
        Integer previewRunning,
        Integer previewLimit
) {
}
