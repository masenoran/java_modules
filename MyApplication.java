package M2_Activity6;

public class MyApplication {
public static void main(String[] args) {
		
		Car car = new Car("Mercedez", 4);
		Truck truck = new Truck("Scania", 10);
		
		car.startEngine();
		car.refuel();
		destroyVehicle(car);
		
		System.out.println();
		
		truck.startEngine();
		truck.refuel();
		destroyVehicle(truck);
	}
	
	public static void destroyVehicle(Vehicle name) {
		name.destroy();
	}
}
