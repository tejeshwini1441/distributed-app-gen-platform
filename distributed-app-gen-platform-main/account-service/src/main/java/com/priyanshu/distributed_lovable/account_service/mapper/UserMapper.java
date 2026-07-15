package com.priyanshu.distributed_lovable.account_service.mapper;

import com.priyanshu.distributed_lovable.account_service.dto.auth.SignupRequest;
import com.priyanshu.distributed_lovable.account_service.dto.auth.UserProfileResponse;
import com.priyanshu.distributed_lovable.account_service.entity.User;
import com.priyanshu.distributed_lovable.common_lib.dto.UserDto;
import com.priyanshu.distributed_lovable.common_lib.security.JwtUserPrincipal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    User toEntity(SignupRequest signupRequest);

    @Mapping(source = "userId", target = "id")
    UserProfileResponse toUserProfileResponse(JwtUserPrincipal user);

    UserDto toUserDto(User user);

}
