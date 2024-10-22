********
Description

Sundram travels is one of the famous travel agencies, they would like to automate their application. Passengers have a facility to check whether buses are available for their destination. Write a java program to help the travel agency to do this task.

Assumptions:

Assume buses available for these 10 cities only
Chennai, Coimbatore, Erode, Karur, Madurai, Hyderabad, Salem, Bangalore, Delhi, Agra
Requirements:

If bus available for the city then, print "Bus for <city name> is available"
If bus not available for the city then, print "Bus for <city name> is not available" 
City names are case insensitive .

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided
Please do not use System.exit(0) to terminate the program.



Sample Input/Output 1:

Enter the city name

Delhi

Bus for Delhi is available



Sample Input/Output 2:

Enter the city name

Mumbai

Bus for Mumbai is not available



Sample Input/Output 3:

Enter the city name

chennai

Bus for chennai is available

********

import java.util.Scanner;
public class UserInterface{
    
    
    private static final String[] availableCities = {
        "Chennai", "Coimbatore", "Erode", "Karur", "Madurai", "Hyderabad", "Salem",
        "Bangalore", "Delhi", "Agra"
    };
    
    public static boolean isBusAvailable(String city){
        for( String availableCity : availableCities){
            if(availableCity.equalsIgnoreCase(city)){
                return true;
            }
        }
        
        return false;
    }
    
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       
        //Fill the code here
        
        System.out.println("Enter the city name");
        String cityName = sc.nextLine();
        
        if(isBusAvailable(cityName)){
            System.out.println("Bus for " + cityName + " is available");
        } else {
            System.out.println("Bus for " + cityName + " is not available");

        }
        
        sc.close();
        
    }
}
