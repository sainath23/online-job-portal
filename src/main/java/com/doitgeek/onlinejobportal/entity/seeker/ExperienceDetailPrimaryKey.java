package com.doitgeek.onlinejobportal.entity.seeker;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Embeddable
public class ExperienceDetailPrimaryKey implements Serializable {

	private static final long serialVersionUID = 1480532813562263215L;
	
	@JsonIgnore
	@ManyToOne
	@MapsId
	@JoinColumn(name = "user_account_id", referencedColumnName = "id")
	private UserAccount userAccount;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	
}
