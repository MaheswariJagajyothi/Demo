package demo;

public class TestHierarchy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Dog obj1 = new Dog();
		Cat obj2 = new Cat();*/
		
		/*System.out.println("DOG");
		obj1.eat();
		obj1.sound();
		obj1.roam();
		obj1.sleep();
		obj1.bark();
		
		System.out.println();
		
		System.out.println("CAT");
		obj2.eat();
		obj2.sound();
		obj2.roam();
		obj2.sleep(); */
		
		/*
		Animal[] arr = new Animal[2];
		arr[0]=new Dog();
		arr[1]=new Cat();
		for(int i=0;i<arr.length;i++)
		{
			arr[i].sounds();
		}
		*/
		
		Animal1 a = new Animal1();
		Dog1 d = new Dog1();
		a.sounds(d);
	}

}
