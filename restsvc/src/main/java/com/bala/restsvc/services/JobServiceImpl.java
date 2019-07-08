package com.bala.restsvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bala.restsvc.dao.JobsRepository;
import com.bala.restsvc.model.Job;

@Component
public class JobServiceImpl implements JobService {

	@Autowired
	private JobsRepository jr;
	
	@Override
	public List<Job> getJobList() {
		// TODO Auto-generated method stub
		return jr.findAll();
	}

}
