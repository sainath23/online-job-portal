package com.doitgeek.onlinejobportal.service.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.company.RecruiterProfile;
import com.doitgeek.onlinejobportal.repository.company.RecruiterProfileRepository;

@Service
public class RecruiterProfileService {

	@Autowired
	private RecruiterProfileRepository recruiterProfileRepository;
	
	public List<RecruiterProfile> findAllRecruiterProfile() {
		return recruiterProfileRepository.findAll();
	}
	
	public List<RecruiterProfile> findAllRecruiterProfileByCompanyId(Integer companyId) {
		return recruiterProfileRepository.findByCompanyId(companyId);
	}
	
	public RecruiterProfile findRecruiterProfileByUserAccountId(Integer userAccountId) {
		try {
			return recruiterProfileRepository.findByUserAccountId(userAccountId);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public void addRecruiterProfile(RecruiterProfile recruiterProfile) {
		recruiterProfileRepository.save(recruiterProfile);
	}
	
	public void updateRecruiterProfile(RecruiterProfile recruiterProfile) {
		recruiterProfileRepository.save(recruiterProfile);
	}
	
	public void deleteRecruiterProfile(RecruiterProfile recruiterProfile) {
		recruiterProfileRepository.delete(recruiterProfile);
	}
}
