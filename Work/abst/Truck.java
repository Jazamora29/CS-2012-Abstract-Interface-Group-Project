package abst;

import java.util.ArrayList;

public class Truck extends Vehicle{
	String name;
	String color;
	double weight;
	
	public void speed() {
		System.out.print(name + " drove at a speed of " + String.format("%.2f",((Math.random()*401)+100)/weight) + "mph");
	}

	public void paint() {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Purple");
		
		System.out.print(name + " was the color " + color);
		
		color = colors.get((int)(Math.random()*5));
		
		System.out.println(" and the new color is " + color);
	}
	
	public void drive() {
		super.drive(name, weight);
	}
}
