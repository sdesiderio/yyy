package com.ejb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.dto.StudentDTO;
import com.sistemi.informativi.dao.StudentDAO;
import com.sistemi.informativi.dao.StudentDAOImpl;

/**
 * Session Bean implementation class ProvaEJB
 */
@Stateless
public class ProvaEJB implements ProvaEJBLocal{

	@Override
	public String addStudent(StudentDTO studentDTO) throws ClassNotFoundException {
		
		String page = "error.html";
		
		int nRowsInserted = 0;
		
		StudentDAO studentDAO = new StudentDAOImpl();
		
		nRowsInserted = studentDAO.addStudent(studentDTO);
		
		if (nRowsInserted>0) {
			
			page = "ok.html";
			
		}
		
		return page;
		
		 
		
	}

    

}
