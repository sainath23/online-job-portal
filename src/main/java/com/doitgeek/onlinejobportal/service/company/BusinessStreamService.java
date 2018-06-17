package com.doitgeek.onlinejobportal.service.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doitgeek.onlinejobportal.entity.company.BusinessStream;
import com.doitgeek.onlinejobportal.repository.company.BusinessStreamRepository;

@Service
public class BusinessStreamService {
	
	@Autowired
	private BusinessStreamRepository businessStreamRepository;
	
	public List<BusinessStream> findAllBusinessStream() {
		return businessStreamRepository.findAll();
	}
	
	public BusinessStream findBusinessStreamById(Integer id) {
		try {
			return businessStreamRepository.findById(id).get();
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public void addBusinessStream(BusinessStream businessStream) {
		businessStreamRepository.save(businessStream);
	}
	
	public void updateBusinessStream(BusinessStream businessStream) {
		businessStreamRepository.save(businessStream);
	}
	
	public void deleteBusinessStreamById(Integer id) {
		businessStreamRepository.deleteById(id);
	}
}
