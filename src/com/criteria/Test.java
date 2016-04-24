package com.criteria;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		EmployeeDetail employeeDetail = new EmployeeDetail("10th Street", "LA", "San Francisco", "U.S.");

		Employee employee = new Employee("Srini", "Vasan", new Date(121212), "114-857-965");
		employee.setEmployeeDetail(employeeDetail);
		employeeDetail.setEmployee(employee);

		session.saveOrUpdate(employee);
		session.getTransaction().commit();
		session.close();
		
		session = sf.openSession();
		session.beginTransaction();
		
		EmployeeDetail employeeDetail1 = new EmployeeDetail("11th Street", "LA", "San Francisco", "U.S.");
		
		Employee employee2 = new Employee("Sri", "Vasanth", new Date(121212), "114-857-965");
		employee2.setEmployeeDetail(employeeDetail);
		employeeDetail1.setEmployee(employee2);

		session.saveOrUpdate(employee2);
		session.getTransaction().commit();
		
		List<Employee> employees = session.createQuery("from Employee").list();
		for (Employee employee1 : employees) {
			System.out.println(employee1.getFirstname() + " , " + employee1.getLastname() + ", " + employee1.getEmployeeDetail().getState());
		}

		session.close();

	}
}