package com.doitgeek.onlinejobportal.entity.job;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "job_type")
public class JobType implements Serializable {

	private static final long serialVersionUID = -4192630279177125120L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "job_type")
	private String jobType;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<JobPost> jobPosts;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getJobType() {
		return jobType;
	}
	
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public Set<JobPost> getJobPosts() {
		return jobPosts;
	}

	public void setJobPosts(Set<JobPost> jobPosts) {
		this.jobPosts = jobPosts;
	}
	
	
}
