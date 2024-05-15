package com.university.task.fullstack.service.impl;

import com.university.task.fullstack.dto.ProfileDto;
import com.university.task.fullstack.model.UserInfo;
import com.university.task.fullstack.service.UserProfileService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserProfileServiceImpl implements UserProfileService {

    UserInfoService service;

    @Override
    public ProfileDto getUserProfileByUserName(String userName) {
        UserInfo userInfo = service.getUserInfoByUserName(userName);
        ProfileDto profile = ProfileDto.builder().
                name(userInfo.getName()).
                userSurName(userInfo.getUserSurName()).
                email(userInfo.getEmail()).
                userName(userInfo.getUserName())
                .build();
        return profile;
    }
}
