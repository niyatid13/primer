*****
Description
Sky Airlines company wants to print a message based on the inputs given by the customers. Help them by writing a java application to get the customer name, source and destination and print the message in following format.

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.


Sample Input:

Enter name

Jack

Enter source

Dubai 

Enter destination

Chicago

Sample Output:

Dear Jack, welcome onboard with service from Dubai to Chicago. Thankyou for choosing Sky Airlines. Enjoy your flight.
**********


import java.util.Scanner;
public class UserInterface {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter source");
        String source = sc1.nextLine();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter destination");
        String destination = sc2.nextLine();
        
        System.out.print(" Dear " + name + ", welcome onboard with service from "+ source + " to " + destination +"."+" Thankyou for choosing Sky Airlines. Enjoy your flight.");
    } 
}
