package com.bala.restsvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bala.restsvc.dao.JobsRepository;
import com.bala.restsvc.model.Job;
import com.bala.restsvc.services.JobServiceImpl;

@RestController
public class JobController {
	
	@Autowired
	private JobsRepository jr;
	
	@RequestMapping("/jobs")
	public List<Job> getJobs(){
		List<Job> jList = new ArrayList<>(); 
		//jList.add(new Job("111","I","FIOS"));
		//jList.add(new Job("233","M","FIOS"));
		
		jList = jr.findAll();
		
		return jList;
	}

}
