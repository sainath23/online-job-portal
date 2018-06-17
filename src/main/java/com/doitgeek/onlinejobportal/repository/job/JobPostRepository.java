package com.doitgeek.onlinejobportal.repository.job;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.job.JobPost;

public interface JobPostRepository extends JpaRepository<JobPost, Integer> {

}
