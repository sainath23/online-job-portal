package com.doitgeek.onlinejobportal.repository.job;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.job.JobPostSkillSet;
import com.doitgeek.onlinejobportal.entity.job.JobPostSkillSetPrimaryKey;

public interface JobPostSkillSetRepository extends JpaRepository<JobPostSkillSet, JobPostSkillSetPrimaryKey> {

}
