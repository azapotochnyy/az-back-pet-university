package com.university.task.fullstack.service;

import com.university.task.fullstack.dto.NotesDto;
import com.university.task.fullstack.model.Notes;

import java.util.List;


public interface NotesService {

    List<Notes> getUserNotesByUser(String userName);

    Notes createNotes(NotesDto notes, String userName);

}
