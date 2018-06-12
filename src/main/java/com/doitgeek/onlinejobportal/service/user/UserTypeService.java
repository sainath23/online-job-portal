package com.doitgeek.onlinejobportal.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.user.UserType;
import com.doitgeek.onlinejobportal.repository.user.UserTypeRepository;

@Service
public class UserTypeService {

	@Autowired
	private UserTypeRepository userTypeRepository;
	
	public List<UserType> findAllUserTypes() {
		return userTypeRepository.findAll();
	}
	
	public UserType findUserTypeById(Integer id) {
		try {
			return userTypeRepository.findById(id).get();
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void addUserType(UserType userType) {
		userTypeRepository.save(userType);
	}
	
	public void updateUserType(UserType userType) {
		userTypeRepository.save(userType);
	}
	
	public void deleteUserTypeById(Integer id) {
		userTypeRepository.deleteById(id);
	}
}
