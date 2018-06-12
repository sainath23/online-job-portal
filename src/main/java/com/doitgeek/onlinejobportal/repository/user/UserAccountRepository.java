package com.doitgeek.onlinejobportal.repository.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.doitgeek.onlinejobportal.entity.user.UserType;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {

	UserAccount findByEmail(String email);
	List<UserAccount> findByUserType(UserType userTypeId);
}
