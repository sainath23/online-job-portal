package com.doitgeek.onlinejobportal.repository.seeker;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.seeker.ExperienceDetail;
import com.doitgeek.onlinejobportal.entity.seeker.ExperienceDetailPrimaryKey;

public interface ExperienceDetailRepository extends JpaRepository<ExperienceDetail, ExperienceDetailPrimaryKey> {

	List<ExperienceDetail> findByExperienceDetailPrimaryKeyUserAccountId(Integer userAccountId);
}
