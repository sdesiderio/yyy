package com.sistemi.informativi.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sistemi.informativi.connection.ConnectionManager;
import com.dto.StudentDTO;

public class StudentDAOImpl implements StudentDAO {

	private String sqlInsert = "insert into student(first_name,last_name,age) values (?,?,?)";

	private String sqlUpdate = "update student set first_name=?,last_name=?,age=? where id=?";

	private String sqlDelete = "delete from student where id=?";

	private String sqlRead = "select * from student";

	@Override
	public int addStudent(StudentDTO studentDTO) throws ClassNotFoundException {

		ConnectionManager connectionManager = new ConnectionManager();
		
		int nRowsInserted = 0;

		try {

			// richiesta di un PreperedStatement già inizializzato per eseguire un insert
			PreparedStatement ps = connectionManager.getPreparedStatement(sqlInsert);
			// sql = "insert into student(first_name,last_name,age)values(?,?,?);
			ps.setString(1, studentDTO.getFirstName());
			ps.setString(2, studentDTO.getLastName());
			ps.setInt(3, studentDTO.getAge());
			nRowsInserted = ps.executeUpdate();

		}

		catch (SQLException ex) {

			ex.printStackTrace();
		}
		
		return nRowsInserted;
	}

   

   
}
