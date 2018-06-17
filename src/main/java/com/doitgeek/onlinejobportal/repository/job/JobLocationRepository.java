package com.doitgeek.onlinejobportal.repository.job;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.job.JobLocation;

public interface JobLocationRepository extends JpaRepository<JobLocation, Integer> {

}
