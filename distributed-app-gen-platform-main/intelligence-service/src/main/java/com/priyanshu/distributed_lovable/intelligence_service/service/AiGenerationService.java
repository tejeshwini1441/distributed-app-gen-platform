package com.priyanshu.distributed_lovable.intelligence_service.service;

import com.priyanshu.distributed_lovable.intelligence_service.dto.chat.StreamResponse;
import reactor.core.publisher.Flux;

public interface AiGenerationService {
    Flux<StreamResponse> streamResponse(String message, Long projectId);
}
