package com.doitgeek.onlinejobportal.entity.seeker;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "seeker_skill_set")
public class SeekerSkillSet {
	
	@EmbeddedId
	private SeekerSkillSetPrimaryKey seekerSkillSetPrimaryKey;
	
	@Column(name = "skill_level")
	private Integer skillLevel;
	
	public Integer getSkillLevel() {
		return skillLevel;
	}
	
	public void setSkillLevel(Integer skillLevel) {
		this.skillLevel = skillLevel;
	}

	public SeekerSkillSetPrimaryKey getSeekerSkillSetPrimaryKey() {
		return seekerSkillSetPrimaryKey;
	}

	public void setSeekerSkillSetPrimaryKey(SeekerSkillSetPrimaryKey seekerSkillSetPrimaryKey) {
		this.seekerSkillSetPrimaryKey = seekerSkillSetPrimaryKey;
	}
	
	
}
