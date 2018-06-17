package com.doitgeek.onlinejobportal.entity.seeker;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.doitgeek.onlinejobportal.entity.user.UserAccount;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "seeker_profile")
public class SeekerProfile implements Serializable {

	private static final long serialVersionUID = 7138753120710465491L;
	
	@Id
	@Column(name = "user_account_id", nullable = false, updatable = false)
	private Integer userAccountId;
	
	public Integer getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(Integer userAccountId) {
		this.userAccountId = userAccountId;
	}

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "current_salary")
	private Long currentSalary;
	
	@Column(name = "is_annually_monthly")
	private Character isAnnuallyMonthly;
	
	@Column(name = "currency")
	private String currency;
	
	@JsonIgnore
	@OneToOne
	@MapsId
	@JoinColumn(name = "user_account_id", referencedColumnName = "id")
	private UserAccount userAccount;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Long getCurrentSalary() {
		return currentSalary;
	}
	
	public void setCurrentSalary(Long currentSalary) {
		this.currentSalary = currentSalary;
	}
	
	public Character getIsAnnuallyMonthly() {
		return isAnnuallyMonthly;
	}
	
	public void setIsAnnuallyMonthly(Character isAnnuallyMonthly) {
		this.isAnnuallyMonthly = isAnnuallyMonthly;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}
	
	
}
