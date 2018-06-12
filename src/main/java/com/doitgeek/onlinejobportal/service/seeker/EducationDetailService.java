package com.doitgeek.onlinejobportal.service.seeker;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.seeker.EducationDetail;
import com.doitgeek.onlinejobportal.entity.seeker.EducationDetailPrimaryKey;
import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.doitgeek.onlinejobportal.repository.seeker.EducationalDetailRepository;

@Service
public class EducationDetailService {

	@Autowired
	private EducationalDetailRepository educationalDetailRepository;
	
	private static final Logger LOGGER = LogManager.getLogger(EducationalDetailRepository.class);
	
	public List<EducationDetail> findAllEducationDetail() {
		return educationalDetailRepository.findAll();
	}
	
	/*public List<EducationDetail> findAllEducationDetailByUserAccount(UserAccount userAccount) {
		return educationalDetailRepository.findByUserAccount(userAccount);
	}*/
	
	public EducationDetail findEducationDetailById(EducationDetailPrimaryKey id) {
		try {
			return educationalDetailRepository.findById(id).get();
		}
		catch(Exception e) {
			LOGGER.error(e.getMessage(), e);
			return null;
		}
	}
	
	public void addEducationDetail(EducationDetail educationDetail) {
		educationalDetailRepository.save(educationDetail);
	}
	
	public void updateEducationDetail(EducationDetail educationDetail) {
		educationalDetailRepository.save(educationDetail);
	}
	
	public void deleteEducationDetailById(EducationDetailPrimaryKey id) {
		educationalDetailRepository.deleteById(id);
	}
}
