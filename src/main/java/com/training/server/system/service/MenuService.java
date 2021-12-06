package com.training.server.system.service;

import com.training.server.system.dto.MenuDto;
import com.training.server.system.entity.Menu;
import com.training.server.system.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author andy
 * @date 2021/12/6
 */
@Service
public class MenuService {

    @Autowired
    private MenuMapper menuMapper;

    public MenuDto findById(long id) {
        Menu menu = menuMapper.selectByPrimaryKey(id).orElseGet(Menu::new);
        System.out.println(menu);
//        return menuMapper.toDto(menu);
        return null;
    }


}
