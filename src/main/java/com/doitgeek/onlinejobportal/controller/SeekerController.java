package com.doitgeek.onlinejobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doitgeek.onlinejobportal.entity.seeker.EducationDetail;
import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.doitgeek.onlinejobportal.service.seeker.EducationDetailService;
import com.doitgeek.onlinejobportal.service.user.UserAccountService;

@RestController
@RequestMapping("/rest/seeker")
public class SeekerController {

	/*@Autowired
	private UserAccountService userAccountService;
	
	@Autowired
	private EducationDetailService educationDetailService;*/
	
	/*@GetMapping("/{userAccountId}")
	public ResponseEntity<List<EducationDetail>> getAllEducationDetailByUserAccountId(@PathVariable Integer userAccountId) {
		UserAccount userAccount = userAccountService.findUserAccountById(userAccountId);
		List<EducationDetail> educationDetails = educationDetailService.findAllEducationDetailByUserAccount(userAccount);
		if(educationDetails.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<EducationDetail>>(educationDetails, HttpStatus.OK);
	}*/
	
	/*@PostMapping("/{userAccountId}")
	public ResponseEntity<EducationDetail> getEducationDetailById(@PathVariable Integer userAccountId, String degreeName) {
		UserAccount userAccount = userAccountService.findUserAccountById(userAccountId);
		
		return null;
	}*/
}
