package com.hybrid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hybrid.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	public UserEntity findOneByEmail(String email);
}
