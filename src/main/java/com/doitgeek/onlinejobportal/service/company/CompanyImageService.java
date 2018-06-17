package com.doitgeek.onlinejobportal.service.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.company.CompanyImage;
import com.doitgeek.onlinejobportal.repository.company.CompanyImageRepository;

@Service
public class CompanyImageService {

	@Autowired
	private CompanyImageRepository companyImageRepository;
	
	public List<CompanyImage> findAllCompanyImage() {
		return companyImageRepository.findAll();
	}
	
	public CompanyImage findCompanyImageById(Integer id) {
		try {
			return companyImageRepository.findById(id).get();
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public List<CompanyImage> findAllCompanyImageByCompanyId(Integer companyId) {
		return companyImageRepository.findByCompanyId(companyId);
	}
	
	public void addCompanyImage(CompanyImage companyImage) {
		companyImageRepository.save(companyImage);
	}
	
	public void updateCompanyImage(CompanyImage companyImage) {
		companyImageRepository.save(companyImage);
	}
	
	public void deleteCompanyImageById(Integer id) {
		companyImageRepository.deleteById(id);
	}
}
