package com.mapping.self.one2many;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.annotation.util.HibernateUtil;
  
public class One2ManyTest {
  
    public static void main(String[] args) {
  
    	//TODO: NOTE, we use different HibernateUtil class for annotation configuration
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
  
        Employee manager1 = new Employee("Chuck", "Norris");
         
        Employee employee1 = new Employee("Sergey", "Brin");
        Employee employee2 = new Employee("Larry", "Page");
 
        employee1.setManager(manager1);
        employee2.setManager(manager1);
         
        session.save(employee1);
        session.save(employee2);
         
        session.getTransaction().commit();
        session.close();
    }
}