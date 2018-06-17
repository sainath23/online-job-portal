package com.doitgeek.onlinejobportal.entity.seeker;

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

import com.doitgeek.onlinejobportal.entity.job.JobPostSkillSet;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "skill_set")
public class SkillSet implements Serializable {

	private static final long serialVersionUID = 8827431801037055584L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "skill_set_name")
	private String skillSetName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "seekerSkillSetPrimaryKey.skillSet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<SeekerSkillSet> seekerSkillSets;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobPostSkillSetPrimaryKey.skillSet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<JobPostSkillSet> jobPostSkillSets;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getSkillSetName() {
		return skillSetName;
	}
	
	public void setSkillSetName(String skillSetName) {
		this.skillSetName = skillSetName;
	}

	public Set<SeekerSkillSet> getSeekerSkillSets() {
		return seekerSkillSets;
	}

	public void setSeekerSkillSets(Set<SeekerSkillSet> seekerSkillSets) {
		this.seekerSkillSets = seekerSkillSets;
	}

	public Set<JobPostSkillSet> getJobPostSkillSets() {
		return jobPostSkillSets;
	}

	public void setJobPostSkillSets(Set<JobPostSkillSet> jobPostSkillSets) {
		this.jobPostSkillSets = jobPostSkillSets;
	}
	
	
}
