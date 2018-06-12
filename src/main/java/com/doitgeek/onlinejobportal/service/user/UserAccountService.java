package com.doitgeek.onlinejobportal.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.doitgeek.onlinejobportal.entity.user.UserType;
import com.doitgeek.onlinejobportal.repository.user.UserAccountRepository;

@Service
public class UserAccountService {

	@Autowired
	private UserAccountRepository userAccountRepository;
	
	public List<UserAccount> findAllUserAccounts() {
		return userAccountRepository.findAll();
	}
	
	public List<UserAccount> findAllUserAccountsByUserType(UserType userType) {
		return userAccountRepository.findByUserType(userType);
	}
	
	public UserAccount findUserAccountById(Integer id) {
		try {
			return userAccountRepository.findById(id).get();
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void addUserAccount(UserAccount userAccount) {
		userAccountRepository.save(userAccount);
	}
	
	public void updateUserAccount(UserAccount userAccount) {
		userAccountRepository.save(userAccount);
	}
	
	public void deleteUserAccountById(Integer id) {
		userAccountRepository.deleteById(id);
	}
	
	public UserAccount findUserAccountByEmail(String email) {
		UserAccount userAccount = userAccountRepository.findByEmail(email); 
		if(userAccount != null) {
			return userAccount;
		}
		else {
			return null;
		}
	}
	
	public boolean isUserAccountExists(String email) {
		if(findUserAccountByEmail(email) != null) {
			return true;
		}
		else {
			return false;
		}
	}
}
