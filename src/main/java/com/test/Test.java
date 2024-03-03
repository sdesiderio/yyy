package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.MethodName;

import com.dto.StudentDTO;
import com.sistemi.informativi.dao.*;

@TestMethodOrder(MethodName.class)
class Test {

	
	@org.junit.jupiter.api.Test
	void a() {
		
		int nRowsInserted = 0;
		
		StudentDTO studentDTO = new StudentDTO("w","e",23);
		StudentDAO studentDAO = new StudentDAOImpl();
		try {
			nRowsInserted = studentDAO.addStudent(studentDTO);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(nRowsInserted,1);
		
		
	}
	
	@org.junit.jupiter.api.Test
	void c() {
		
		int nRowsInserted = 0;
		
		StudentDTO studentDTO = new StudentDTO("w","e",23);
		StudentDAO studentDAO = new StudentDAOImpl();
		try {
			nRowsInserted = studentDAO.addStudent(studentDTO);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(nRowsInserted,1);
		
		
	}
	
	
	@org.junit.jupiter.api.Test
	void b() {
		
		int nRowsInserted = 0;
		
		StudentDTO studentDTO = new StudentDTO("y","h",24);
		StudentDAO studentDAO = new StudentDAOImpl();
		try {
			nRowsInserted = studentDAO.addStudent(studentDTO);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(nRowsInserted,1);
		
		
	}
	
	

}
