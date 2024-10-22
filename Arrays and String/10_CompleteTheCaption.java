******
Description

Mr. Vicky gave a task to his students. He gave two words, but there were some spelling mistakes found. In the first string, "!" denotes the misspelt word. The second string has the correct spelling of the first string. Create a Java application and help the students remove the "!" and replace it with the correctly spelled character.

Requirements:

-        Both the Strings must be of the same length. Otherwise, print "Length of the strings <String1> and <String2> does not match"

-        Both the Strings must contain only alphabets and '!' symbol. Otherwise, print "<String> contains invalid symbols"

-       If both the strings contain invalid symbols, print "<String1> and <String2> contains invalid symbols"

-        The output must have the combined string without any symbols

Assume that space is allowed in between the words and assume that the second string always will have the correct spelt character of the misspelt first string in the respective positions.

Note:

-        In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.

-        Ensure to follow the object-oriented specifications provided in the question description.

-        Ensure to provide the names for classes, attributes, and methods as specified in the question description.

-        Adhere to the code template, if provided

Please do not use System.exit(0) to terminate the program.



Sample Input/Output 1:

Enter the first string

!ead

Enter the second string

rrrr

read

 

Sample Input/Output 2:

Enter the first string

F!n! !ut

Enter the second string

!i!d O!!

Find Out



Sample Input/Output 3:

Enter the first string

Po**t**n

Enter the second String

!!si!io!

Po**t**n contains invalid symbols

 

Sample Input/Output 4:

Enter the first string

!a!i!

Enter the second string

V*l*d

V*l*d contains invalid symbols

 

Sample Input/Output 5:

Enter the first string

pr!gra!!i!g

Enter the second string

programming

programming

 

Sample Input/Output 6:

Enter the first string

C!rr!s

Enter the second string

!a!!y

Length of the strings C!rr!s and !a!!y  does not match



Sample Input/Output 7:

Enter the first string

C%rr*

Enter the second string

&a%$y

C%rr* and &a%$y contains invalid symbols

********

import java.util.Scanner;
public class UserInterface {
    
    public static boolean isValidString( String str){
        
        return str.matches("[a-zA-Z! ]+");
    }
    
    public static String fixString( String str1, String str2){
        StringBuilder fixedString = new StringBuilder();
        
        for(int i = 0; i < str1.length(); i++){
            
            if(str1.charAt(i) == '!'){
                fixedString.append(str2.charAt(i));
            }
            else{
                fixedString.append(str1.charAt(i));
            }
        }
        
        return fixedString.toString();
    }
    
    
    
    
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        //fill the code here
        
        
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();
        
        System.out.println("Enter the second string");
        String str2 = sc.nextLine();
        
        if(str1.length() != str2.length() ){
            System.out.println("Length of the strings " + str1 + "and " + str2 + " does not match");
            return;
        }
        
        boolean isStr1valid = isValidString(str1);
        boolean isStr2valid = isValidString(str2);
        
        
        if(!isStr1valid && !isStr2valid){
            System.out.println(str1 + " and " + str2 + " contains invalid symbols");
            return;
        }
        else if(!isStr1valid){
            System.out.println(str1 + " contains invalid symbols");
            return;
            
        } else if (!isStr2valid){
            System.out.println(str2 + " contains invalid symbols");
            return;
            
        }
        
        String result = fixString(str1, str2);
        System.out.println(result);

        
        sc.close();
    }
}

        
