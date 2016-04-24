package com.criteria;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.util.HibernateUtil;

public class TestCriteria {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		List<Employee> employees = session.createCriteria(Employee.class).add(Restrictions.like("firstname", "%r%")).list();

		for (Employee employee : employees) {
			System.out.println(employee.getFirstname() + " , " + employee.getLastname() + ", " + employee.getEmployeeDetail().getState());
		}

		session.getTransaction().commit();
		session.close();

	}
}