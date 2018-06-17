package com.doitgeek.onlinejobportal.service.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.job.JobPost;
import com.doitgeek.onlinejobportal.entity.job.JobPostSkillSet;
import com.doitgeek.onlinejobportal.entity.job.JobPostSkillSetPrimaryKey;
import com.doitgeek.onlinejobportal.entity.seeker.SkillSet;
import com.doitgeek.onlinejobportal.repository.job.JobPostRepository;
import com.doitgeek.onlinejobportal.repository.job.JobPostSkillSetRepository;
import com.doitgeek.onlinejobportal.repository.seeker.SkillSetRepository;

@Service
public class JobPostSkillSetService {

	@Autowired
	private JobPostSkillSetRepository jobPostSkillSetRepository;
	
	@Autowired
	private SkillSetRepository skillSetRepository;
	
	@Autowired
	private JobPostRepository jobPostRepository;
	
	public List<JobPostSkillSet> findAllJobPostSkillSet() {
		return jobPostSkillSetRepository.findAll();
	}
	
	public JobPostSkillSet findJobPostSkillSetById(Integer skillSetId, Integer jobPostId) {
		try {
			SkillSet skillSet = skillSetRepository.findById(skillSetId).get();
			JobPost jobPost = jobPostRepository.findById(jobPostId).get();
			JobPostSkillSetPrimaryKey id = new JobPostSkillSetPrimaryKey();
			id.setSkillSet(skillSet);
			id.setJobPost(jobPost);
			return jobPostSkillSetRepository.findById(id).get();
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public void addJobPostSkillSet(JobPostSkillSet jobPostSkillSet) {
		jobPostSkillSetRepository.save(jobPostSkillSet);
	}
	
	public void updateJobPostSkillSet(JobPostSkillSet jobPostSkillSet) {
		jobPostSkillSetRepository.save(jobPostSkillSet);
	}
	
	public void deleteJobPostSkillSet(JobPostSkillSet jobPostSkillSet) {
		jobPostSkillSetRepository.delete(jobPostSkillSet);
	}
}
