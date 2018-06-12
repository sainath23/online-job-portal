package com.doitgeek.onlinejobportal.service.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.user.UserLog;
import com.doitgeek.onlinejobportal.repository.user.UserLogRepository;

@Service
public class UserLogService {

	private UserLogRepository userLogRepository;
	
	public List<UserLog> findAllUserLogs() {
		List<UserLog> userLogs = new ArrayList<>();
		userLogRepository.findAll().forEach(userLogs::add);
		return userLogs;
	}
	
	public UserLog findUserLogById(Integer id) {
		try {
			return userLogRepository.findById(id).get();
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void addUserLog(UserLog userLog) {
		userLogRepository.save(userLog);
	}
	
	public void updateUserLog(UserLog userLog) {
		userLogRepository.save(userLog);
	}
	
	public void deleteUserLogById(Integer id) {
		userLogRepository.deleteById(id);
	}
}
