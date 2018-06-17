package com.doitgeek.onlinejobportal.service.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.job.JobPost;
import com.doitgeek.onlinejobportal.entity.job.JobPostActivity;
import com.doitgeek.onlinejobportal.entity.job.JobPostActivityPrimaryKey;
import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.doitgeek.onlinejobportal.repository.job.JobPostActivityRepository;
import com.doitgeek.onlinejobportal.repository.job.JobPostRepository;
import com.doitgeek.onlinejobportal.repository.user.UserAccountRepository;

@Service
public class JobPostActivityService {

	@Autowired
	private JobPostActivityRepository jobPostActivityRepository;
	
	@Autowired
	private UserAccountRepository userAccountRepository;
	
	@Autowired
	private JobPostRepository jobPostRepository;
	
	public List<JobPostActivity> findAllJobPostActivity() {
		return jobPostActivityRepository.findAll();
	}
	
	public JobPostActivity findJobPostActivityById(Integer userAccountId, Integer jobPostId) {
		try {
			UserAccount userAccount = userAccountRepository.findById(userAccountId).get();
			JobPost jobPost = jobPostRepository.findById(jobPostId).get();
			JobPostActivityPrimaryKey id = new JobPostActivityPrimaryKey();
			id.setUserAccount(userAccount);
			id.setJobPost(jobPost);
			return jobPostActivityRepository.findById(id).get();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public void addJobPostActivity(JobPostActivity jobPostActivity) {
		jobPostActivityRepository.save(jobPostActivity);
	}
	
	public void updateJobPostActivity(JobPostActivity jobPostActivity) {
		jobPostActivityRepository.save(jobPostActivity);
	}

	public void deleteJobPostActivity(JobPostActivity jobPostActivity) {
		jobPostActivityRepository.delete(jobPostActivity);
	}
}
