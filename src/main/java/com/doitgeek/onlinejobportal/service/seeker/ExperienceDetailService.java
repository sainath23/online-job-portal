package com.doitgeek.onlinejobportal.service.seeker;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.seeker.ExperienceDetail;
import com.doitgeek.onlinejobportal.entity.seeker.ExperienceDetailPrimaryKey;
import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.doitgeek.onlinejobportal.repository.seeker.ExperienceDetailRepository;
import com.doitgeek.onlinejobportal.repository.user.UserAccountRepository;

@Service
public class ExperienceDetailService {

	@Autowired
	private ExperienceDetailRepository experienceDetailRepository;
	
	@Autowired
	private UserAccountRepository userAccountRepository;
	
	private static final Logger LOGGER = LogManager.getLogger(ExperienceDetailService.class);
	
	public List<ExperienceDetail> findAllExperienceDetail() {
		return experienceDetailRepository.findAll();
	}
	
	public List<ExperienceDetail> findAllExperienceDetailByUserAccountId(Integer userAccountId) {
		return experienceDetailRepository.findByExperienceDetailPrimaryKeyUserAccountId(userAccountId);
	}
	
	public ExperienceDetail findExperienceDetailById(Integer userAccountId, Date startDate, Date endDate) {
		try {
			UserAccount userAccount = userAccountRepository.findById(userAccountId).get();
			ExperienceDetailPrimaryKey id = new ExperienceDetailPrimaryKey();
			id.setUserAccount(userAccount);
			id.setStartDate(startDate);
			id.setEndDate(endDate);
			return experienceDetailRepository.findById(id).get();
		}
		catch(Exception e) {
			LOGGER.error(e.getMessage(), e);
			return null;
		}
	}
	
	public void addExperienceDetail(ExperienceDetail experienceDetail) {
		experienceDetailRepository.save(experienceDetail);
	}
	
	public void updateExperienceDetail(ExperienceDetail experienceDetail) {
		experienceDetailRepository.save(experienceDetail);
	}
	
	public void deleteExperienceDetail(ExperienceDetail experienceDetail) {
		experienceDetailRepository.delete(experienceDetail);
	}
}
