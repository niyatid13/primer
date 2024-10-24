********
  Description

Sara gave an assignment to her students. She gave a set of numbers to her students, and the students have to add the first maximum number and the first minimum number, and then the second maximum number and the second minimum number, up to the nth number. From that number, the students have to print the maximum number. Write a Java programme to help the students solve this problem.

Requirements:

The size of the array should be greater than 1 and the size should be an even number, else print "<size> is an odd number.Please enter even number".
If the array size is less than or equal to zero, print "<size> is an invalid array size".
If the size of the array is even number then print, "The maximum number is <MaxNum>".
Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided
Please do not use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter the array size

6

Enter the number

23

48

15

68

90

10

The maximum number is 100

Explanation:

1st maximum number = 90

1st minimum number = 10

Sum of 1st max and min = 100

2nd maximum number = 68

2nd minimum number = 15

Sum of 2nd max and min = 83

3rd maximum number = 48

3rd minimum number = 23

Sum of 3rd max and min = 71

Output will be "The maximum number is 100"

 

Sample Input/Output 2:

Enter the array size

5

5 is an odd number.Please enter even number

 

Sample Input/Output 3:

Enter the array size

-9

-9 is an invalid array size

***********

import java.util.Scanner;
import java.util.Arrays;
public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        
        if ( size <= 0){
            System.out.println(size + " is an invalid array size");
            return;
        } else if( size % 2 != 0){
            System.out.println(size + " is an odd number.Please enter even number");
            return;
        }
        
        int[] numbers = new int[size];
        
        System.out.println("Enter the number");
        
        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        
        Arrays.sort(numbers);
        
        int maxSum = Integer.MIN_VALUE;
        
        
        for( int i = 0; i < size/2; i++){
            int max = numbers[size - 1 - i];
            int min = numbers[i];
            int sum = max + min;
            
            if(sum > maxSum){
                maxSum = sum;
            }
            
        }
        
        System.out.println("The maximum number is " + maxSum);
       
    }
}
