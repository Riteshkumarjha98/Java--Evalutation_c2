package com.p3;

public class OLA {
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		Car car;
		if(numberOfPassenger > 3) {
			
			car = new Sedan();
		}
		
		else {
			
			car = new HathBack();
		}
		
		car.setNumberOfPassenger(numberOfPassenger);
		car.setNumberOfKms(numberOfKMs);
		
		return car;
	}
	
	public int calculateBill(Car car) {
		int totalFare;
		if(car instanceof HathBack) {
			HathBack hatchCar = (HathBack)car;
			totalFare = car.getNumberOfKms()*hatchCar.farePerKm;
		}
		else {
			
			
			Sedan sedanCar = (Sedan)car;
			totalFare = car.getNumberOfKms()*sedanCar.farePerKm;
		}
		
		
		return totalFare;
	}
}