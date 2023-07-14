package com.GreenStitch.GreenStitch.service;

import com.GreenStitch.GreenStitch.model.Role;
import com.GreenStitch.GreenStitch.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepo roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}