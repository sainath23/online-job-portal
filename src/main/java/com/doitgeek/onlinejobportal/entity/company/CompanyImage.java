package com.doitgeek.onlinejobportal.entity.company;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "company_image")
public class CompanyImage {

	@EmbeddedId
	private CompanyImagePrimaryKey companyImagePrimaryKey;
	
	@Column(name = "company_image")
	private String companyImage;
	
	public String getCompanyImage() {
		return companyImage;
	}
	
	public void setCompanyImage(String companyImage) {
		this.companyImage = companyImage;
	}

	public CompanyImagePrimaryKey getCompanyImagePrimaryKey() {
		return companyImagePrimaryKey;
	}

	public void setCompanyImagePrimaryKey(CompanyImagePrimaryKey companyImagePrimaryKey) {
		this.companyImagePrimaryKey = companyImagePrimaryKey;
	}
}
