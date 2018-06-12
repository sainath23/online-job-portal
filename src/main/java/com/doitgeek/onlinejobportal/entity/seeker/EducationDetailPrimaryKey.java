package com.doitgeek.onlinejobportal.entity.seeker;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Embeddable
public class EducationDetailPrimaryKey implements Serializable {

	private static final long serialVersionUID = 5375167738749947673L;
	
	@JsonIgnore
	@ManyToOne
	@MapsId
	@JoinColumn(name = "user_account_id", referencedColumnName = "id")
	private UserAccount userAccount;
	
	@Column(name = "certificate_degree_name")
	private String certificateDegreeName;
	
	@Column(name = "major")
	private String major;
	
	public String getCertificateDegreeName() {
		return certificateDegreeName;
	}
	
	public void setCertificateDegreeName(String certificateDegreeName) {
		this.certificateDegreeName = certificateDegreeName;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}
	
	
}
