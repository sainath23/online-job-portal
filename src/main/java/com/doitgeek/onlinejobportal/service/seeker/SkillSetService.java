package com.doitgeek.onlinejobportal.service.seeker;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.seeker.SkillSet;
import com.doitgeek.onlinejobportal.repository.seeker.SkillSetRepository;

@Service
public class SkillSetService {

	@Autowired
	private SkillSetRepository skillSetRepository;
	
	private static final Logger LOGGER = LogManager.getLogger(SkillSetService.class);
	
	public List<SkillSet> findAllSkillSet() {
		List<SkillSet> skillSets = new ArrayList<>();
		skillSetRepository.findAll().forEach(skillSets::add);
		return skillSets;
	}
	
	public SkillSet findSkillSetById(Integer id) {
		try {
			return skillSetRepository.findById(id).get();
		}
		catch(Exception e) {
			LOGGER.error(e.getMessage(), e);
			return null;
		}
	}
	
	public void addSkillSet(SkillSet skillSet) {
		skillSetRepository.save(skillSet);
	}
	
	public void updateSkillSet(SkillSet skillSet) {
		skillSetRepository.save(skillSet);
	}
	
	public void deleteSkillSetById(Integer id) {
		skillSetRepository.deleteById(id);
	}
}
