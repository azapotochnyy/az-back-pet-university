package com.university.task.fullstack.service.impl;

import com.university.task.fullstack.dto.ResponseDto;
import com.university.task.fullstack.model.UserInfo;
import com.university.task.fullstack.model.UserInfoDetails;
import com.university.task.fullstack.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserInfoService implements UserDetailsService {

    @Autowired
    private UserInfoRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<UserInfo> userDetail = repository.findByName(username);

        // Converting userDetail to UserDetails
        return userDetail.map(UserInfoDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
    }

    public UserInfo getUserInfoByUserName(String username) throws UsernameNotFoundException {

        Optional<UserInfo> userDetail = repository.findByName(username);

        if (userDetail.isPresent()) {
            return userDetail.get();
        } else {
            throw new UsernameNotFoundException("User not found " + username);
        }
    }


    public ResponseDto addUser(UserInfo userInfo) {
        userInfo.setPassword(encoder.encode(userInfo.getPassword()));
        userInfo.setUserIdentifier(UUID.randomUUID());
        repository.save(userInfo);
        return new ResponseDto("User Added Successfully");
    }


}
