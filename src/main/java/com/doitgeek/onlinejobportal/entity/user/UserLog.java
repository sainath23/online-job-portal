package com.doitgeek.onlinejobportal.entity.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class UserLog implements Serializable {

	private static final long serialVersionUID = -8247149016424125199L;

	@Id
	private Integer userAccountId;
	
	@Column(name = "last_login_date")
	private Date lastLoginDate;
	
	@Column(name = "last_job_apply_date")
	private Date lastJobApplyDate;
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "user_account_id")
	private UserAccount userAccount;
	
	public Integer getUserAccountId() {
		return userAccountId;
	}
	
	public void setUserAccountId(Integer userAccountId) {
		this.userAccountId = userAccountId;
	}
	
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
	public Date getLastJobApplyDate() {
		return lastJobApplyDate;
	}
	
	public void setLastJobApplyDate(Date lastJobApplyDate) {
		this.lastJobApplyDate = lastJobApplyDate;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}
}
