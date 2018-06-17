package com.doitgeek.onlinejobportal.repository.seeker;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doitgeek.onlinejobportal.entity.seeker.SeekerSkillSet;
import com.doitgeek.onlinejobportal.entity.seeker.SeekerSkillSetPrimaryKey;

public interface SeekerSkillSetRepository extends JpaRepository<SeekerSkillSet, SeekerSkillSetPrimaryKey> {
	SeekerSkillSet findBySeekerSkillSetPrimaryKey(SeekerSkillSetPrimaryKey id);
	List<SeekerSkillSet> findBySeekerSkillSetPrimaryKeyUserAccountId(Integer userAccountId);
}
