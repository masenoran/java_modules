package M2_Activity6;

public class Truck extends Vehicle implements Refuelable{
	public Truck() {
		
	}
	
	public Truck(String brand, int numberOfWheels) {
		this.setBrand(brand);
		this.setNumberOfWheels(numberOfWheels);
	}
	
	public void startEngine() {
		System.out.println("Engine started for " + getBrand() + " truck with " + getNumberOfWheels() + " wheels");
	}

	@Override
	public void refuel() {
		System.out.println(getBrand() + " is refueled");

	}
	
	public void destroy() {
		System.out.println(getBrand() + " has been destroyed!");
	}
}
