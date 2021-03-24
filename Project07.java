package project07;
//Jacob Vaught
//Due-10-14-2020
//Date-10-12-2020
//Outputs a picture based on the user entry. Looks like a Diamond
import java.util.Scanner;

public class Project07 {
	public static final int ZERO=0;
	public static final int ONE=1;
	public static final String STAR="*";
	public static final String DOLLAR_STAR="$*";
	public static final String SPACE=" ";
	
	public static void main(String[] args) {
		//Prepare
		 
		
		//declare scanner object
		Scanner keyboard = new Scanner(System.in);
		//tells user to input a number
		System.out.print("Enter a Whole number for n: ");
		//lets user input next number for n
		int n=keyboard.nextInt();
		//checks to confirm n > 2
		if(n<2) {
			System.out.println(STAR);
		// end bracket of first level if statement [ONE]
		}
		
		//if user guess>than random output lower
		else if(n>=2) {
			
			// 2nd level for statement [ONE]
			for (int i = ZERO; i<(n-ONE); i++) {
				
				// 3rd level for statement [ONE]
				for (int j = (n-i); j>ZERO; j--) {
				
					//print the spaces before each line
					System.out.print(SPACE);
				
					// End Bracket of 3rd level for statement [ONE]
	    	    	}
				
				//Print first star of each line
				System.out.print(STAR);
				
				// 3rd level for statement [2]
				for (int k = i; k>ZERO; k--) {
					
					//print the spaces before each line
					System.out.print(DOLLAR_STAR); 
					
					// End Bracket of 3rd level for statement [2]
					}
				
				//Prints New line	
				System.out.println();
			
			// End Bracket of 2nd level for statement[ONE]
			}
		
			// 2nd level for statement [2]
			for (int i = n-ONE; i>ZERO; i--) {
				
				// 3rd level for statement [3]
				for (int j = ZERO; j<(n-i); j++) {
				
					//print the spaces before each line
					System.out.print(SPACE);
				
					// End Bracket of 3rd level for statement [3]
	    	    	}
				
				//Print first star of each line
				System.out.print(STAR);
				
				// 3rd level for statement [4]
				for (int k = i; k>ZERO; k--) {
					
					//print the dollar sign and star before each line
					System.out.print(DOLLAR_STAR); 
					
					// End Bracket of 3rd level for statement [4]
					}
				
				//Printing New Line
				System.out.println();
			
			// End Bracket of 2nd level for statement[2]
			}
			
			// 2nd level for statement [3]
			for (int j = ZERO; j<n; j++) {
				
				//print the spaces before LAST line
				System.out.print(SPACE);
			
			// 2nd level for statement [2]	
			}
			
			//Print the last star.
			System.out.print(STAR);
		

		// end bracket of first level if statement [2]
		}
			//close scanner object
			keyboard.close();
	//Ending Bracket of method main
	}
	//ennding bracket of class
	}

