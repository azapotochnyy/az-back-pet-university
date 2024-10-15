package com.university.task.fullstack.service;

import com.university.task.fullstack.dto.MenuCreateRequestDto;
import com.university.task.fullstack.dto.MenuDto;
import com.university.task.fullstack.model.Menu;


public interface MenuService {

    Menu createMenu(MenuCreateRequestDto menu);

}
