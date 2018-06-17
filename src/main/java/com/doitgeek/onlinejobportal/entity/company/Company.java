package com.doitgeek.onlinejobportal.entity.company;

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

import com.doitgeek.onlinejobportal.entity.job.JobPost;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "company")
public class Company implements Serializable {

	private static final long serialVersionUID = -2219944697775144199L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "profile_description")
	private String profileDescription;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "business_stream_id", referencedColumnName = "id")
	private BusinessStream businessStream;
	
	@Column(name = "establishment_date")
	private Date establishmentDate;
	
	@Column(name = "company_website_url")
	private String companyWebsiteURL;
	
	@JsonIgnore
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<CompanyImage> companyImages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<RecruiterProfile> recruiterProfiles;
	
	@JsonIgnore
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<JobPost> jobPosts;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getProfileDescription() {
		return profileDescription;
	}
	
	public void setProfileDescription(String profileDescription) {
		this.profileDescription = profileDescription;
	}
	
	public Date getEstablishmentDate() {
		return establishmentDate;
	}
	
	public void setEstablishmentDate(Date establishmentDate) {
		this.establishmentDate = establishmentDate;
	}
	
	public String getCompanyWebsiteURL() {
		return companyWebsiteURL;
	}
	
	public void setCompanyWebsiteURL(String companyWebsiteURL) {
		this.companyWebsiteURL = companyWebsiteURL;
	}

	public BusinessStream getBusinessStream() {
		return businessStream;
	}

	public void setBusinessStream(BusinessStream businessStream) {
		this.businessStream = businessStream;
	}

	public Set<CompanyImage> getCompanyImages() {
		return companyImages;
	}

	public void setCompanyImages(Set<CompanyImage> companyImages) {
		this.companyImages = companyImages;
	}

	public Set<RecruiterProfile> getRecruiterProfiles() {
		return recruiterProfiles;
	}

	public void setRecruiterProfiles(Set<RecruiterProfile> recruiterProfiles) {
		this.recruiterProfiles = recruiterProfiles;
	}

	public Set<JobPost> getJobPosts() {
		return jobPosts;
	}

	public void setJobPosts(Set<JobPost> jobPosts) {
		this.jobPosts = jobPosts;
	}
	
}
