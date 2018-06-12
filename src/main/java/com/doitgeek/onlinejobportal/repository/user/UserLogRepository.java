package com.doitgeek.onlinejobportal.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.user.UserLog;

public interface UserLogRepository extends JpaRepository<UserLog, Integer> {

}
