package com.university.task.fullstack.service;

import com.university.task.fullstack.dto.ProfileDto;

public interface UserProfileService {
    ProfileDto getUserProfileByUserName(String userName);
}
