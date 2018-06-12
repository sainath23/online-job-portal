package com.doitgeek.onlinejobportal.entity.seeker;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Embeddable
public class SkillSetPrimaryKey implements Serializable {

	private static final long serialVersionUID = 5271961597617039619L;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_account_id", referencedColumnName = "id")
	private UserAccount userAccount;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "skill_set_id", referencedColumnName = "id")
	private SkillSet skillSet;

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public SkillSet getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(SkillSet skillSet) {
		this.skillSet = skillSet;
	}
	
	
}
