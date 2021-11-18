package com.hybrid.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "branch")
public class BranchEntity extends BaseEntity{
	
	@Column(columnDefinition = "varchar(255) NOT NULL")
	private String name;
	
	@Column(columnDefinition = "varchar(255) NOT NULL")
	private String description;
	
	@OneToMany(mappedBy = "branch")
	private List<UserProfileEntity> userProfile = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<UserProfileEntity> getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(List<UserProfileEntity> userProfile) {
		this.userProfile = userProfile;
	}

}
