package chaptertwo;

public class Incrementable {
	static void increment() {
		StaticTest.i++;
	}
	
	static void exercise7() {
		Incrementable.increment();
		System.out.println(StaticTest.i);
	}
	
	static void exercise8() {
		// create three object
		StaticTest test1 = new StaticTest();
		StaticTest test2 = new StaticTest();
		StaticTest test3 = new StaticTest();
		
		//print
		System.out.println(test1.i);
		System.out.println(test2.i);
		System.out.println(test3.i);
		
		//increment
		Incrementable.increment();
		
		// print
		System.out.println(test1.i);
		System.out.println(test2.i);
		System.out.println(test3.i);
	}
	
	public static void main(String args[]) {
		Incrementable.exercise7();
		Incrementable.exercise8();
	}

}
