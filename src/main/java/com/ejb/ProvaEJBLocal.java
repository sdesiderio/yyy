package com.ejb;

import com.dto.StudentDTO;

public interface ProvaEJBLocal {
	
	public String addStudent(StudentDTO studentDTO) throws ClassNotFoundException;

}
