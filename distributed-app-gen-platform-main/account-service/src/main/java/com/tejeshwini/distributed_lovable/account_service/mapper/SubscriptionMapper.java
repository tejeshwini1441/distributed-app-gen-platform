package com.tejeshwini.distributed_lovable.account_service.mapper;

import com.tejeshwini.distributed_lovable.account_service.dto.subscription.PlanResponse;
import com.tejeshwini.distributed_lovable.account_service.dto.subscription.SubscriptionResponse;
import com.tejeshwini.distributed_lovable.account_service.entity.Plan;
import com.tejeshwini.distributed_lovable.account_service.entity.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanResponse toPlanResponse(Plan plan);
}
