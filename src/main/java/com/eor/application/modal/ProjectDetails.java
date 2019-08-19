package com.eor.application.modal;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project_details")
public class ProjectDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;

	@Column(name="project_name", nullable=true, unique=false)
	private String projectName;
	
	@Column(name="well_name", nullable=true, unique=false)
	private String wellName;
	
	@Column(name="cmpany_name", nullable=true, unique=false)
	private String companyName;
	
	@Column(name="date_Created", nullable=true, unique=false)
	private Timestamp dateCreated;
	 
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getWellName() {
		return wellName;
	}

	public void setWellName(String wellName) {
		this.wellName = wellName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Timestamp getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}
	
    public ProjectDetails() {
		// TODO Auto-generated constructor stub
	}

	public ProjectDetails(String projectName, String wellName, String companyName, Timestamp dateCreated) {
		this.projectName = projectName;
		this.wellName = wellName;
		this.companyName = companyName;
		this.dateCreated = dateCreated;
	}
}
