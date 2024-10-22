********
  Description

Henry has a magic goose. The goose will lay eggs only for 30 consecutive days in a year. The number of eggs laid by the goose will be in the following pattern. On day 1, it will lay 1 egg, on day 2, it will lay 2 eggs, on day 3 it will lay 5 eggs, on day 4 12 eggs and so on. Write a java program to calculate the number of eggs the goose will lay on a particular day. 

Note: The egg laying pattern follows the pell series. i.e.,[0,1,2,5,12,29,70...]

If the day is more than 30 or negative or zero, then print "<<day>> is invalid day". 

Note:

- In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.

- Adhere to the code template, if provided. 

- Please don't use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter the day

15

Number of eggs in 15th day is 195025

Sample Input/Output 2:

Enter the day

40

40 is invalid day

Sample Input/Output 3:

Enter the day

-9

-9 is invalid day

**********

import java.util.Scanner;
public class UserInterface {
    
    public static int[] generatePellseries() {
        int[] pellseries = new int[31];
        
        pellseries[0] = 0;
        pellseries[1] = 1;
            
        for (int i = 2; i <= 30; i++){
            pellseries[i] = 2 * pellseries[i - 1] + pellseries[i - 2];
        }
        
        return pellseries;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //Fill the code here
        int[] pellseries = generatePellseries();
        
        System.out.println("Enter the day");
        
        int day = sc.nextInt();
        
        if( day <= 0 || day > 30 ){
            System.out.println(day + " is invalid day");
        } else {
            
            System.out.println("Number of eggs in " + day + "th day is " + pellseries[day]);
        }
        sc.close();
        
    }
    
}
