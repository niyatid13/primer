*******
Description

Harry bought a new phone. He decides to put a safety lock on his phone for which he wants to create a pin number. He asked his friend to suggest some four-digit numbers, but the numbers should pass some of his conditions. If the number passes the condition, he will keep it as a pin number. Help him validate the PIN number using a Java program.

Requirements:

The total number of PIN numbers entered should be a value greater than 0, else print "<no of PIN number> is an invalid number".
The PIN number should be a four-digit number, else print "<PIN number> is an invalid PIN number"
Condition for the PIN number:

The starting number should be an odd number
The second number should be an even number
The third number should be a prime number
The last number should be a composite number
Assume numbers only between 1 to 9.
If all the numbers fail the above condition, then print "All these <no of PIN number> numbers are not a valid PIN number"
If more than one PIN number passes the condition, then print the number
Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided
Please do not use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter the total number of PIN numbers

4

Enter the PIN numbers

1234

8975

5656

2589

Valid PIN numbers are

1234

5656

 

Sample Input/Output 2:

Enter the total number of PIN numbers

2

Enter the PIN numbers

2659

1398

All these 2 numbers are not a valid PIN number

 

Sample Input/Output 3:

Enter the total number of PIN numbers

3

Enter the PIN numbers

1829

564

564 is an invalid PIN number

 

Sample Input/Output 4:

Enter the total number of PIN numbers

-1

-1 is an invalid number

*********

import java.util.Scanner;
public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        
        System.out.println("Enter the total number of PIN numbers");
        int totalPinNumbers = sc.nextInt();
        
        if(totalPinNumbers <= 0){
            System.out.println(totalPinNumbers + " is an invalid number");
            return;
        }
        
        String[] pins = new String[totalPinNumbers];
        boolean hasValidPin = false;
        StringBuilder ValidPins = new StringBuilder();
        
        System.out.println("Enter the PIN numbers");
        for(int i = 0; i < totalPinNumbers; i++){
            pins[i] = sc.next();
            
            
        if(pins[i].length() != 4 || !pins[i].matches("\\d{4}") ){
            System.out.println(pins[i] + " is an invalid PIN number");
            continue;
        }
        
        if(isValidPin(pins[i])){
            ValidPins.append(pins[i]).append("\n");
            hasValidPin = true;
        }
        }
        
        if(hasValidPin){
            System.out.println("Valid PIN numbers are");
            System.out.println(ValidPins.toString());
        } else {
            System.out.println("All these " + totalPinNumbers + "numbers are not a valid PIN number");
        }
    }
    
    
    public static boolean isValidPin(String pin){
        int firstDigit = Character.getNumericValue(pin.charAt(0));
        int secondDigit = Character.getNumericValue(pin.charAt(1));
        int thirdDigit = Character.getNumericValue(pin.charAt(2));
        int fourthDigit = Character.getNumericValue(pin.charAt(3));
        
        
        if(firstDigit % 2 == 0){
            return false;
        }
        
        if(secondDigit % 2 != 0){
            return false;
        }
        
        if(!isPrime(thirdDigit)){
            return false;
        }
        
        if(!isComposite(fourthDigit)){
            return false;
        }
        
        return true;
    }
    
    
    public static boolean isPrime(int num){
        if( num < 2){
            return false;
        }
        
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % 2 == 0){
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean isComposite(int num){
        if(num < 2){
            return false;
        }
        
        return !isPrime(num);
    }
}

        

