package ch03;

public class MainTest1 {

	public static void main(String[] args) {

		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("---------------");
		
		Car menualCar = new MenualCar();
		menualCar.run();
		System.out.println("---------------");
	}

}
