package employee;

public class Emp extends Employee implements Comparable<Emp> {
	private String name;
	private float salary;
	
	public Emp(String name, float salary)
	{
		super(name,salary);
	 }
		 
	public int compareTo(Emp other)
	{
	      return Float.compare(salary, other.salary);
     }
}

