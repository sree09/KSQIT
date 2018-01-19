package pkg1;
import java.io.*;
import java.util.*;
public class Car1{
    final CAR_PRICE=200;
	private int carwheels=4;
	float milaege=25.25;
	protected String color,make,model;
    public int year;
    public Car1(String color, String make, int year){
        this.color = color;
        this.make = make;
        this.year = year;
    }
	public final String getModel(){
		model="Basic";
		return model;
	}
	private int getWheels(){
		System.out.println("It is "carwheels" wheeler vehicle");
		return 4;
	}
	float getMilage(){
		return milaege;
	}
	
    public void methodOver(){
        System.out.println("This is Car class/Super");
		System.out.println("Vehicle Color: "+color+" Vehicle make: "+make+" Vehicle Year: "+year);
    }
    
}