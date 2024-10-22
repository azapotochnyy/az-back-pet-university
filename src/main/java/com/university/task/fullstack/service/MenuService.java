package com.university.task.fullstack.service;

import com.university.task.fullstack.dto.MenuCreateRequestDto;
import com.university.task.fullstack.dto.MenuDto;
import com.university.task.fullstack.model.Menu;

import java.util.List;


public interface MenuService {

    Menu createMenu(MenuCreateRequestDto menu);
    List<Menu> getMenuByUserId(String name);
}
