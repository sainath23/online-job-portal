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
import com.doitgeek.onlinejobportal.repository.user.UserAccountRepository;

@Service
public class EducationDetailService {

	@Autowired
	private EducationalDetailRepository educationalDetailRepository;
	
	@Autowired
	private UserAccountRepository userAccountRepository;
	
	private static final Logger LOGGER = LogManager.getLogger(EducationalDetailRepository.class);
	
	public List<EducationDetail> findAllEducationDetail() {
		return educationalDetailRepository.findAll();
	}
	
	public List<EducationDetail> findAllEducationDetailByUserAccount(Integer userAccountId) {
		return educationalDetailRepository.findByEducationDetailPrimaryKeyUserAccountId(userAccountId);
	}
	
	public EducationDetail findEducationDetailById(Integer userAccountId, String certificateDegreeName, String major) {
		try {
			UserAccount userAccount = userAccountRepository.findById(userAccountId).get();
			EducationDetailPrimaryKey id = new EducationDetailPrimaryKey();
			id.setUserAccount(userAccount);
			id.setCertificateDegreeName(certificateDegreeName);
			id.setMajor(major);
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
	
	public void deleteEducationDetail(EducationDetail educationDetail) {
		educationalDetailRepository.delete(educationDetail);
	}
}
