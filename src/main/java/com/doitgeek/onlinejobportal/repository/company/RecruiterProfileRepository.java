package com.doitgeek.onlinejobportal.repository.company;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.company.RecruiterProfile;

public interface RecruiterProfileRepository extends JpaRepository<RecruiterProfile, Integer> {
	List<RecruiterProfile> findByCompanyId(Integer companyId);
	RecruiterProfile findByUserAccountId(Integer userAccountId);
}
