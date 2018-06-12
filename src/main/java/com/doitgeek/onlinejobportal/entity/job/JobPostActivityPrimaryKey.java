package com.doitgeek.onlinejobportal.entity.job;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Embeddable
public class JobPostActivityPrimaryKey implements Serializable {

	private static final long serialVersionUID = 2123261162989935017L;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_account_id", referencedColumnName = "id")
	private UserAccount userAccount;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "job_post_id", referencedColumnName = "id")
	private JobPost jobPost;

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public JobPost getJobPost() {
		return jobPost;
	}

	public void setJobPost(JobPost jobPost) {
		this.jobPost = jobPost;
	}
}
