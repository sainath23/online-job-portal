package com.doitgeek.onlinejobportal.service.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.job.JobPost;
import com.doitgeek.onlinejobportal.repository.job.JobPostRepository;

@Service
public class JobPostService {

	@Autowired
	private JobPostRepository jobPostRepository;
	
	public List<JobPost> findAllJobPost() {
		return jobPostRepository.findAll();
	}
	
	public JobPost findJobPostById(Integer id) {
		try {
			return jobPostRepository.findById(id).get();
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public void addJobPost(JobPost jobPost) {
		jobPostRepository.save(jobPost);
	}
	
	public void updateJobPost(JobPost jobPost) {
		jobPostRepository.save(jobPost);
	}
	
	public void deleteJobPostById(Integer id) {
		jobPostRepository.deleteById(id);
	}
}
