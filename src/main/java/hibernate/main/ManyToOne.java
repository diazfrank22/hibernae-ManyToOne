package hibernate.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import hibernate.entity.Department;
import hibernate.entity.Employee;

public class ManyToOne {
	
	   public static void main( String[ ] args ) 
	   {
	      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JavaHelps" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      //Create Department Entity
	      Department department = new Department();
	      department.setNameDeparment("Development");
	      
	      //Store Department
	      entitymanager.persist(department);

	      //Create Employee1 Entity
	      Employee employee1 = new Employee();
	      employee1.setNameEmployee("Satish");
	      employee1.setSalaryEmployee(45000.0);
	      employee1.setDegEmployee("Technical Writer");
	      employee1.setDepartment(department);

	      //Create Employee2 Entity
	      Employee employee2 = new Employee();
	      employee2.setNameEmployee("Krishna");
	      employee2.setSalaryEmployee(45000.0);
	      employee2.setDegEmployee("Technical Writer");
	      employee2.setDepartment(department);

	      //Create Employee3 Entity
	      Employee employee3 = new Employee();
	      employee3.setNameEmployee("Masthanvali");
	      employee3.setSalaryEmployee(50000.0);
	      employee3.setDegEmployee("Technical Writer");
	      employee3.setDepartment(department);

	      //Store Employees
	      entitymanager.persist(employee1);
	      entitymanager.persist(employee2);
	      entitymanager.persist(employee3);

	      entitymanager.getTransaction().commit();
	      entitymanager.close();
	      emfactory.close();
	   }
	}

