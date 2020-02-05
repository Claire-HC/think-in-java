package chapter7;

public class Root {
	
	private Phloem treePhloem;
	private Xylem treeXylem;
	private Pith treePith;
	
	Root(){
		treePhloem = new Phloem();
		treeXylem = new Xylem();
		treePith = new Pith();
	}
	
	Root(String phloemColor, int xylemLayer, int pithDiameter) {
		treePhloem = new Phloem(phloemColor);
		treeXylem = new Xylem(xylemLayer);
		treePith = new Pith(pithDiameter);
	}

}
