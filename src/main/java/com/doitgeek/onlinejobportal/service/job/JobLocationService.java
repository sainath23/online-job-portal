package com.doitgeek.onlinejobportal.service.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.job.JobLocation;
import com.doitgeek.onlinejobportal.repository.job.JobLocationRepository;

@Service
public class JobLocationService {

	@Autowired
	private JobLocationRepository jobLocationRepository;
	
	public List<JobLocation> findAllJobLocation() {
		return jobLocationRepository.findAll();
	}
	
	public JobLocation findJobLocationById(Integer id) {
		try {
			return jobLocationRepository.findById(id).get();
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public void addJobLocation(JobLocation jobLocation) {
		jobLocationRepository.save(jobLocation);
	}
	
	public void updateJobLocation(JobLocation jobLocation) {
		jobLocationRepository.save(jobLocation);
	}
	
	public void deleteJobLocationById(Integer id) {
		jobLocationRepository.deleteById(id);
	}
}
