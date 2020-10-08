package com.osstool.applicationlayer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osstool.dblayer.entities.Company;
import com.osstool.servicelayer.CompanyService;

@RestController
public class HomeController {
	
	@Autowired
	CompanyService companyService;
	
	@GetMapping(value = "/")
	public String homepage() {
		List<Company> companies = companyService.getCompanies();
		
		return companies.get(0).getWebsite();
		
	}
	
}
