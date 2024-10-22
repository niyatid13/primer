
import java.util.Scanner;
public class UserInterface {
    
    public static void main(String[] arg)
    {
        // Fill the code
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter movie name");
        String movieName = sc.nextLine();
        
        
        System.out.println("Enter no of bookings");
        int noofbookings = sc.nextInt();
        
        System.out.println("Enter the available tickets");
        int availableTickets = sc.nextInt();
        Ticket.setAvailableTickets(availableTickets);
        
        for( int i = 0; i < noofbookings; i++){
            
            if(Ticket.getAvailableTickets() == 0){
                System.out.println("House full");
                break;
            }
            
            System.out.println("Enter the ticketid");
            int ticketid = sc.nextInt();
            
            System.out.println("Enter the price");
            int price = sc.nextInt();

            
            System.out.println("Enter the no of tickets");
            int nooftickets = sc.nextInt();
            
            Ticket ticket = new Ticket();
            ticket.setTicketId(ticketid);
            ticket.setPrice(price);
            
            
            System.out.println("Available tickets: " + ticket.getAvailableTickets());
            
            int totalAmount = ticket.calculateTicketCost(nooftickets);
            
            if( totalAmount == -2){
                System.out.println("Total amount:" + (nooftickets*price));
                System.out.println("House full");
                break;
            }
            
            
            else if (totalAmount == -1) {
                System.out.println("Tickets are not available");
                
            } else {
                System.out.println("Total amount:" + totalAmount);
                if(Ticket.getAvailableTickets() == 0){
                    System.out.println("House full");
                    break;
                } 
                else{
                   System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets()); 

                }
            }
        }
        
        
    
    }
}


            
