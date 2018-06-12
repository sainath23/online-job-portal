package com.doitgeek.onlinejobportal.entity.job;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.doitgeek.onlinejobportal.entity.seeker.SkillSet;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Embeddable
public class JobPostSkillSetPrimaryKey implements Serializable {

	private static final long serialVersionUID = -5458484912402868509L;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "skill_set_id", referencedColumnName = "id")
	private SkillSet skillSet;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "job_post_id", referencedColumnName = "id")
	private JobPost jobPost;

	public SkillSet getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(SkillSet skillSet) {
		this.skillSet = skillSet;
	}

	public JobPost getJobPost() {
		return jobPost;
	}

	public void setJobPost(JobPost jobPost) {
		this.jobPost = jobPost;
	}
	
	
}
