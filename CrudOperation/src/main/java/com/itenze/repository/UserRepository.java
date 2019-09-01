package com.itenze.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itenze.entity.UserRole;

@Repository
public interface UserRepository extends JpaRepository<UserRole, Serializable> {

	
	UserRole findByRoleName(String role);
}
