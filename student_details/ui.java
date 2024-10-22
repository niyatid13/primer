
import java.util.Scanner;
public class UserInterface {
    
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        
        VolumeCalculator calculator = new VolumeCalculator();
        
        System.out.println("Enter the choice\n1.Find Volume For Cylinder\n2.Find Volume For Cuboid");
        int choice = sc.nextInt();
        
        
        switch (choice){
            
            case 1:
                System.out.println("Enter the radius");
                double radius = sc.nextDouble();
                System.out.println("Enter the height");
                double height = sc.nextDouble();
                
                double cylinderVolume = calculator.calculateVolume(radius, height);
                System.out.printf("Volume of the Cylinder is %.2f\n", cylinderVolume);
                break;
              
                
            case 2:
                System.out.println("Enter the length");
                int length = sc.nextInt();
                System.out.println("Enter the breadth");
                int breadth = sc.nextInt();
                System.out.println("Enter the height");
                int Cuboidheight = sc.nextInt();
                
                double cuboidVolume = calculator.calculateVolume(length, breadth, Cuboidheight);
                System.out.printf("Volume of the Cuboid is %.2f\n", cuboidVolume);
                break;
                
            default:
                System.out.println("Invalid choice. Please enter 1 or 2");
                break;
            
        }
    }
}

