package com.drumond.backend.usercontext.repository;

import com.drumond.backend.usercontext.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  }