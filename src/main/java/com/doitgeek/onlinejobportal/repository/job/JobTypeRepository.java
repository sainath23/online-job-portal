package com.doitgeek.onlinejobportal.repository.job;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.job.JobType;

public interface JobTypeRepository extends JpaRepository<JobType, Integer> {

}
