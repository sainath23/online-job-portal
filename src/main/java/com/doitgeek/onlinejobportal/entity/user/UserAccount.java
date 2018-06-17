package com.doitgeek.onlinejobportal.entity.user;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.doitgeek.onlinejobportal.entity.job.JobPost;
import com.doitgeek.onlinejobportal.entity.job.JobPostActivity;
import com.doitgeek.onlinejobportal.entity.seeker.EducationDetail;
import com.doitgeek.onlinejobportal.entity.seeker.ExperienceDetail;
import com.doitgeek.onlinejobportal.entity.seeker.SeekerProfile;
import com.doitgeek.onlinejobportal.entity.seeker.SeekerSkillSet;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user_account")
public class UserAccount implements Serializable {

	private static final long serialVersionUID = 4950461670501397046L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String email;
	private String password;
	
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	private Character gender;
	
	@Column(name = "is_active")
	private Character isActive;
	
	@Column(name = "contact_number")
	private Long contactNumber;
	
	@Column(name = "sms_notification_active")
	private Character smsNotificationActive;
	
	@Column(name = "email_notification_active")
	private Character emailNotificationActive;
	
	@Column(name = "user_image")
	private String userImage;
	
	@Column(name = "registration_date")
	private Date registrationDate;
	
	@JsonIgnore
	@OneToOne(mappedBy = "userAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private UserLocation userLocation;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "user_type_id", referencedColumnName = "id")
	private UserType userType;
	
	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "userAccount", fetch = FetchType.LAZY)
	private SeekerProfile seekerProfile;
	
	@JsonIgnore
	@OneToMany(mappedBy = "educationDetailPrimaryKey.userAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<EducationDetail> educationDetails;
	
	@JsonIgnore
	@OneToMany( mappedBy = "experienceDetailPrimaryKey.userAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<ExperienceDetail> experienceDetails;
	
	@JsonIgnore
	@OneToMany(mappedBy = "seekerSkillSetPrimaryKey.userAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<SeekerSkillSet> seekerSkillSets;
	
	@JsonIgnore
	@OneToOne(mappedBy = "userAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private UserLog userLog;
	
	@JsonIgnore
	@OneToMany(mappedBy = "userAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<JobPost> jobPosts;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobPostActivityPrimaryKey.userAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<JobPostActivity> jobPostActivities;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Character getGender() {
		return gender;
	}
	
	public void setGender(Character gender) {
		this.gender = gender;
	}
	
	public Character getIsActive() {
		return isActive;
	}
	
	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}
	
	public Long getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public Character getSmsNotificationActive() {
		return smsNotificationActive;
	}
	
	public void setSmsNotificationActive(Character smsNotificationActive) {
		this.smsNotificationActive = smsNotificationActive;
	}
	
	public Character getEmailNotificationActive() {
		return emailNotificationActive;
	}
	
	public void setEmailNotificationActive(Character emailNotificationActive) {
		this.emailNotificationActive = emailNotificationActive;
	}
	
	public String getUserImage() {
		return userImage;
	}
	
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}
	
	public Date getRegistrationDate() {
		return registrationDate;
	}
	
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public UserLog getUserLog() {
		return userLog;
	}

	public void setUserLog(UserLog userLog) {
		this.userLog = userLog;
	}

	public SeekerProfile getSeekerProfile() {
		return seekerProfile;
	}

	public void setSeekerProfile(SeekerProfile seekerProfile) {
		this.seekerProfile = seekerProfile;
	}

	public UserLocation getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(UserLocation userLocation) {
		this.userLocation = userLocation;
	}

	public Set<EducationDetail> getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(Set<EducationDetail> educationDetails) {
		this.educationDetails = educationDetails;
	}

	public Set<ExperienceDetail> getExperienceDetails() {
		return experienceDetails;
	}

	public void setExperienceDetails(Set<ExperienceDetail> experienceDetails) {
		this.experienceDetails = experienceDetails;
	}

	public Set<SeekerSkillSet> getSeekerSkillSets() {
		return seekerSkillSets;
	}

	public void setSeekerSkillSets(Set<SeekerSkillSet> seekerSkillSets) {
		this.seekerSkillSets = seekerSkillSets;
	}

	public Set<JobPost> getJobPosts() {
		return jobPosts;
	}

	public void setJobPosts(Set<JobPost> jobPosts) {
		this.jobPosts = jobPosts;
	}

	public Set<JobPostActivity> getJobPostActivities() {
		return jobPostActivities;
	}

	public void setJobPostActivities(Set<JobPostActivity> jobPostActivities) {
		this.jobPostActivities = jobPostActivities;
	}
	
}
