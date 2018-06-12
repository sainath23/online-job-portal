package com.doitgeek.onlinejobportal.service.seeker;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.seeker.SeekerProfile;
import com.doitgeek.onlinejobportal.repository.seeker.SeekerProfileRepository;

@Service
public class SeekerProfileService {
	
	@Autowired
	private SeekerProfileRepository seekerProfileRepository;
	
	private static final Logger logger = LogManager.getLogger(SeekerProfileService.class);

	public List<SeekerProfile> findAllSeekerProfile() {
		List<SeekerProfile> seekerProfiles = new ArrayList<>();
		seekerProfileRepository.findAll().forEach(seekerProfiles::add);
		return seekerProfiles;
	}
	
	public SeekerProfile findSeekerProfileByUserAccountId(Integer userAccountId) {
		try {
			return seekerProfileRepository.findById(userAccountId).get();
		}
		catch(Exception e) {
			logger.error(e.getMessage(), e);
			return null;
		}
	}
	
	public void addSeekerProfile(SeekerProfile seekerProfile) {
		seekerProfileRepository.save(seekerProfile);
	}
	
	public void updateSeekerProfile(SeekerProfile seekerProfile) {
		seekerProfileRepository.save(seekerProfile);
	}
	
	public void deleteSeekerProfile(Integer userAccountId) {
		seekerProfileRepository.deleteById(userAccountId);
	}
	
	
}
