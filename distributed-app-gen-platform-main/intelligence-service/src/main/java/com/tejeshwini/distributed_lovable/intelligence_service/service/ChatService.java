package com.tejeshwini.distributed_lovable.intelligence_service.service;


import com.tejeshwini.distributed_lovable.intelligence_service.dto.chat.ChatResponse;

import java.util.List;

public interface ChatService {

    List<ChatResponse> getProjectChatHistory(Long projectId);
}
