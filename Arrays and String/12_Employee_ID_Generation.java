********
Description

SIET private limited is all set to begin a new academic year with a bunch of talents. They need to give employee ids to all the freshers of all team. The employee id is generated by using the training id of the employees which was given at the time of training. Help the company in generating employee id by developing a java application

Requirements:

-The training id should  only contain 9 digits, otherwise  print "<training id> is an invalid training id" and terminate the application

-The first 4 digits in the training id represent year in which people got trained(it should be 2021), if not print "<year> is an invalid year" and terminate the application

-The 5th and 6th digits represent team codes

 01 - LP
 02 - TA
 03 - CT
 04 - PT
 05 - TT
-Any other digits than the above mentioned one is given then print "<code> is an invalid team code"  and terminate the application

-The last 3 digits should be the employees roll number starting from 001 to 999, if not print  "<roll no> is an invalid roll number" and terminate the application.

-The generated employee id should be 9 characters long with the first 4 letters as SIET, the next two letters can be LP/TA/CT/PT/TT depending on the team code in the training id and the last 3 digits should be the employee's roll number.

- The trainingId is validated in accordance with the prescribed order.

[i.e when 1 or more validation rules gets violated , the first violation message gets displayed. Refer sample output]

Note:

       In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
       Ensure to follow the object-oriented specifications provided in the question description.
       Ensure to provide the names for classes, attributes, and methods as specified in the question description.
      Adhere to the code template, if provided
Please do not use System.exit(0) to terminate the program.



Sample Input/Output 1:

Enter the training id

202103069

Employee Id: SIETCT069

[Explanation : Employee Id is generated for the valid training id].



Sample Input/Output 2:

Enter the training id

202115

202115 is an invalid training id

[ Explanation: In the given input the length of the training id is less than 9]



Sample Input/Output 3:

Enter the training id

201005869

2010 is an invalid year

[Explanation: In the given input , the year mentioned is incorrect].

 

Sample Input/Output 4:

Enter the training id

202119000

19 is an invalid team code

[Explanation: In the given input , both team code and the roll number is incorrect].



Sample Input/Output 5:

Enter the training id

202101000

000 is an invalid roll number

[Explanation: In the given input , the roll number is incorrect].

********

import java.util.Scanner;
public class UserInterface 
{
    public static void main(String args[]) 
    {
    
        Scanner sc =new Scanner(System.in);
        //Fill the code
        
        System.out.println("Enter the training id");
        String trainingId = sc.nextLine();
        
        if(trainingId.length() != 9 || !trainingId.matches("\\d{9}")) {
            System.out.println(trainingId + " is an invalid training id");
            return;
        }
        
        String year = trainingId.substring(0,4);
        String teamCode = trainingId.substring(4,6);
        String rollNumber = trainingId.substring(6);
        
        if(!year.equals("2021")){
            System.out.println(year + " is an invalid year");
            return;
            
        }
        
        String team = "";
        switch(teamCode) {
            
            case "01":
                team = "LP";
                break;
                
            case "02":
                team = "TA";
                break;
            
            case "03":
                team = "CT";
                break;
                
            case "04":
                team = "PT";
                break; 
            
            case "05":
                team = "TT";
                break;    
                
            default:
                System.out.println(teamCode + " is an invalid team code");
                return;
                
        }
        
        if(rollNumber.equals("000")){
            System.out.println(rollNumber + " is an invalid roll number");
            return;
        }
        
        String employeeId = "SIET" + team + rollNumber;
        System.out.println("Employee Id: " + employeeId);

        
        sc.close();
    }
    
}   

        
