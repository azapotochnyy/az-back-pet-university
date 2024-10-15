package com.university.task.fullstack.service.impl;

import com.university.task.fullstack.dto.AddToGroupRequestDto;
import com.university.task.fullstack.model.GroupOfUsers;
import com.university.task.fullstack.model.UserInfo;
import com.university.task.fullstack.repository.GroupRepository;
import com.university.task.fullstack.repository.UserInfoRepository;
import com.university.task.fullstack.service.GroupService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class GroupServiceImpl implements GroupService {

    GroupRepository groupRepository;
    UserInfoRepository userInfoRepository;


    @Override
    public GroupOfUsers createGroup(GroupOfUsers group) {
        return this.groupRepository.save(group);
    }

    @Override
    @Transactional
    public GroupOfUsers addUserToGroup(AddToGroupRequestDto requestDto) {
        List<UserInfo> users = userInfoRepository.findAll(requestDto.getUserIds());
        GroupOfUsers group = groupRepository.findById(requestDto.getGroupId()).get();
        users.stream().forEach(el->el.setGroup(group));
        group.getUsers().addAll(users);
        return groupRepository.save(group);
    }

    @Override
    public List<GroupOfUsers> getAllGroups(UUID ownerId) {
        return groupRepository.findAllByOwner(ownerId);
    }
}
