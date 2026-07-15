package com.tejeshwini.distributed_lovable.workspace_service.repository;

import com.tejeshwini.distributed_lovable.workspace_service.entity.ProcessedEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcessedEventRepository extends JpaRepository<ProcessedEvent, String> {
}
