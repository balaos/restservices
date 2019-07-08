package com.bala.restsvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FieldResult;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Job {
	
	@Id
	int jobid;
	@Column(name="worktype")
	String workType;
	@Column(name="servicetype")
	String serviceType;
	
	public Job() {
		// TODO Auto-generated constructor stub
	}
	
	public Job(int jobid, String workType, String serviceType) {
		super();
		this.jobid = jobid;
		this.workType = workType;
		this.serviceType = serviceType;
	}
	
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public String getWorkType() {
		return workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
}
