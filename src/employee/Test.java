package employee;
import java.util.*;

public class Test {
	public static void main(String args[]) {  
	
	Employee emp1 = new Employee(123,"Any",50000);
	Employee emp2 = new Employee(456,"Mahi",60000);
	emp1.setDepartment("IT");
	emp1.setEmail("any@sap.com");
	
	emp2.setDepartment("QA");
	emp2.setEmail("mahi@sap.com");
	
	System.out.println(emp1);
	emp1.checkIsValidEmail(emp1.getEmail());
	float val1=emp1.getBonus(emp1.getSalary());
	System.out.println("Salary after bonus : "+val1);

	System.out.println(emp2);
	emp2.checkIsValidEmail(emp2.getEmail());	
	float val2=emp2.getBonus(emp2.getSalary());
	System.out.println("Salary after bonus : "+val2);
	
	Employee emp3 = new Employee();
	emp3.setEmail("abc@abc.com");
	emp3.checkIsValidEmail(emp3.getEmail());
	
	Manager m = new Manager(1,"Ram",40000,2000);
	System.out.println(m);
	
	//An array of employees for testing the implementation of  Comparable Interface
	Emp[] emp = new Emp[3];
	emp[0] = new Emp("Priya", 33000);
    emp[1] = new Emp("Abc", 49000);
    emp[2] = new Emp("Raghu", 70000);
	
    Arrays.sort(emp);
	for (Emp e : emp)
    System.out.println("Employee name=" + e.getName() + ", Salary=" + e.getSalary());
    
	     }
	}

