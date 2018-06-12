package com.doitgeek.onlinejobportal.repository.seeker;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.seeker.EducationDetail;
import com.doitgeek.onlinejobportal.entity.seeker.EducationDetailPrimaryKey;
import com.doitgeek.onlinejobportal.entity.user.UserAccount;

public interface EducationalDetailRepository extends JpaRepository<EducationDetail, EducationDetailPrimaryKey> {
	//List<EducationDetail> findByUserAccount(UserAccount userAccount);
}
