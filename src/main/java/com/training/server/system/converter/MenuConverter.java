package com.training.server.system.converter;

import com.training.server.BaseConverter;
import com.training.server.system.dto.MenuDto;
import com.training.server.system.entity.Menu;
import org.mapstruct.Mapper;

/**
 * @author andy
 * @date 2021/12/6
 */
@Mapper(componentModel = "spring")
public interface MenuConverter extends BaseConverter<Menu, MenuDto> {

}
