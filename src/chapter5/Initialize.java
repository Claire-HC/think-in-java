package chapter5;

public class Initialize {
	public String nonInitialized =  new String();
	public String initialized = "auto-initialized";
	public String constructorInitialized = new String();
	
	//default constructor
	public Initialize() {
		constructorInitialized = "Hello World";
		System.out.println(constructorInitialized);
	}
	
	public Initialize(String name) {
		constructorInitialized = "Hello " + name;
		System.out.println(constructorInitialized);
	}
	
	public static void main(String[] args) {
		Initialize newObject = new Initialize();
		Initialize firstObject = new Initialize("Hong");
	}

}
