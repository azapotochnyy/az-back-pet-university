package com.university.task.fullstack.controller;

import com.university.task.fullstack.dto.AddToGroupRequestDto;
import com.university.task.fullstack.model.GroupOfUsers;
import com.university.task.fullstack.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/group")
public class GroupController {

    private GroupService service;

    @Autowired
    public GroupController(GroupService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public List<GroupOfUsers> getGroups(@PathVariable UUID id) {
        return service.getAllGroups(id);
    }

    @PostMapping()
    public GroupOfUsers create( @RequestBody GroupOfUsers group) {
        return service.createGroup(group);
    }

    @PostMapping("/add")
    public GroupOfUsers addUserToGroup( @RequestBody AddToGroupRequestDto requestDto) {
        return service.addUserToGroup(requestDto);
    }

}