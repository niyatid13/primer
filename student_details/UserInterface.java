
import java.util.Scanner;
public class UserInterface {
    
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student's Id:");
        int studentId = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter Student's Name:");
        String studentName = sc.nextLine();
        
        System.out.println("Enter Student's address:");
        String studentAddress = sc.nextLine();
        
        String isFromNIT = "";
        while(true){
            System.out.println("Whether the student is from NIT(Yes/No):");
            isFromNIT = sc.nextLine();
            
            if(isFromNIT.equalsIgnoreCase("yes") || isFromNIT.equalsIgnoreCase("no")){
                break;
            } else{
                System.out.println("Wrong Input");
            }
        }
        
        Student student;
        
        if(isFromNIT.equalsIgnoreCase("yes")){
            
            student = new Student(studentId, studentName, studentAddress);
            
        } else{
            System.out.println("Enter the college name:");
            String collegeName = sc.nextLine();
            
            student = new Student(studentId, studentName, studentAddress, collegeName);
        }
        
        System.out.println("Student id:" + student.getStudentId());
        System.out.println("Student name:" + student.getStudentName());
        System.out.println("Address:" + student.getStudentAddress());
        System.out.println("College name:" + student.getCollegeName());
        
    
    }
}

