package abst;

public abstract class Vehicle {
	public abstract void speed();
	public abstract void paint();
	public void drive(String name, double weight) {
		System.out.print(name + " drove for " + String.format("%.2f",((Math.random()*901)+100)/weight) + " miles");
	}
}
