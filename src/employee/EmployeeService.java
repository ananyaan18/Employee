package employee;

import java.util.HashSet;
import java.util.Scanner;
import java.util.InputMismatchException;

public class EmployeeService {
HashSet<Employee> empset=new HashSet<Employee>();
	
	Employee emp1=new Employee(101, "Any",45000);
	Employee emp2=new Employee(102, "Mahi",60000);
	Employee emp3=new Employee(103, "Happy",50000);
	Employee emp4=new Employee(104, "Rani", 70000);
	
	Scanner sc=new Scanner(System.in);
	boolean found=false;
	int employeeId;
	float salary;  
	String name;
	String department, email;
 
	
	public EmployeeService() {
		
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		
	}
	
	public int getIntegerInput() throws NotANumberException {
        Scanner input = new Scanner(System.in);
        try {
           return input.nextInt();
        } catch( InputMismatchException e) {
            throw new NotANumberException();
        }
    }
	public float getFloatInput() throws NotANumberException {
        Scanner input = new Scanner(System.in);
        try {
           return input.nextFloat();
        } catch( InputMismatchException e) {
            throw new NotANumberException();
        }
    }
	
	public void viewAllEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	
	public void viewEmp(){
		
		System.out.println("Enter id: ");
		employeeId=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==employeeId) {
				System.out.println(emp);
				found=true;
			}
			
		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	//update employee details
	public void updateEmployee() throws NotANumberException {
			
		 try {
			 	System.out.println("Enter id: ");
			 	employeeId=getIntegerInput();
	        
	            if( employeeId < 0 )
	                throw new Exception("The Employee Id must be positive");
	        }
			catch(NotANumberException e) {
	            System.out.println(e.getMessage());

		 }
	     catch(Exception exc) {
	            System.out.println(exc.getMessage());
	        }
		 
		boolean found=false;
		for(Employee emp:empset) {
			if(emp.getId()==employeeId) {
				System.out.println("Enter name: ");
				name=sc.next();
				System.out.println("Enter new Salary");
				salary=sc.nextFloat();
				System.out.println("Enter department");
				department=sc.next();
				System.out.println("Enter mail");
				email=sc.next();
				emp.setName(name);
				emp.setSalary(salary);
				emp.setDepartment(department);
				emp.setEmail(email);
				emp.checkIsValidEmail(emp.getEmail());
				System.out.println("Updated details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details have been updated successfully !");
		}
	}
	
	public void deleteEmp() throws IdNotPresentException {
		System.out.println("Enter id");
		employeeId=sc.nextInt();
		boolean found=false;
		Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==employeeId) {
				empdelete=emp;
				found=true;
			}
		}
		if(found) {
		empset.remove(empdelete);
		System.out.println("Employee details are deleted successfully");
		}
		else 
			throw new IdNotPresentException("Id is not present");
	}

	public void addEmp() throws NotANumberException {
		try {
		 	System.out.println("Enter id: ");
		 	employeeId=getIntegerInput();  
            if( employeeId < 0 )
                throw new Exception("The Employee Id must be positive");
        }
		catch(NotANumberException e) {
	            System.out.println(e.getMessage());
		}
        catch(Exception exc) {
            System.out.println(exc.getMessage());
        }
		
		
		System.out.println("Enter Employee Name");
		name=sc.next();
		try {
		 	System.out.println("Enter Employee Salary: ");
		 	salary=getFloatInput();
        
            if( salary < 0 )
                throw new Exception("The Employee salary must be positive");
        }
		 catch(NotANumberException e){
		        System.out.println(e.getMessage());
		    }
        catch(Exception exc) {
            System.out.println(exc.getMessage());
        }
		System.out.println("Enter department");
		department=sc.next();
		System.out.println("Enter mail");
		email=sc.next();
			
		
		Employee emp=new Employee(employeeId, name, salary,department,email);
		emp.checkIsValidEmail(emp.getEmail());
		 
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employee details have been added successfully");
		
	}
	
}
