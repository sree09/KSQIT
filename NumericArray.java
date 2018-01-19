import java.io.*;
import java.util.*;
public class NumericArray{

    public static void main(String []args){
        int[] array = {5,-10,-5,9,0,1,6};
        Scanner scanner = new Scanner(System.in);
        //finding second smallest
		int smallest = array[0],second_smallest = array[0];
        int length = array.length;
        for(int i=1;i<length;i++){
            if(array[i]<smallest)
                smallest = array[i];
        }
        for(int i=1;i<length;i++){
            if(array[i]<second_smallest&&array[i]>smallest)
                second_smallest = array[i];
        }
        System.out.println(second_smallest);
		
		// inserting an element at given position
		
		System.out.println("Enter the position where you want to insert element:");
        int position = scanner.nextInt();
        System.out.println("Enter the element you want to insert:");
        int element = scanner.nextInt();
        if(position<=0 || position > length+1)
            System.out.println("please enter position within bounds");
        else{
            System.out.println("Original array:");
            for(int i = 0; i < length; i++)
            {
                System.out.print(array[i]+",");
            }
            array=insert(array,position,element);
            length=length+1;
            System.out.println("After inserting:");
            for(int i = 0; i < length; i++)
            {
                System.out.print(array[i]+",");
            }
        }
        //Deleting given value
        int counter=0;
        int value;
        int posi=0;
        System.out.println("Enter the value you want to delete:");
        value = scanner.nextInt();
        for(int i = 0; i < length; i++)
        {
            if(array[i]==value){
                posi=i+1;
                counter++;
            }
        }
        if(counter==0)
            System.out.println("Value not found in array");
        else{
            array=delete(array,posi);
            length = length-1;
            System.out.println("After Deleting:");
            for(int i = 0; i < length; i++)
            {
               System.out.print(array[i]+",");
            }
        }
        
        //Deleting an element at given position
        System.out.println("Enter the position where you want to delete element:");
        position = scanner.nextInt();
        if(position<=0 || position > length)
            System.out.println("please enter position within bounds");
        else{
            array=delete(array,position);
            length=length-1;
            System.out.println("After Deleting:");
            for(int i = 0; i < length; i++)
            {
                System.out.print(array[i]+",");
            }
        }
        //Sorting Array
        array=manualsort(array);
        System.out.println("After Sorting:");
        for(int i = 0; i < length; i++)
        {
            System.out.print(array[i]+",");
        }
    }
    public static int[] insert(int [] array,int position,int element){
		int [] temp = new int[array.length+1];
		for(int i = (array.length-1); i >= position-1; i--)
        {
                temp[i+1] = array[i];
        }
        temp[position-1] = element;
        for(int i = position-2;i>=0;i-- )
            temp[i] = array[i];
        return temp;
	}
	public static int[] delete(int [] array,int position){
		int [] temp = new int[array.length-1];
		for(int i = (temp.length-1); i >=position-1; i--)
        {
                temp[i] = array[i+1];
        }
        for(int i = position-2;i>=0;i-- )
            temp[i] = array[i];
        return temp;
	}
	public static int[] manualsort(int [] array){
	    int len = array.length;
	    int temporary = 0;
	    for (int i = 0; i < len; i++) 
        {
            for (int j = i + 1; j < len; j++) 
            {
                if (array[i] > array[j]) 
                {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        return array;
	}
}
