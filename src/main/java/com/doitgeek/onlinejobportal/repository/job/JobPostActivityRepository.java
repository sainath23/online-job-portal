package com.doitgeek.onlinejobportal.repository.job;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.job.JobPostActivity;
import com.doitgeek.onlinejobportal.entity.job.JobPostActivityPrimaryKey;

public interface JobPostActivityRepository extends JpaRepository<JobPostActivity, JobPostActivityPrimaryKey> {

}
