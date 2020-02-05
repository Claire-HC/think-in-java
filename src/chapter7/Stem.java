package chapter7;

public class Stem extends Root {
	private String name = "Tree";
	Stem() {}
	
	Stem(String phloemColor, int xylemLayer, int pithDiameter, String treeName) {
		super(phloemColor, xylemLayer, pithDiameter);
		name = treeName;
		System.out.println("It is called " + name + ".");
	}
	
	public static void main(String[] args) {
		Stem newTree = new Stem();
		Stem generalSherman = new Stem("yello", 2000, 2000, "General S");
	}

}
