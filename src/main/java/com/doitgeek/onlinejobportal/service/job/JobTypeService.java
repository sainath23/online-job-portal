package com.doitgeek.onlinejobportal.service.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.job.JobType;
import com.doitgeek.onlinejobportal.repository.job.JobTypeRepository;

@Service
public class JobTypeService {

	@Autowired
	private JobTypeRepository jobTypeRepository;
	
	public List<JobType> findAllJobType() {
		return jobTypeRepository.findAll();
	}
	
	public JobType findJobTypeById(Integer id) {
		try {
			return jobTypeRepository.findById(id).get();
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public void addJobType(JobType jobType) {
		jobTypeRepository.save(jobType);
	}
	
	public void updateJobType(JobType jobType) {
		jobTypeRepository.save(jobType);
	}
	
	public void deleteJobTypeById(Integer id) {
		jobTypeRepository.deleteById(id);
	}
}
