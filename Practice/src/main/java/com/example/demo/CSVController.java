package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSVController {
	
	@Autowired
	CSVService service;

	@RequestMapping("/savefile")
	public void saveFile() {
	
		service.saveFile();
	}
	
	@RequestMapping("/getemployees")
	public List<Employee> getAllEmployees()
	{
		return service.getAllEmployees();
	}
	
}
