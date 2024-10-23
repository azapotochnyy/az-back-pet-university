package com.university.task.fullstack.controller;

import com.university.task.fullstack.dto.AuthRequest;
import com.university.task.fullstack.dto.ProfileDto;
import com.university.task.fullstack.model.UserInfo;
import com.university.task.fullstack.service.UserProfileService;
import com.university.task.fullstack.service.impl.JwtService;
import com.university.task.fullstack.service.impl.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserInfoService service;

    @Autowired
    private UserProfileService userProfileService;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/addNewUser")
    public ResponseEntity<?> addNewUser(@RequestBody UserInfo userInfo) {
        return new ResponseEntity<>(service.addUser(userInfo), HttpStatus.OK);
    }

    @GetMapping("/user/userProfile")
    public ResponseEntity<?> userProfile(Authentication authentication) {
        ProfileDto response = userProfileService.getUserProfileByUserName(authentication.getName());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/generateToken")
    public ResponseEntity<?> authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        if (authentication.isAuthenticated()) {
            UserInfo userInfo = service.getUserInfoByUserName(authRequest.getUsername());
            return new ResponseEntity<>(jwtService.generateToken(userInfo), HttpStatus.OK);
        } else {
            throw new UsernameNotFoundException("invalid user request !");
        }
    }

}