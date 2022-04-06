package employee;

public class Manager extends Employee {
	int reward;
    public Manager(int employeeId,String name,float salary,int r)
    {
        super(employeeId,name,salary);
        reward=r;
    }
   
    public String toString() {  
	    return "Manager rewards to Employee [Employee Id = " + employeeId + ", Salary = " + salary + ", Name = " + name + "]";  
	    }  
}

