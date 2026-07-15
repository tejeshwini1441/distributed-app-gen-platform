package com.priyanshu.distributed_lovable.common_lib.event;

public record FileStoreRequestEvent(
        Long projectId,
        String sagaId,
        String filePath,
        String content,
        Long userId
) {}