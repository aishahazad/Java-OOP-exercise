----------------------
Run program
----------------------

 You need java 1.8 to run program.
To start and test application:
1. open cmd
2. change path to folder where is the source code
2. compile the classes using the following commands
  javac Movie.java
  javac MovieImpl.java
  javac Ticket.java
  javac StandardTicket.java
  javac StudentTicket.java
  javac ChildTicket.java
  javac OAPTicket.java
  javac Main.java
3. run the project using this command
  java Main

----------------------
Cinema task instructions
----------------------

Movies are represeted by Movie.java interface that had 3 methods : long getId();    String getName();    String getDirector();

MoviesImpl implement Movie interface and has a constructor with 3 parameters : public MovieImpl(long id, String name, String directorName)

Ticket.java is an abstract class, which is extendet by StandardTicket.java, StudentTicket.java, ChildTicket.java, OAPTicket.java 
and have an abstract method public long getPrice() which is implmented in every child class to return the correct price.
In Main.java class we have public static void main(String[] args) method which will be called at runtime.
First thing that is done in main method is to populate a List<Movie> with a static method and hard coded movies names.
Next the program wait for user input, if input is wrong it will be printed a informational message to the user to enter a corect value.
After the program have the correct input will take to next step to ask user to enter a day.
After we have a date the user will be asked to enter number of reservation, than in a for loop will be asked to enter ticket type. 
Each ticket type will be added to a List<Ticket> which will help at calculation of total price (also has validation).
After we have tickets types the program will calculate the total price : it will use day to check if it's a Wednesday day to apply discount 
and will get the price from every ticket.
At end, a message with all data will be printed inclunding a extra message if the the discount is applicable.