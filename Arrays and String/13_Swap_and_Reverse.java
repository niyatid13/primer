********
Description

Guru gave a task to his students. He gave a sentence and the students have to swap the first and the last words and reverse the middle character. Help the students to solve this task using a java program

Requirements:

-        The words present in the sentence must be more than 2, else print "Invalid Length"

-        The word should contain only alphabets and space, else print "<sentence> is an invalid sentence"

Note:

-        In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.

-        Ensure to follow the object-oriented specifications provided in the question description.

-        Ensure to provide the names for classes, attributes, and methods as specified in the question description.

-        Adhere to the code template, if provided

Please do not use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter the sentence

Do you wear your mask

mask ruoy raew uoy Do

 

Sample Input/Output 2:

Enter the sentence

Card reader

Invalid Length

 

Sample Input/Output 3:

Enter the sentence

Refer @ friend

Refer @ friend is an invalid sentence
*********


import java.util.Scanner;
public class UserInterface 
{
    public static void main(String args[]) 
    {
    
        Scanner sc =new Scanner(System.in);
        //Fill the code
        
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();
        
        if(!sentence.matches("[a-zA-Z ]+")){
            System.out.println(sentence + " is an invalid sentence");
            return;
        }
        
        String[] words = sentence.split(" ");
        
        if(words.length <= 2){
            System.out.println("Invalid Length");
            return;
        }
        
        String temp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;
        
        
        for(int i = 1; i < words.length - 1; i++){
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        
        int left = 1;
        int right = words.length - 2;
        while(left < right){
            
            String midtemp = words[left];
            words[left] = words[right];
            words[right] = midtemp;
            left++;
            right--;
        }
        
        
        String result = String.join(" ", words);
        System.out.println(result);
        
        sc.close();
    }
    
}   
