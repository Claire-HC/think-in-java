package chaptertwo;
//import java.util.*;

public class Circle {
	
	public int[] center = new int[2];
	public int radius = 0;
	
	public Circle() {
		center[0] = 0;
		center[1] = 0;
		radius = 0;
	}
	
	public Circle(int x, int y, int radius) {
		center[0] = x;
		center[1] = y;
		this.radius = radius;
	}
	
	public static void main(String args[]) {
		Circle myCircle = new Circle(0,1,2);
		System.out.println(myCircle.radius);
		System.out.println(myCircle.center[0]);
		System.out.println(myCircle.center[1]);
	}

}
