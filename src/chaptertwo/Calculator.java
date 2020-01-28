package chaptertwo;

public class Calculator {
	
	public static int storage(String s) {
		return s.length() * 2;
	}
	
	public static void main(String args[]) {
		String argS = "Hello World";
		System.out.println(Calculator.storage(argS));
	}

}
