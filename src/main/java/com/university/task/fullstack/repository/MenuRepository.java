package com.university.task.fullstack.repository;

import com.university.task.fullstack.model.Menu;
import com.university.task.fullstack.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

    @Query("select n from Menu n join fetch n.users ui where ui.id = ?1")
    List<Menu> findAllByUserId(Long userIdentifier);

}
