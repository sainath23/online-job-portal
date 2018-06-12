package com.doitgeek.onlinejobportal.service.seeker;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.seeker.ExperienceDetail;
import com.doitgeek.onlinejobportal.repository.seeker.ExperienceDetailRepository;

@Service
public class ExperienceDetailService {

	@Autowired
	private ExperienceDetailRepository experienceDetailRepository;
	
	private static final Logger LOGGER = LogManager.getLogger(ExperienceDetailService.class);
	
	public List<ExperienceDetail> findAllExperienceDetail() {
		return experienceDetailRepository.findAll();
	}
	
	//public List<Exper>
}
