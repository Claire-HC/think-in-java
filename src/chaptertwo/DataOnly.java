package chaptertwo;

public class DataOnly {
	int i;
	double d;
	boolean b;
	
	public DataOnly() {
		this.i = 0;
		this.d = 0;
		this.b = false;
	}
	
	public DataOnly(int newI, double newD, boolean newB) {
		this.i = newI;
		this.d = newD;
		this.b = newB;
	}
	
	public static void main(String args[]) {
		DataOnly myData = new DataOnly(1, 1.1, true);
		
		System.out.println(myData.i);
		System.out.println(myData.d);
		System.out.println(myData.b);
	}

}
