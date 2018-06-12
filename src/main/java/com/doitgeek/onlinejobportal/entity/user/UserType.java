package com.doitgeek.onlinejobportal.entity.user;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class UserType implements Serializable {

	private static final long serialVersionUID = -5959760965357868497L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "user_type_name")
	private String userTypeName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "userType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<UserAccount> userAccounts;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUserTypeName() {
		return userTypeName;
	}
	
	public void setUserTypeName(String userTypeName) {
		this.userTypeName = userTypeName;
	}

	public Set<UserAccount> getUserAccounts() {
		return userAccounts;
	}

	public void setUserAccounts(Set<UserAccount> userAccounts) {
		this.userAccounts = userAccounts;
	}
}
