package com.university.task.fullstack.service.impl;

import com.university.task.fullstack.dto.MenuCreateRequestDto;
import com.university.task.fullstack.dto.MenuDto;
import com.university.task.fullstack.model.Menu;
import com.university.task.fullstack.model.UserInfo;
import com.university.task.fullstack.repository.MenuRepository;
import com.university.task.fullstack.repository.UserInfoRepository;
import com.university.task.fullstack.service.MenuService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class MenuServiceImpl implements MenuService {

    MenuRepository menuRepository;
    UserInfoRepository userInfoRepository;


    @Override
    public Menu createMenu(MenuCreateRequestDto menu) {
        List<UserInfo> users = userInfoRepository.findAll(menu.getUserIdentificators());
        MenuDto menuDto = menu.getMenu();
        Menu newMenu = new Menu();
        newMenu.setName(menuDto.getName());
        newMenu.setBreakfast(menuDto.getBreakfast());
        newMenu.setLunchOne(menuDto.getLunchOne());
        newMenu.setDinner(menuDto.getDinner());
        newMenu.setLunchTwo(menuDto.getLunchTwo());
        newMenu.setSupper(menuDto.getSupper());
        newMenu.setLunchThree(menuDto.getLunchThree());
        newMenu.setDate(menuDto.getDate());
        newMenu.setUsers(users);
        return menuRepository.save(newMenu);
    }

    @Override
    public List<Menu> getMenuByUserId(String name) {
        UserInfo userDetail = userInfoRepository.findByName(name).get();
        return menuRepository.findAllByUserId(userDetail.getId());
    }

}
