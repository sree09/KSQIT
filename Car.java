class Car {
    int year;
    int speed = 0;
    String gear = "P" ,battery;

    public void setYear(int vehicleYear) {
         year = vehicleYear;
    }
	public void setSpeed(int vehicleSpeed) {
         speed = vehicleSpeed;
    }
    public void changeGear(String newGear) {
         gear = newGear;
    }
    public void accelerate(int increment) {
        speed = speed + increment;
    }
    public void brake(int decrement) {
         speed = speed - decrement;
	}
    public void calculateAge() {
        int currentYear = now.get(Calendar.YEAR);
		System.out.println("The age of car is " currentYear-year);
    }
	public void park() {
		speed = 0;
		gear = "P";
	}
	public void start(){
		battery = "ON";
	}
	public void stop(){
		gear = "P";
		speed = 0;
		battery = "OFF";
	}
}

class CarDemo {
    public static void main(String[] args) {        
        Car car = new Car();
        car.setYear(2005);
		car.start();
        car.changeGear("D");
		car.setSpeed(35);
		car.accelerate(10);
        car.calculateAge();
		car.brake(5);
		car.stop();
    }
}
