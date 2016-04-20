import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
class Reserve {
  

  private static int numSeats = 20;
  // This should be changed in bokking so it will always be 20 seats for every trip

  public static void main(String [] args){
   ArrayList<String> BookingsList = new ArrayList<String>();
  
    System.out.println("Enter number of tickets needed:");
    Scanner userInput = new Scanner(System.in);
    int tickets = userInput.nextInt();
    Scanner name = new Scanner(System.in);
    {
    if (tickets > numSeats){
        System.out.println("Number of tickets unavailable");
             
        
        // Here we go straight to paying, we should change it so you can try fo a diffrent date instead or cancel
        // ex. System.out.println("Press 1 to pick another date or 2 to cancel")
        // then a new connection between classes

       
    }
    else if (tickets <= numSeats){
      
      if (tickets >= 5){
        // if booking for 5 or more people you only need to give up one name for the trip        
        // oand you can choose a private trip so if you´re liike 17 you can go as one group instead of taking 3 random people along.
     
        System.out.println("You have chosen a trip for 5 or more persons, press 1 for a private trip for your group and 2 for public:");
        Scanner answ = new Scanner(System.in);
        String input = answ.next();
        if(input.equals("1")){
          System.out.println("Please enter one name for the whole group");
          String names = name.nextLine();  
          BookingsList.add(names);
          // BookingList only stores names for us to see if people call to change a name for a group or something else


          numSeats = 0;
          // need to store information above in database 
          }
          else if(input.equals("2")){
            System.out.println("Please enter one name for the whole group");
            String names = name.nextLine();       
            BookingsList.add(names);
            numSeats = numSeats - tickets;
          }
          else{
            System.out.println("Invalid input");
            // cant chose 1 or 2 without dooing everything again, fix
          }
          answ.close();
          userInput.close();
        }
        else{
          for(int i=0; i<tickets; i++){
            System.out.println("Enter full name:");
            String names = name.nextLine();
            BookingsList.add(names);
            numSeats = numSeats - tickets;
            //needs a closer look
          }
        }
      }
   
    System.out.println("You have booked " + tickets + " tickets under the name/s ");
    Iterator<String> itr = BookingsList.iterator();{
      while(itr.hasNext()){
   System.out.println(itr.next());
   // Like it appears now

   // You have booked 3 tickets under the name/s
   // Hildur
   // Berglind
   // Pétur

   //Will change when we fix the program so it stores info, don´t take out until that happens so we won´t forget
      }
    }
    name.close();
      
      }
      System.out.println("Press 1 to pay now and 2 to pay upon arrival:");
      Scanner answer = new Scanner(System.in);
      String response = answer.next();
      if(response.equals("1")){
        System.out.println("Payment successful");
      }
      else if(response.equals("2")){
        System.out.println("Payment will be requested upon arrival");
      }
      else{
        System.out.println("Invalid input.");
        // again, nothing that lets you chose 1 or 2 again if you press 3, fix
      }
      answer.close();
    }
}


import java.util.Scanner;
class Cancellation{
  // needs connection to stored information
  public static void main(String [] args){
   // remember no connection to numSeats, tripName and tripDate yet
   System.out.println("Enter number of tickets you would like to cancel:");
   Scanner userInput = new Scanner(System.in);
   int tickets = userInput.nextInt();
    if (tickets >= 5){
        // for group booking
        System.out.println("Press 1 to cancel a private trip and 2 for public:");
        Scanner ans = new Scanner(System.in);
        String input = ans.next();
        if(input.equals("1")){
          System.out.println("Please enter one name to reserve the trip for the whole group");
          Scanner name = new Scanner(System.in);
          String names = name.nextLine();       
          BookingsList.remove(names);
          // look into if we need booking list for names or if it will be easier to use the database
          numSeats = 20;
          }
        else if(input.equals("2")){
          while (tickets > 0){
          System.out.println("Enter full name for the ticket you wish to cancel:");
          Scanner name = new Scanner(System.in);
          String names = name.nextLine();
          BookingsList.remove(names);
          
          numSeats = numSeats + tickets;
          //numSeats++;
          }
        }
        else{
          System.out.println("Error, please try again.");
        }
        // fix so you go back to loop
    }
       else{
        while (tickets > 0){
          System.out.println("Enter full name for the ticket you wish to cancel:");
          Scanner name = new Scanner(System.in);
          String names = name.nextLine();
          BookingsList.remove(names);
          
          numSeats = numSeats + tickets;
          // numSeats++;
       }
    }
   System.out.println(tickets +" tickets have been cancelled");
  }
}

// move to booking or if we should just call this function from there?

import java.util.Scanner;
// always using this so i can test codes induvidually, we can change once the connections come in
class TripDate{
// also everything is a main function, we can change later 
   public static void main(String args[])
    {
    int month, day, year;
    String mm, dd, yyyy;
    Scanner userInput = new Scanner(System.in);
    System.out.print("Input day using the following format dd: ");
    dd = userInput.next();
    day = Integer.parseInt(dd);
    System.out.print("Input month using the following format mm: ");
    mm = userInput.next();
    month = Integer.parseInt(mm);
    System.out.print("Input day using the following format yyyy: ");
    yyyy = userInput.next();
    year = Integer.parseInt(yyyy);
    //restrictions so you can only book 2 years
    if(year <= 2014){
      System.out.print(year + " is an invalid year.");
    }
    else if(year > 2016){
      System.out.print(year + " is an invalid year.");
    }
    //if its the year 2015 or 2016
    else if(year > 2014 || year <= 2016){
      switch (month){  
        // making sure that the months have correct number of days
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          if (day > 31)
            System.out.print(day + "/" + month + "/" + year + " is an invalid date.");
          else 
            System.out.print(" Your trip is booked on " + day + "/" + month + "/" + year);
        break;

        case 4:
        case 6:
        case 9:
        case 11:
          if (day > 30)
            System.out.print(day + "/" + month + "/" + year + " is an invalid date.");
          else 
            System.out.print(" Your trip is booked on " + day + "/" + month + "/" + year);
        break;

        case 2:
          if (year % 4 == 0)
            // check for leap year since 2016 is one
            // fix if you see something i forgot to account for with the dates
            if (day > 29)
              System.out.print(day + "/" + month + "/" + year + " is an invalid day.");
            else
              System.out.print(" Your trip is booked on " + day + "/" + month + "/" + year);
            else {
              if (day > 28)
                System.out.print(day + "/" + month + "/" + year + " is an invalid day.");
              else
                System.out.print(" Your trip is booked on " + day + "/" + month + "/" + year);
              break;}

        default:
          System.out.println("The date: " + day + "/" + month + "/" + year + " has an invalid month");
      }
      userInput.close();
    }
  }
}