package com.Anil.JDBCmaven;

import com.Anil.JDBCmaven.DAO.jdbcDAO;
import com.Anil.JDBCmaven.entity.jdbc;

public class Testjdbc {
	
	public static void main(String[] args) {
		jdbcDAO dao = new jdbcDAO();
		dao.getAll();
		
		jdbc Jdbc = new jdbc();
		Jdbc.setId(6);
		Jdbc.setName("Ani");
		Jdbc.setmailid("Ani123@gmail.com");
		
		Jdbc.setId(9);
		Jdbc.setName("QAC");
		Jdbc.setmailid("QAC123@gmail.com");
		
	
		
		dao.save(Jdbc);
	}

}
