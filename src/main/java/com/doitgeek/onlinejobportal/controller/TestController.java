package com.doitgeek.onlinejobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doitgeek.onlinejobportal.entity.seeker.SeekerSkillSet;
import com.doitgeek.onlinejobportal.service.seeker.SeekerSkillSetService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private SeekerSkillSetService seekerSkillSetService;
	
	@GetMapping("/{userAccountId}")
	public List<SeekerSkillSet> getAllSeekerSkillSetsByUserAccountId(@PathVariable Integer userAccountId) {
		return seekerSkillSetService.findAllSeekerSkillSetsByUserAccountId(userAccountId);
	}
	
	@GetMapping("/{userAccountId}/{skillSetId}")
	public SeekerSkillSet getAllSeekerSkillSetById(@PathVariable Integer userAccountId, @PathVariable Integer skillSetId) {
		return seekerSkillSetService.findAllSeekerSkillSetsById(userAccountId, skillSetId);
	}
}
