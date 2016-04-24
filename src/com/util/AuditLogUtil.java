package com.util;

import java.util.Date;

import org.hibernate.Session;

import com.interceptor.AuditLog;
import com.interceptor.IAuditLog;
import java.sql.Connection;

public class AuditLogUtil {

	public static void LogIt(String action, IAuditLog entity, Connection conn) {

		Session tempSession = HibernateUtil.getSessionFactory().openSession(conn);

		try {

			AuditLog auditRecord = new AuditLog(action, entity.getLogDeatil(), new Date(), entity.getId(), entity.getClass().toString());
			tempSession.save(auditRecord);
			tempSession.flush();

		} finally {
			tempSession.close();
		}
	}
}