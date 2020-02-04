package chapter5;

public class ArrayIni {
	
	public static void exercise19(Object[] args) {
		for(Object ele : args) {
			System.out.println(ele + " ");
		}
	}
	
	public static void main(String[] args) {
		ArrayIni.exercise19(new String[] {"one", "two", "three", "four"});
		
		String[] myStr = new String[] {"a", "b", "c", "d"};
		ArrayIni.exercise19(myStr);
	}

}
