import java.io.*;
import java.util.*;
public class StringArray{

    public static void main(String []args){
        String[] array = {"one","two","three","four","five"};
        Scanner scanner = new Scanner(System.in);
        int length = array.length;
        // inserting an element at given position
		
		System.out.print("Enter the position where you want to insert element:");
        int position = scanner.nextInt();
        System.out.print("Enter the element you want to insert:");
        String element = scanner.next();
        System.out.print("Original array:");       
        for(int i = 0; i < length; i++)
        {
            System.out.print(array[i]+",");
        }
        array=insert(array,position,element);
        length=length+1;
        System.out.print("After inserting:");
        for(int i = 0; i < length; i++)
        {
            System.out.print(array[i]+",");
        }
        
        //Deleting an element at given position
        System.out.print("Enter the position where you want to delete element:");
        position = scanner.nextInt();
        array=delete(array,position);
        length=length-1;
        System.out.print("After Deleting:");
        for(int i = 0; i < length; i++)
        {
            System.out.print(array[i]+",");
        }
        
    }
    public static String[] insert(String [] array,int position,String element){
		String [] temp = new String[array.length+1];
		for(int i = (array.length-1); i >= position-1; i--)
        {
                temp[i+1] = array[i];
        }
        temp[position-1] = element;
        for(int i = position-2;i>=0;i-- )
            temp[i] = array[i];
        return temp;
	}
	public static String[] delete(String [] array,int position){
		String [] temp = new String[array.length-1];
		for(int i = (temp.length-1); i >=position-1; i--)
        {
                temp[i] = array[i+1];
        }
        for(int i = position-2;i>=0;i-- )
            temp[i] = array[i];
        return temp;
	}
}
