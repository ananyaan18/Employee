package employee;

import java.util.regex.Pattern;

public class Employee {
	protected int employeeId;
	protected float salary;  
	protected String name;
	protected String department, email;  
	
	public Employee() {
		this.employeeId=0;
		this.salary=0.00f;
		this.name="";
		this.department="";
		this.email="";
		}
	
	Employee(int employeeId, String name,float salary) 
	{
		this.employeeId=employeeId;
		this.name=name;
		this.salary=salary;
	}
	Employee(int employeeId, String name,float salary, String department, String email) 
	{
		this.employeeId=employeeId;
		this.name=name;
		this.salary=salary;
		this.department=department;
		this.email=email;
	}
	  
	Employee(String name,float salary)
	{

	     this.name = name;
	     this.salary = salary;
	}
	 
	public int getId() {
		return employeeId;
	}
	public void setId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {  
	    return name;  
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getSalary() {  
	    return salary;
	}
	public void setSalary(float salary) {
		this.salary=salary;
	}
	
	public String getDepartment() {  
	    return department;  
	}  
	public void setDepartment(String department) {  
	    this.department = department;  
	}  
	
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	
	@Override  
	public String toString() {  
	    return "Employee Id= " + employeeId + ", Salary = " + salary + ", Name = " + name + ", Department = " + department + ", Email = " + email;  
	    }  
	
	public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" + "sap" + "[.]" +"com";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
	
	public void checkIsValidEmail(String email) {
		if(!(isValid(email)))
			System.out.println(email + " is not a valid mail id. Enter Valid Email");
	}
	
	public float getBonus(float salary)
	{
		  int increment = 0;  
		  increment += (salary * 5)/100;  
	      salary = salary+increment; 
	      return salary;
	              
	}

}
