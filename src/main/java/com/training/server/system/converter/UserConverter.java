package com.training.server.system.converter;

import com.training.server.BaseConverter;
import com.training.server.system.dto.UserDto;
import com.training.server.system.entity.User;
import org.mapstruct.Mapper;

/**
 * @author andy
 * @date 2021/12/6
 */
@Mapper(componentModel = "spring")
public interface UserConverter extends BaseConverter<User, UserDto> {

}
