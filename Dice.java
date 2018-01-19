import java.io.*;
import java.util.*;
import java.math.*;
public class Main{

     public static void rollDice(){
           int outcome=(int)(Math.random()*6+1);
            System.out.println("The dice outcome is "+outcome);
	 }
	 public static void main(String []args){
        String input;
		rollDice();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Do you want to roll again? YES/N0");
            input = scanner.nextLine();
    		switch(input){
	    		case "YES": 
		    	case "yes": rollDice();
			    			break;
			    case "no":
			    case "NO":  System.out.println("Thank you for playing");
				    		break;
			    default: System.out.println("Please Enter correct choice");
		    }
        }while(input.equals("yes")||input.equals("YES"));
    }

}