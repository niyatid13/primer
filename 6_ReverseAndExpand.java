*********
Description
Oliver and his friend are playing a number game. If Oliver says a 4-digit number, his friend should reverse the number and expand the number.

If the number is not a 4-digit number, then print '<<number>> is an invalid number'.

Note:

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by   

  the user and the rest of the text represents the output.

- Adhere to the code template, if provided. 

- Please don't use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter the number

456

456 is an invalid number

Sample Input/Output 2

Enter the number

5864

Reversed number is 4685

4000+600+80+5

Sample Input/Output 3

Enter the number

3400

Reversed number is 43

40+3

***********

import java.util.Scanner;
public class UserInterface {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //Fill the code here
        
        System.out.println("Enter the number");
         int number = sc.nextInt();
         
         if ( number < 1000 || number > 9999){
             System.out.println(number + " is an invalid number");
         } else {
             int reversedNumber = reverseNum(number);
             System.out.println("Reversed number is " + reversedNumber);
             printExpandedform(reversedNumber);
         }
        
    }
     private static int reverseNum ( int number){
         int reversedNumber = 0;
         while( number != 0){
             int digit = number % 10;
             reversedNumber = reversedNumber * 10 + digit;
             number /= 10;
         }
         return reversedNumber;
     }
     
     private static void printExpandedform(int number){
         int placeValue = 1000;
         while( placeValue >= 1){
             int digit = number / placeValue;
             if( digit != 0){
                 System.out.print(digit * placeValue);
                 if(placeValue > 1){
                     System.out.print("+");
                     
                 }
                 number %= placeValue;
             }
             placeValue /= 10;
         }
     }
}
