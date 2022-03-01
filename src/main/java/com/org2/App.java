package com.org2;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Configuration conf=new Configuration();
    conf.configure("Hibernate.cfg.xml");
    SessionFactory sf=conf.buildSessionFactory();
    Session session = HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	Transaction tr=session.beginTransaction();
	Employee emp = new Employee();
	emp.setEmployeeId(1);
	emp.setEmployeename("Sonali");
	emp.setCreatedBy("Google");
	emp.setCreatedDate(new Date());
	session.save(emp);
	tr.commit();
}
}

