package com.mechtantr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mechtantr.entity.Mechtantr;
import com.mechtantr.service.MechtantraService;

@RestController
public class AppController {

	@Autowired
	private MechtantraService service;

	@PostMapping(value = "/api/mechtantr/getcontactus")
	public String contactUs(@RequestBody Mechtantr contactus) {
		return service.ContactUs(contactus);
	}
	
	@GetMapping("/api/mechtantr/getAll")
    public List<Mechtantr> getAllContacts() {
        return service.getAllContacts();
    }
}
