import java.io.*;
import java.util.*;
public class SecondSmallest{

     public static void main(String []args){
        int[] array = {5,-10,-5,9,0,1,6};
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
     }
}