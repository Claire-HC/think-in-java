package chapter3;

import java.util.*;

public class Dog {
	
	private String name = new String();
	private String says = new String();
	
	public Dog() {
		
	}
	
	public Dog(String newName, String newSays) {
		this.name = newName;
		this.says = newSays;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSays() {
		return this.says;
	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("spots", "Ruff!");
		Dog dog2 = new Dog("cruffy", "Wurf!");
		Dog dog3 = new Dog();
		
		System.out.println(dog1.getName() + " " + dog1.getSays());
		System.out.println(dog2.getName() + " " + dog2.getSays());
		
		dog3 = dog1;
		System.out.println(dog3 == dog1);
		System.out.println(dog3.name == dog1.name);
		System.out.println(dog3.equals(dog1));
		System.out.println(dog3.says.equals(dog1.says));
	}

}
