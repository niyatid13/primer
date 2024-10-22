**********
Description



Alex, Nikil, and Sam are three friends playing the Ludo game. After completing one round, they note their points, and at the end of the day they calculate the points. The one who scores the highest will be considered the winner. Write a Java program to find out who scores the highest points and display the output.

Requirements:

The points should be between 0 and 50 (both inclusive), else print "<points> is an invalid number' and terminate the program.
If any of two persons points are equal or all are having equal points, then print "The game is a tie".
After finding the winner, print "<Name> scores <Points> points and wins the game".
Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user, and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question description.
Ensure to provide the names for classes, attributes, and methods as specified in the question description.
Adhere to the code template, if provided.
Please do not use System.exit(0) to terminate the program.

Sample Input/Output 1:

Enter Alex points

10

Enter Nikil points

12

Enter Sam points

25

Sam scored 25 points and won the game



Sample Input/Output 2

Enter Alex points

10

Enter Nikil points

-5

-5 is an invalid number



Sample Input/Output 3

Enter Alex points

60

60 is an invalid number




Sample Input/Output 4


Enter Alex points

40

Enter Nikil points

32

Enter Sam points

40

The game is a tie
  
*********

import java.util.Scanner;
class Player{
    private String name;
    private int points;
    
    public Player(String name, int points){
        this.name = name;
        this.points = points;
    }
    
    public int getPoints(){
        return points;
    }
    
    public String getName(){
        return name;
    }
}
public class UserInterface
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Fill code here 
        
        System.out.println("Enter Alex points");
        int alexPoints = sc.nextInt();
        if(!isValidponits(alexPoints)) return;    
        
        System.out.println("Enter Nikil points");
        int nikilPoints = sc.nextInt();
        if(!isValidponits(nikilPoints)) return;
        
        
        System.out.println("Enter Sam points");
        int samPoints = sc.nextInt();
        if(!isValidponits(samPoints)) return;
        
        
        Player alex = new Player("Alex", alexPoints);
        Player nikil = new Player("Nikil", nikilPoints);
        Player sam = new Player("Sam", samPoints);
        
        
        if(isTie(alexPoints, nikilPoints, samPoints)){
            System.out.println("The game is a tie");
        }
        else {
            Player winner = findWinner ( alex, nikil, sam);
            System.out.println(winner.getName() + "scored" + winner.getPoints() + " points and won the game");
        }
        sc.close();
        
    }
    
   
    public static boolean isValidponits(int points){
        
        if ( points < 0 || points > 50){
            System.out.println(points + " is an invalid number");
            return false;
        }
        
        return true;
        
    }
    
    public static boolean isTie( int alexPoints, int nikilPoints, int samPoints){
        
        return ( alexPoints == nikilPoints || alexPoints == samPoints || nikilPoints == samPoints);
    }
    
    public static Player findWinner(Player alex, Player nikil, Player sam){
        if( alex.getPoints() > nikil.getPoints() && alex.getPoints() > sam.getPoints()) {
           return alex; 
        }
        
        else if (nikil.getPoints() > alex.getPoints() && nikil.getPoints() > sam.getPoints()){
            return nikil;
        } 
        else {
            return sam;
        }
        
    }
}

