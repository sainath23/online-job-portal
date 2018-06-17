package com.doitgeek.onlinejobportal.service.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.company.Company;
import com.doitgeek.onlinejobportal.repository.company.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public List<Company> findAllCompanies() {
		return companyRepository.findAll();
	}
	
	public Company findCompanyById(Integer id) {
		try {
			return companyRepository.findById(id).get();
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public void addCompany(Company company) {
		companyRepository.save(company);
	}
	
	public void updateCompany(Company company) {
		companyRepository.save(company);
	}
	
	public void deleteCompanyById(Integer id) {
		companyRepository.deleteById(id);
	}
}
