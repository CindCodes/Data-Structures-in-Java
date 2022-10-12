import java.util.Scanner;

public class PersonalizedHelloWorld {
	public static void main(String[] args) {
		  
	    System.out.println("What is your name?");

	    Scanner input = new Scanner(System.in);
	    String userName = input.nextLine();
	    
	  while (userName.isEmpty()) { 
	    System.out.println("Please enter your name: ");
	    userName = input.nextLine();
	    if(!userName.isEmpty()){
	      System.out.println("Hello, "+ userName+ "!");
	     }
	    }
	  }
	}
