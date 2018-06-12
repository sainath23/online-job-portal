package com.doitgeek.onlinejobportal.entity.seeker;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "experience_detail")
public class ExperienceDetail {

	@EmbeddedId
	private ExperienceDetailPrimaryKey experienceDetailPrimaryKey;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "job_title")
	private String jobTitle;
	
	private String description;
	
	@Column(name = "is_current_job")
	private Character isCurrentJob;
	
	@Column(name = "job_location_city")
	private String jobLocationCity;
	
	@Column(name = "job_location_state")
	private String jobLocationState;
	
	@Column(name = "job_location_country")
	private String jobLocationCountry;

	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Character getIsCurrentJob() {
		return isCurrentJob;
	}
	
	public void setIsCurrentJob(Character isCurrentJob) {
		this.isCurrentJob = isCurrentJob;
	}
	
	public String getJobLocationCity() {
		return jobLocationCity;
	}
	
	public void setJobLocationCity(String jobLocationCity) {
		this.jobLocationCity = jobLocationCity;
	}
	
	public String getJobLocationState() {
		return jobLocationState;
	}
	
	public void setJobLocationState(String jobLocationState) {
		this.jobLocationState = jobLocationState;
	}
	
	public String getJobLocationCountry() {
		return jobLocationCountry;
	}
	
	public void setJobLocationCountry(String jobLocationCountry) {
		this.jobLocationCountry = jobLocationCountry;
	}

	public ExperienceDetailPrimaryKey getExperienceDetailPrimaryKey() {
		return experienceDetailPrimaryKey;
	}

	public void setExperienceDetailPrimaryKey(ExperienceDetailPrimaryKey experienceDetailPrimaryKey) {
		this.experienceDetailPrimaryKey = experienceDetailPrimaryKey;
	}
	
	
}
