package chaptertwo;

import java.util.HashMap;

public class AllTheColorsOfTheRainbow {
	//7 colors for the rainbow
	//int will be converted to Integer by Java Autoboxing
	private HashMap<Integer, String> rainbowColorMap = new HashMap<Integer, String>();

	//the number represent the main color of the rainbow
	private int anIntegerRepresentingColor = 0;
	
	public AllTheColorsOfTheRainbow() {
		this.rainbowColorMap.put(1, "red");
		this.rainbowColorMap.put(2, "orange");
		this.rainbowColorMap.put(3, "yellow");
		this.rainbowColorMap.put(4, "green");
		this.rainbowColorMap.put(5, "cyan-blue");
		this.rainbowColorMap.put(6, "blue");
		this.rainbowColorMap.put(7, "purple");
	}
	
	/*
	 * Visible to the user, to manipulate the main color
	 * @return the current main color
	 * @param newHue give me the number of the color according to the RainbowColorMap
	 */
	public String changeTheHueOfTheColor(int newHue) {
		this.anIntegerRepresentingColor = newHue;
		
		//check the color from the rainbowcolormap. Gray means no color
		String nowColor = null;
		nowColor = this.rainbowColorMap.get(this.anIntegerRepresentingColor);
		if (nowColor == null) {
			System.out.println("Give me another number");
			return null;
		} else {
			return nowColor;
		}
	}
	
	public static void main (String args[]) {
		AllTheColorsOfTheRainbow myRainbow = new AllTheColorsOfTheRainbow();
		
		int numColor = -1;
		numColor = Integer.parseInt(args[0]);
		
		if(numColor!=-1) {
			String myRainbowColor = myRainbow.changeTheHueOfTheColor(Integer.parseInt(args[0]));
			if(myRainbowColor != null) {
				System.out.println("The current main color of the rainbow is " + myRainbowColor);
			} else {
				System.out.println("Give me another number!");
			}
		}
	}
}
