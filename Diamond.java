package project07;

import java.util. Scanner;

public class Diamond {
public static void main(String[] args) {
// Declare and Instantiate scanner object
Scanner keyboard = new Scanner (System.in);
// Prompt for and obtain n from the user
System.out.print("Enter n: ");
// Note #1: n should n - 1
int n = (keyboard.nextInt()) - 1;
// Outer loop
// Note #2: should go from -n to +n
for(int i = -n; i <= n; ++i) {
// Output spaces
// Note #3: the number of spaces is equal to
// the absolute value of the outer loop variable
for(int spaces = 0; spaces < Math.abs(i); ++spaces) {
System.out.print(" ");
}// Ending bracket of INNER spaces for loop
// Output asterisk-dollar sign block
// Note #4: the number of blocks is equal to
// n — the absolute value of the outer loop variable
for(int blocks = 0; blocks < (n - Math.abs(i)); ++blocks) {
System. out. print("*$");
}// Ending bracket of INNER blocks for loop
//f Output the ending asterisk
System.out.println("*");
}// Ending bracket of OUTER for loop
// Close the scanner object
keyboard. close();
}// Ending bracket of method main
}// Ending bracket of class Diamond Looppackage project07;