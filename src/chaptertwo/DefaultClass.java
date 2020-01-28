package chaptertwo;

/*
 *  Create a class containing an int and a char that are not initialized,
 *  and print their values to verify that Java performs default initialization.
 */
public class DefaultClass {
	public int i;
	public char c;
	
	public static void main(String args[]) {
	    DefaultClass test = new DefaultClass();
	    
	    System.out.println(test.i);
	    System.out.println(test.c);
	}

}
