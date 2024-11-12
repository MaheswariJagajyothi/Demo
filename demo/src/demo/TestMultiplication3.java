package demo;

public class TestMultiplication3 {
	public static void main(String args[])
	{
		Multiplication3 m = new Multiplication3();
		System.out.println(m.mul(2,5));
		
		System.out.println("----------------------------");
		DisplayMultiplication3 dm = new DisplayMultiplication3();
		System.out.println(dm.mul(3,5));
		
		System.out.println("----------------------------");
		MultiplicationVisible3 mv = new MultiplicationVisible3();
		System.out.println(mv.mul(4,5));
	}
}
