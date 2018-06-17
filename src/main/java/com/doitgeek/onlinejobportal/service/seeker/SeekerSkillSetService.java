package com.doitgeek.onlinejobportal.service.seeker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.seeker.SeekerSkillSet;
import com.doitgeek.onlinejobportal.entity.seeker.SeekerSkillSetPrimaryKey;
import com.doitgeek.onlinejobportal.entity.seeker.SkillSet;
import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.doitgeek.onlinejobportal.repository.seeker.SeekerSkillSetRepository;
import com.doitgeek.onlinejobportal.repository.seeker.SkillSetRepository;
import com.doitgeek.onlinejobportal.repository.user.UserAccountRepository;

@Service
public class SeekerSkillSetService {

	@Autowired
	private SeekerSkillSetRepository seekerSkillSetRepository;
	
	@Autowired
	private UserAccountRepository userAccountRepository;
	
	@Autowired
	private SkillSetRepository skillSetRepository;
	
	public SeekerSkillSet findAllSeekerSkillSetsById(Integer userAccountId, Integer skillSetId) {
		try {
			UserAccount userAccount = userAccountRepository.findById(userAccountId).get();
			SkillSet skillSet = skillSetRepository.findById(skillSetId).get();
			SeekerSkillSetPrimaryKey id = new SeekerSkillSetPrimaryKey();
			id.setUserAccount(userAccount);
			id.setSkillSet(skillSet);
			return seekerSkillSetRepository.findById(id).get();
		} 
		catch(Exception e) {
			return null;
		}
	}
	
	public List<SeekerSkillSet> findAllSeekerSkillSetsByUserAccountId(Integer userAccountId) {
		return seekerSkillSetRepository.findBySeekerSkillSetPrimaryKeyUserAccountId(userAccountId);
	}
	
	public void addSeekerSkillSet(SeekerSkillSet seekerSkillSet) {
		seekerSkillSetRepository.save(seekerSkillSet);
	}
	
	public void updateSeekerSkillSet(SeekerSkillSet seekerSkillSet) {
		seekerSkillSetRepository.save(seekerSkillSet);
	}
	
	public void deleteSeekerSkillSet(SeekerSkillSet seekerSkillSet) {
		seekerSkillSetRepository.delete(seekerSkillSet);
	}
}
