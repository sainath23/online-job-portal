package com.doitgeek.onlinejobportal.repository.company;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.company.CompanyImage;

public interface CompanyImageRepository extends JpaRepository<CompanyImage, Integer> {
	List<CompanyImage> findByCompanyId(Integer companyId);
}
