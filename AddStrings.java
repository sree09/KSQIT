import java.io.*;
import java.util.*;
import java.math.*;
public class AddStrings{

     public static void main(String []args){
        Scanner s = new Scanner(System.in);
        String number1 = s.next();
        String number2 = s.next();
        int num1 = stringToint(number1);
        int num2 = stringToint(number2);
        int res = num1+num2;
        System.out.println(num2);
        System.out.println("The resultant string is "+res);
     }

    
    public static int stringToint(String str){
        int i = 0,number = 0;
        int len = str.length();
        while( i < len ){
            number *= 10;
            number += ( str.charAt(i++) - '0' );
        }
        return number;
    }   
}
//TODO: validate for strings and minus values '
//TODO: Static blocks
//TODO: package names