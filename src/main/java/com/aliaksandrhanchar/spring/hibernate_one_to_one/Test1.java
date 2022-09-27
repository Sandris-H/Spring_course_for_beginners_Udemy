package com.aliaksandrhanchar.spring.hibernate_one_to_one;


import com.aliaksandrhanchar.spring.hibernate_one_to_one.entity.Detail;
import com.aliaksandrhanchar.spring.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Ivan", "Hanchar", "IT", 700);
//            Detail detail = new Detail("Mozyr", "12345", "ivan@gmail.com");
//            emp.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(emp);
//            session.getTransaction().commit();

//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Alex", "Hanchar", "Sales", 800);
//            Detail detail = new Detail("Mozyr", "22345", "alex@gmail.com");
//            emp.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(emp);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp.getEmpDetail());
//            session.getTransaction().commit();

            session = factory.getCurrentSession();

            session.beginTransaction();
            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }

    }
}
