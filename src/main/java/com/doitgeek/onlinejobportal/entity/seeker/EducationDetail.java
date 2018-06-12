package com.doitgeek.onlinejobportal.entity.seeker;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "education_detail")
public class EducationDetail {
	
	@EmbeddedId
	private EducationDetailPrimaryKey educationDetailPrimaryKey;
	
	@Column(name = "institute_university_name")
	private String instituteUniversityName;
	
	@Column(name = "starting_date")
	private Date startingDate;
	
	@Column(name = "completion_date")
	private Date completionDate;
	
	@Column(name = "percentage")
	private Double percentage;
	
	@Column(name = "cgpa")
	private Double cgpa;
	
	public String getInstituteUniversityName() {
		return instituteUniversityName;
	}
	
	public void setInstituteUniversityName(String instituteUniversityName) {
		this.instituteUniversityName = instituteUniversityName;
	}
	
	public Date getStartingDate() {
		return startingDate;
	}
	
	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
	
	public Date getCompletionDate() {
		return completionDate;
	}
	
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}
	
	public Double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	
	public Double getCgpa() {
		return cgpa;
	}
	
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}

	public EducationDetailPrimaryKey getEducationDetailPrimaryKey() {
		return educationDetailPrimaryKey;
	}

	public void setEducationDetailPrimaryKey(EducationDetailPrimaryKey educationDetailPrimaryKey) {
		this.educationDetailPrimaryKey = educationDetailPrimaryKey;
	}
	
	
}
