package com.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.pojo.Event;
import com.pojo.Person;
import com.util.HibernateUtil;

public class EventManager {

	public static void main(String[] args) {
		EventManager mgr = new EventManager();

		//mgr.createAndStoreEvent("My Event", new Date());
		//mgr.testList();
		mgr.addPersonToEvent(1l, 1l);

		HibernateUtil.getSessionFactory().close();
	}

	private void createAndStoreEvent(String title, Date theDate) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Event theEvent = new Event();
		theEvent.setTitle(title);
		theEvent.setDate(theDate);
		session.save(theEvent);

		session.getTransaction().commit();

		System.out.println("created!");
	}

	private List<Event> listEvents() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Event> result = (List<Event>) session.createQuery("from Event").list();
		session.getTransaction().commit();
		return result;
	}

	private void addPersonToEvent(Long personId, Long eventId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		Person aPerson = (Person) session.load(Person.class, personId);
		Event anEvent = (Event) session.load(Event.class, eventId);
		aPerson.getEvents().add(anEvent);

		session.getTransaction().commit();
	}

	private void testList() {
		List<Event> events = listEvents();
		for (Event theEvent : events) {
			System.out.println("Event: " + theEvent.getTitle() + " Time: " + theEvent.getDate());
		}
	}
}