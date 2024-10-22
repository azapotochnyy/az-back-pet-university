package com.university.task.fullstack.controller;

import com.university.task.fullstack.dto.MenuCreateRequestDto;
import com.university.task.fullstack.service.MenuService;
import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/menu")
public class MenuController {

    @Autowired
    private MenuService service;

    @GetMapping()
    public ResponseEntity<?> getMenu(Authentication authentication) {
        return new ResponseEntity<>(service.getMenuByUserId(authentication.getName()), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createMenu(@RequestBody MenuCreateRequestDto menuDTO) {
        return new ResponseEntity<>(service.createMenu(menuDTO), HttpStatus.OK);
    }

}