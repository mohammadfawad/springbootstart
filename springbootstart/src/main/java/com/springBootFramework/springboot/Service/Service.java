package com.springBootFramework.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.springBootFramework.springboot.DAO.DAO;


@org.springframework.stereotype.Service
public class Service {

	DAO dao;
	
	@Autowired
	public Service(DAO dao) {
		this.dao = dao;
		System.out.println("\n :: Service Created :: \n");
	}
	
	public void save() {
		this.dao.create();
	}
}
