package com.GreenStitch.GreenStitch.repository;

import com.GreenStitch.GreenStitch.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends CrudRepository<Role, String> {

    Optional<Object> findByRoleName(String user);
}