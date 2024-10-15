package com.university.task.fullstack.service;

import com.university.task.fullstack.dto.AddToGroupRequestDto;
import com.university.task.fullstack.model.GroupOfUsers;

import java.util.List;
import java.util.UUID;

public interface GroupService {

    GroupOfUsers createGroup(GroupOfUsers group);

    GroupOfUsers addUserToGroup(AddToGroupRequestDto requestDto);

    List<GroupOfUsers> getAllGroups(UUID ownerId);
}
