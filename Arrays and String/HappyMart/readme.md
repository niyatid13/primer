******
Description

Happy Mart is a supermarket with wide range of products. The manager wants to add the products and sort them based on id and price. As a java developer, create a java application to sort the products based on id and price.

Component Specification: Product

![image](https://github.com/user-attachments/assets/2d4c8e3e-0658-4a32-8dc9-42fb4e8b753a)


![image](https://github.com/user-attachments/assets/c2ad3cdb-8e94-4af3-82c8-bf01f2c33a65)


![image](https://github.com/user-attachments/assets/4aae93c6-798d-4f9b-924e-d03593723130)


In the UserInterface class,

-       Get the products count from user. If the count is negative or zero, display "Invalid count".

-       Get the product details as shown in the sample input.

-       Create an object for each product and assign the values through 3 argument constructor.

-       Get the choice from user as given in the sample input.

-       Based on the choice entered, the corresponding comparator is invoked in sort method and the output is displayed as given in sample output.

-       If the choice is other than 1 or 2, display "Invalid choice".

 

Note:

In the Sample Input / Output provided, the highlighted text in bold corresponds to the input given by the user and the rest of the text represents the output. 
Ensure to follow the object-oriented specifications provided in the question. 
Ensure to provide the names for classes, attributes, and methods as specified in the question. 
Adhere to the code template, if provided. 
Please don't use System.exit(0) to terminate the program. 
 

Sample Input/Output 1:

Enter the products count

3

Enter Product details

1006:Pen:50

1009:Eraser:40

1004:Ruler:40

1.Sort By Id

2.Sort By Price

Enter your choice

1

After Sorting By Id

1004 Ruler 40.0

1006 Pen 50.0

1009 Eraser 40.0

 

Sample Input/Output 2:

Enter the products count

4

Enter Product details

2503:Onion:80

2508:Tomato:50

2501:Carrot:140

2506:Potato:120

1.Sort By Id

2.Sort By Price

Enter your choice

2

After Sorting By Price

2508 Tomato 50.0

2503 Onion 80.0

2506 Potato 120.0

2501 Carrot 140.0

 

Sample Input/Output 3:

Enter the products count

2

Enter Product details

4002:Bread:240

4006:Biscuit:160

1.Sort By Id

2.Sort By Price

Enter your choice

5

Invalid choice

 

Sample Input/Output 4:

Enter the products count

-5

Invalid count
