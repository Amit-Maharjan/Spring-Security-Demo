package com.maharjan.amit.SpringSecurityDemo.repo;

import com.maharjan.amit.SpringSecurityDemo.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
