![image](https://github.com/user-attachments/assets/d9435c83-79d3-4b96-b1c8-c540bf9cca1a)Description





Shakthi cinemas have decided to automate their bookings. As an initiative, the manager outlined to development of software that would generate the booking details.

You being their software consultant have been approached to develop software to implement the functionality of calculating the ticket cost and displaying the booking details.

Component Specification: Ticket


![image](https://github.com/user-attachments/assets/73f4e9ec-d150-45e0-9e97-0bc42d012e85)

Note: The class and methods should be declared as public and all the attributes should be declared as private.

Requirement 1: Being able to calculate the ticket cost based on the number of tickets

As per this requirement, the system should be able to calculate the ticket cost based on the number of tickets as follows,

Component Specification: Ticket


![image](https://github.com/user-attachments/assets/6fc8ea9c-f439-4910-b6e5-73a86097bd73)



Example

noOfTickets = 5, price = 100

totalAmount = noOfTickets * price = 5 *100

totalAmount = 500

In the UserInterface class, Get the booking details as shown in the sample input.

Create an object for the Ticket class and invoke the calculateTicketCost() by passing the int numberOfTickets method in the Ticket class.

Invoke the corresponding getters to display the member details as shown in the Sample Output

If numberOfTickets is greater than availableTickets then print "Tickets are not available".

If availableTickets is zero then print "House full".

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output.
Ensure to follow the object-oriented specifications provided in the question.
Ensure to provide the names for classes, attributes, and methods as specified in the question.
Adhere to the code template, if provided.
Do not use System.exit(0) to terminate the program

Sample Input/Output 1:

Enter movie name

Friends

Enter no of bookings

2

Enter the available tickets

50

Enter the ticketid

101

Enter the price

200

Enter the no of tickets

6

Available tickets: 50

Total amount: 1200

Available ticket after booking: 44

Enter the ticketid

102

Enter the price

100

Enter the no of tickets

5

Available tickets: 44

Total amount: 500

Available ticket after booking: 39



Sample Input/Output 2:

Enter movie name

Captain

Enter no of bookings

3

Enter the available tickets

30

Enter the ticketid

101

Enter the price

100

Enter the no of tickets

20

Available tickets: 30

Total amount: 2000

Available ticket after booking: 10

Enter the ticketid

102

Enter the price

200

Enter the no of tickets

11

Available tickets: 10

Tickets are not available

Enter the ticketid

103

Enter the price

200

Enter the no of tickets

8

Available tickets: 10

Total amount: 1600

Available ticket after booking: 2

 

 

Sample Input/Output 3:

Enter movie name

Titanic

Enter no of bookings

2

Enter the available tickets

10

Enter the ticketid

101

Enter the price

250

Enter the no of tickets

10

Available tickets: 10

Total amount: 2500

House full
