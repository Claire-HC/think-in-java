package chapter3;

import java.util.*;

public class CoinFlipping {
	
	private Random rander = new Random(99);
	
	public CoinFlipping() {
		
	}
	
	public CoinFlipping(int seed) {
		this.rander = new Random(seed);
	}
	
	public String flipping() {
		int result = this.rander.nextInt(2);
		if (result == 0) {
			return "head";
		} else {
			return "back";
		}
	}
	
	public static void main(String[] args) {
		CoinFlipping coin = new CoinFlipping();
		for (int i=0; i<20; i++) {
			System.out.println(coin.flipping());
		}
	}

}
