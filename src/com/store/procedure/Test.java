package com.store.procedure;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Query callStoredProcedure_MYSQL = session.createSQLQuery("CALL SP_MYSQL_HIBERNATE (:param1, :param2, :param3)").addEntity(User.class);
		callStoredProcedure_MYSQL.setInteger("param1", 10);
		callStoredProcedure_MYSQL.setInteger("param2", 10);
		callStoredProcedure_MYSQL.setString("param3", "Peru maari pochida");

		/*
		 * callStoredProcedure_MSSQL.list() will execute stored procedure and return the value
		 */
		List<User> userList = callStoredProcedure_MYSQL.list();
		if (userList != null && !userList.isEmpty()) {
			for (User user : userList) {
				System.out.println("Firstname:" + user.getFirstname());
			}
		}

		session.getTransaction().commit();

		session.close();

	}
}