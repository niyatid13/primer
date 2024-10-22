
public class Ticket
{
    // Fill the code
    
    private int ticketid;
    private int price;
    private static int availableTickets;
    
    public int getTicketId(){
        return ticketid;
    }
    
    public void setTicketId(int ticketid){
        this.ticketid = ticketid;
        
    }
    //
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int price){
        this.price = price;
        
    }
    //
    public static int getAvailableTickets(){
        return availableTickets;
    }
    
    public static void setAvailableTickets(int availableTickets){
        Ticket.availableTickets = availableTickets;
        
    }

    
    public int calculateTicketCost(int nooftickets)
    {
        // Fill the code
        
        if( availableTickets >= nooftickets && availableTickets > 0){
            int totalAmount = nooftickets * price;
            availableTickets -= nooftickets;
            return totalAmount;
        } 
        else if( availableTickets == 0){
            return -2;
        } 
        else{
            return -1;
        }
        
    }
    
}

