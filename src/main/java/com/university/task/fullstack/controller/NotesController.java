package com.university.task.fullstack.controller;

import com.university.task.fullstack.dto.NotesDto;
import com.university.task.fullstack.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/notes")
public class NotesController {

    @Autowired
    private NotesService service;

    @GetMapping()
    public ResponseEntity<?> getNotes(Authentication authentication) {
        return new ResponseEntity<>(service.getUserNotesByUser(authentication.getName()), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createNotes(@RequestBody NotesDto notesDto,Authentication authentication) {
        return new ResponseEntity<>(service.createNotes(notesDto,authentication.getName()), HttpStatus.OK);
    }

}