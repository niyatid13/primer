
import java.util.Scanner;
import java.util.*;
public class UserInterface {
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);
        // Fill the code here
        
        System.out.println("Enter the products count");
        int productCount = sc.nextInt();
        sc.nextLine();
        
        if(productCount <= 0){
            System.out.println("Invalid count");
            return;
        }
        
        List<Product> productList = new ArrayList<>();
        
        System.out.println("Enter Product details");
        for(int i = 0; i < productCount; i++){
            String input = sc.nextLine();
            String[] details = input.split(":");
            
            int id = Integer.parseInt(details[0]);
            String name = details[1];
            double price = Double.parseDouble(details[2]);
            
            productList.add(new Product(id, name, price));
            
        }
        
        
        System.out.println("1.Sort By Id");
        System.out.println("2.Sort By Price");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        
        
        switch(choice){
            
            case 1:
                Collections.sort(productList, new SortById());
                System.out.println("After Sorting By Id");
                break;
                
            case 2:
                Collections.sort(productList, new SortByPrice());
                System.out.println("After Sorting By Price");
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        
        for(Product product: productList){
            System.out.println(product);
        }
            
        
    }

}
