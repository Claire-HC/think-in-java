package chapter3;

import java.util.*;

/*
 * Generate random length and time
 * then calculate the speed/velocity
 */
public class Speed {
	
	private Random rand = new Random(99);
	private int length = 0;
	private int time = 0;
	
	public Speed() {
		this.length = this.rand.nextInt(1000) + 1;
		this.time = this.rand.nextInt(100) + 1;
	}
	
	public Speed(int seed) {
		Random newRand = new Random(seed);
		this.rand = newRand;
		this.length = this.rand.nextInt(1000) + 1;
	}
	
	public float getSpeed() {
		return (float)this.length / (float)this.time;
	}
	
	public static void main(String[] args) {
		Speed speed1 = new Speed(1000);
		Speed speed2 = new Speed();
		System.out.println(Float.toString(speed1.getSpeed()));
		System.out.println(Float.toString(speed2.getSpeed()));
	}

}
