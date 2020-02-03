package chapter4;

import java.util.ArrayList;
import java.util.List;

public class PrimeSelector {
	
	public List<String> primeFilter(int max) {
		List<String> resultPool = new ArrayList<>();
		
		// Test every number from 1 to max
		for(int currNum = 1; currNum < max + 1; currNum++) {
			//currNum is treated as prime number by default
			boolean isPrime = true;
			for(int testNum = 2; testNum < currNum; testNum++) {
				// currNum is not prime number
				if(currNum % testNum == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(currNum + " is prime");
				resultPool.add(Integer.toString(currNum));
			} else {
				System.out.println(currNum + " is not a prime");
			}
		}
		return resultPool;
	}
	
	public static void main(String[] args) {
		PrimeSelector newSelector = new PrimeSelector();
		//newSelector.primeFilter(30);
		//for(String string : )
		System.out.println(newSelector.primeFilter(30).toString());
	}

}
