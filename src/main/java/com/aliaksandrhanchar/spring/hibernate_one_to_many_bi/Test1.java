package com.aliaksandrhanchar.spring.hibernate_one_to_many_bi;


import com.aliaksandrhanchar.spring.hibernate_one_to_many_bi.entity.Department;
import com.aliaksandrhanchar.spring.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department department = new Department("Sales", 800, 1500);
//            Employee emp1 = new Employee("Yuliya", "Hanchar", 800);
//            Employee emp2 = new Employee("Ivan", "Hanchar", 1200);
//            Employee emp3 = new Employee("Alex", "Hanchar", 900);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);
//            session.beginTransaction();
//            session.save(department);
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

            session = factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("Get department");
            Department department = session.get(Department.class, 3);
            System.out.println("Show department:\n" + department);
            System.out.println("Download our employees");
            department.getEmps().get(0);
            session.getTransaction().commit();
            System.out.println("Show employees of department:\n" + department.getEmps());
//
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);
//            session.getTransaction().commit();

            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }

    }
}
