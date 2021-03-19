package com.example.demo;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CSVService {

	@Autowired 
	EmployeeRepository repository;
	
	  public void saveFile() {
		    try {
		      List<Employee> employees = CSVFileReaderClass.csvFileReading();
		      repository.saveAll(employees);
		    } catch (IOException e) {
		      throw new RuntimeException("fail to store csv data: " + e.getMessage());
		    }
		  }

		  public List<Employee> getAllEmployees() {
		    return repository.findAll();
		  }
}
