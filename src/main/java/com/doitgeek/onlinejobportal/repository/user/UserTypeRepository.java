package com.doitgeek.onlinejobportal.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.user.UserType;

public interface UserTypeRepository extends JpaRepository<UserType, Integer> {

	
}
