package com.doitgeek.onlinejobportal.entity.job;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.doitgeek.onlinejobportal.entity.company.Company;
import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "job_post")
public class JobPost implements Serializable {

	private static final long serialVersionUID = 5810601566230257605L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "posted_by_id", referencedColumnName = "id")
	private UserAccount userAccount;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "job_type_id", referencedColumnName = "id")
	private JobType jobType;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	private Company company;
	
	@Column(name = "is_company_name_hidden")
	private Character isCompanyNameHidden;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "job_description")
	private String jobDescription;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "job_location_id", referencedColumnName = "id")
	private JobLocation jobLocation;
	
	@Column(name = "is_active")
	private Character isActive;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobPostSkillSetPrimaryKey.jobPost", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<JobPostSkillSet> jobPostSkillSets;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobPostActivityPrimaryKey.jobPost", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<JobPostActivity> jobPostActivities;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Character getIsCompanyNameHidden() {
		return isCompanyNameHidden;
	}
	
	public void setIsCompanyNameHidden(Character isCompanyNameHidden) {
		this.isCompanyNameHidden = isCompanyNameHidden;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getJobDescription() {
		return jobDescription;
	}
	
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public Character getIsActive() {
		return isActive;
	}
	
	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public JobType getJobType() {
		return jobType;
	}

	public void setJobType(JobType jobType) {
		this.jobType = jobType;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public JobLocation getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(JobLocation jobLocation) {
		this.jobLocation = jobLocation;
	}

	public Set<JobPostSkillSet> getJobPostSkillSets() {
		return jobPostSkillSets;
	}

	public void setJobPostSkillSets(Set<JobPostSkillSet> jobPostSkillSets) {
		this.jobPostSkillSets = jobPostSkillSets;
	}

	public Set<JobPostActivity> getJobPostActivities() {
		return jobPostActivities;
	}

	public void setJobPostActivities(Set<JobPostActivity> jobPostActivities) {
		this.jobPostActivities = jobPostActivities;
	}
	
}
