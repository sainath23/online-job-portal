package com.doitgeek.onlinejobportal.repository.company;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.company.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
