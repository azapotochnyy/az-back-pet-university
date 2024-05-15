package com.university.task.fullstack.service.impl;

import com.university.task.fullstack.dto.NotesDto;
import com.university.task.fullstack.model.Notes;
import com.university.task.fullstack.repository.NotesRepository;
import com.university.task.fullstack.service.NotesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NotesServiceImpl implements NotesService {

    NotesRepository notesRepository;


    @Override
    public List<Notes> getUserNotesByUser(String userName) {
        return notesRepository.findAllByUserName(userName);
    }

    @Override
    public Notes createNotes(NotesDto notes, String username) {
        Notes noteToCreate = new Notes();
        noteToCreate.setText(notes.getText());
        noteToCreate.setDate(notes.getDate());
        noteToCreate.setUserName(username);
        return notesRepository.save(noteToCreate);
    }

}
