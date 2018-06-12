package com.doitgeek.onlinejobportal.entity.company;

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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "business_stream")
public class BusinessStream implements Serializable {

	private static final long serialVersionUID = -3406285762822372222L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "business_stream_name")
	private String businessStreamName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "businessStram", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Company> company;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getBusinessStreamName() {
		return businessStreamName;
	}
	
	public void setBusinessStreamName(String businessStreamName) {
		this.businessStreamName = businessStreamName;
	}

	public Set<Company> getCompany() {
		return company;
	}

	public void setCompany(Set<Company> company) {
		this.company = company;
	}

}
