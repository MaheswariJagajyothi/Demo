package demo;

public class ExecuteOperations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations2 obj= new Operations2();
		
		//No Return Type No Parameter
		obj.method1();
		
		//With Return Type No Parameter
		String temp=obj.method2();
		System.out.println(temp);
		
		//No Return Type With Parameter
		String temp1="No Return Type with Parameter";
		obj.method3(temp1);
		
		//With Return Type With Parameter
		String temp2="With Return Type With Parameter";
		String temp3=obj.method4(temp2);
		System.out.println(temp3);
	}

}
