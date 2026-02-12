package com.mechtantr.service;
import java.util.List;

import com.mechtantr.entity.Mechtantr;

public interface MechtantraService {

	String ContactUs(Mechtantr contactus);
	
	List<Mechtantr> getAllContacts();


}
