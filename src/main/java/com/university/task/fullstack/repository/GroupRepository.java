package com.university.task.fullstack.repository;

import com.university.task.fullstack.model.GroupOfUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface GroupRepository extends JpaRepository<GroupOfUsers, Long> {

    List<GroupOfUsers> findAllByOwner(UUID owner);

    @Override
    Optional<GroupOfUsers> findById(Long aLong);
}
