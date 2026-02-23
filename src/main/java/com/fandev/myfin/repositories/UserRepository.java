package com.fandev.myfin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fandev.myfin.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
