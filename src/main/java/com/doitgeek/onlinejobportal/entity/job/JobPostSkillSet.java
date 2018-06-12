package com.doitgeek.onlinejobportal.entity.job;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "job_post_skill_set")
public class JobPostSkillSet {

	@EmbeddedId
	private JobPostSkillSetPrimaryKey jobPostSkillSetPrimaryKey;
	
	@Column(name = "skill_level")
	private Integer skillLevel;

	public Integer getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(Integer skillLevel) {
		this.skillLevel = skillLevel;
	}

	public JobPostSkillSetPrimaryKey getJobPostSkillSetPrimaryKey() {
		return jobPostSkillSetPrimaryKey;
	}

	public void setJobPostSkillSetPrimaryKey(JobPostSkillSetPrimaryKey jobPostSkillSetPrimaryKey) {
		this.jobPostSkillSetPrimaryKey = jobPostSkillSetPrimaryKey;
	}
	
	
}
