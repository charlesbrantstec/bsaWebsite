package com.bsa.bsaWebsite.repositories;

import com.bsa.bsaWebsite.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getOne(long id);
    User findByUsername(String username);
}
