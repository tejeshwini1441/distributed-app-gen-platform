package com.priyanshu.distributed_lovable.account_service.mapper;

import com.priyanshu.distributed_lovable.account_service.dto.subscription.PlanResponse;
import com.priyanshu.distributed_lovable.account_service.dto.subscription.SubscriptionResponse;
import com.priyanshu.distributed_lovable.account_service.entity.Plan;
import com.priyanshu.distributed_lovable.account_service.entity.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanResponse toPlanResponse(Plan plan);
}
