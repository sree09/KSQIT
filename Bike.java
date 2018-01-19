package pkg2;
import pkg1.Car1
import java.io.*;
import java.util.*;
public class Bike extends Car1{
    private int BIKE_WHEELS = 2;
	static int inventory_count;
	public String color,make,model;
    public Bike(String color, String make, int year){
        super(color,make,year);
    }
	/*public final String getModel(){  //final method cannot be overridden
		int x=0;
		super.getModel();
	}*/
/*	private int getWheels(){
		int wheels = super.getWheels(); // providing error as trying to access private class.
	}*/
	/*float getMilage(){
		float milage = super.getMilage(); // providing error as tring to access default in another package subclass
	}*/
	public static void getInventory_count(){
		System.out.println(inventory_count);
	}
	public void display(){
		System.out.println("Vehicle Color: "++" Vehicle make: "+make+" Vehicle Year: "+year);
    public void methodOver(){
        super.methodOver();
        System.out.println("This is Bike class / Inherited");
    }
    public static void main(String []args){
        Bike obj= new Bike("Red","Honda",2009);
        inventory_count = 2500;
		obj.methodOver();
		obj.getInventory_count();
		obj.getMilage();
		obj.getModel();
		obj.getWheels();
    }
}