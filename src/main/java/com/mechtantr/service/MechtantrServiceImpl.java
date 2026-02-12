package com.mechtantr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mechtantr.entity.Mechtantr;
import com.mechtantr.repository.MechtantrRepo;

@Service
public class MechtantrServiceImpl implements MechtantraService {

	@Autowired
	private MechtantrRepo repo;

	@Override
	public String ContactUs(Mechtantr contactus) {
		repo.save(contactus);
		return "Data Inserted Successfully!!";
	}

	@Override
	public List<Mechtantr> getAllContacts() {
		return repo.findAll();
	}

	
	

}
