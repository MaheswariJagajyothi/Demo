package demo21;

public class Department1 extends Company1{
	int dept_id;
	String dept_name;
	Department1()
	{
		System.out.println("This is Zero parameterized in department class");
	}
	Department1(int dept_id, String dept_name)
	{
		// super(345,"CapGemini");
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		System.out.println("Department ID :: "+ this.dept_id);
		System.out.println("Department Name :: "+ this.dept_name);
	}
}
