package examples;

public class A {

	
	
	A(){
		System.out.println("test1");
	}
	static int numbers = 0;
	String NameString;
	{
		NameString = "String " + String.valueOf(++numbers);
		System.out.println(NameString);
	}

	//A(String st1, String st2) {
	//	System.out.println(st1 + st2);
		//System.out.println("Parent class");
	//}
	
	//public static void method1(int a1) {
	//	System.out.println("static method 1");
	//}
	
	public int method1(int a1) {
		System.out.println(" method 2");
		
		a1 = 10;
		//A.method1(5);
		return  a1;
	}
	
}
