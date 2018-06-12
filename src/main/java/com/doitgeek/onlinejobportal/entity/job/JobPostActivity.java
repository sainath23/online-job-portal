package com.doitgeek.onlinejobportal.entity.job;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "job_post_activity")
public class JobPostActivity {
	
	@EmbeddedId
	private JobPostActivityPrimaryKey jobPostActivityPrimaryKey;
	
	@Column(name = "apply_date")
	private Date applyDate;

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public JobPostActivityPrimaryKey getJobPostActivityPrimaryKey() {
		return jobPostActivityPrimaryKey;
	}

	public void setJobPostActivityPrimaryKey(JobPostActivityPrimaryKey jobPostActivityPrimaryKey) {
		this.jobPostActivityPrimaryKey = jobPostActivityPrimaryKey;
	}
	
	
}
