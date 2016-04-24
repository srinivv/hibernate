package com.mapping.one2many;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtil;

public class One2ManyTest {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Department department = new Department();
		department.setDepartmentName("Sales");
		session.save(department);

		Employee emp1 = new Employee("Srini", "V", new Date(), "111-222-1234");
		Employee emp2 = new Employee("Vasan", "V", new Date(), "555-222-1234");

		emp1.setDepartment(department);
		emp2.setDepartment(department);

		session.save(emp1);
		session.save(emp2);

		session.getTransaction().commit();
		session.close();
	}
}