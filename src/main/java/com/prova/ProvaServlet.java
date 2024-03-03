package com.prova;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.StudentDTO;
import com.ejb.ProvaEJBLocal;


@WebServlet("/prova")
public class ProvaServlet extends HttpServlet {
	
	@EJB
	private ProvaEJBLocal provaEJB;
	
	
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String age = request.getParameter("age");
		
		StudentDTO studentDTO = new StudentDTO(firstName,lastName,Integer.parseInt(age));
		
		try {
			response.sendRedirect(provaEJB.addStudent(studentDTO));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
