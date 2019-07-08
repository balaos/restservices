package com.bala.restsvc.dao;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bala.restsvc.model.Job;

@Repository
public interface JobsRepository extends JpaRepository<Job, Integer>{

}
