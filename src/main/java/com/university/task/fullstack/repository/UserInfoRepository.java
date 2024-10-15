package com.university.task.fullstack.repository;

import com.university.task.fullstack.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    Optional<UserInfo> findByName(String username);

    @Query("from UserInfo u where u.userIdentifier in :ids")
    List<UserInfo> findAll(@Param("ids") Iterable<UUID> ids);
}
