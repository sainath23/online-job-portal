package com.doitgeek.onlinejobportal.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.doitgeek.onlinejobportal.entity.user.UserType;
import com.doitgeek.onlinejobportal.service.user.UserAccountService;
import com.doitgeek.onlinejobportal.service.user.UserTypeService;

@RestController
@RequestMapping("/rest/users/{userTypeId}")
public class UserController {

	@Autowired
	private UserAccountService userAccountService;
	@Autowired
	private UserTypeService userTypeService;
	
	final static Logger logger = LogManager.getLogger(UserController.class);
	
	@GetMapping("/all")
	public ResponseEntity<List<UserAccount>> getAllUserAccounts() {
		List<UserAccount> userAccounts = userAccountService.findAllUserAccounts();
		if(userAccounts.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<UserAccount>>(userAccounts, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<UserAccount>> getAllUserAccountByUserTypeId(@PathVariable Integer userTypeId) {
		UserType userType = userTypeService.findUserTypeById(userTypeId); 
		List<UserAccount> userAccounts = userAccountService.findAllUserAccountsByUserType(userType);
		if(userAccounts.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<UserAccount>>(userAccounts, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserAccount> getUserAccountById(@PathVariable Integer id) {
		UserAccount userAccount = userAccountService.findUserAccountById(id);
		if(userAccount == null) {
			return new ResponseEntity<UserAccount>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<UserAccount>(userAccount, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Boolean> addUserAccount(@RequestBody UserAccount userAccount, @PathVariable Integer userTypeId) {
		if(userAccountService.isUserAccountExists(userAccount.getEmail())) {
			return new ResponseEntity<Boolean>(false, HttpStatus.CONFLICT);
		}
		UserType userType = userTypeService.findUserTypeById(userTypeId);
		userAccount.setUserType(userType);
		userAccountService.addUserAccount(userAccount);
		return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Boolean> updateUserAccount(@PathVariable Integer id, @RequestBody UserAccount userAccount, 
														@PathVariable Integer userTypeId) {
		if(!id.equals(userAccount.getId())) {
			logger.error("Acc id not equal " + userAccount.getId());
			return new ResponseEntity<Boolean>(false, HttpStatus.NOT_FOUND);
		}
		UserType userType = userTypeService.findUserTypeById(userTypeId);
		userAccount.setUserType(userType);
		userAccountService.updateUserAccount(userAccount);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteUserAccount(@PathVariable Integer id) {
		UserAccount userAccount = userAccountService.findUserAccountById(id);
		if(userAccount == null) {
			return new ResponseEntity<Boolean>(false, HttpStatus.NOT_FOUND);
		}
		userAccountService.deleteUserAccountById(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.NO_CONTENT);
	}
	
	
}
