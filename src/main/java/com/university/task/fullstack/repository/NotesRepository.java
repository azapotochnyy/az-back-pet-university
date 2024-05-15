package com.university.task.fullstack.repository;

import com.university.task.fullstack.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesRepository extends JpaRepository<Notes, Long> {
    @Query("select n from Notes n where n.userName = ?1")
    List<Notes> findAllByUserName(String userName);
}
