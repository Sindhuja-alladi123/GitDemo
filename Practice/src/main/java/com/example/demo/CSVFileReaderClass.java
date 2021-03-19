package com.example.demo;

import java.io.Reader;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;

public class CSVFileReaderClass {
	public static ArrayList<Employee> csvFileReading() throws IOException {
		String filename="sample.csv";
		Path pathToFile = Paths.get(filename);
		System.out.println(pathToFile.toAbsolutePath());
		ArrayList<Employee> employees=new ArrayList<>();
		try (
				Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\sa21138\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\Practice\\src\\main\\resources\\sample.csv"));

				CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
				) {
		
			for (CSVRecord csvRecord : csvParser) {

				Employee employee = new Employee(csvRecord.get(0),csvRecord.get(1),csvRecord.get(2),csvRecord.get(3),csvRecord.get(4));
				employees.add(employee);

				/*
				 * System.out.println("Record No - " + csvRecord.getRecordNumber());
				 * System.out.println("---------------"); System.out.println("Name : " + name);
				 * System.out.println("Email : " + email); System.out.println("Phone : " +
				 * phone); System.out.println("Country : " + country);
				 * System.out.println("---------------\n\n");
				 */
			}
			
		}
		return employees;

	}
}
