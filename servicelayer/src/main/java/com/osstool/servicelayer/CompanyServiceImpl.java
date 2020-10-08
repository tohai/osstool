package com.osstool.servicelayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osstool.dblayer.dao.CompanyDAO;
import com.osstool.dblayer.entities.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyDAO companydao;
	
	@Override
	public List<Company> getCompanies() {
		return companydao.selectCompanys();
	}

}
