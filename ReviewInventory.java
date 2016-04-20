// public class ReviewInventory extends Review{

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
class Update
{
 //Put a very basic function here, we can fix later
 public static void main(String[] args) 
 {
   ArrayList<String> ReviewList = new ArrayList<String>();
   String reviewName;
   String reviewText;
   String reviews;
   //have to add a connection to the trips, then we can just show a list for all reviews in the same place, might be simpler than just looking
   // at reviews for a special trip, at least for now
   Scanner userInput = new Scanner(System.in);
   System.out.println("Type in your review");
   reviewText = userInput.nextLine();
   System.out.println("Type in your name");
   reviewName = userInput.next();
   reviews = reviewName + " wrote: " + reviewText;
   System.out.println(reviews);
   ReviewList.add(reviews); 
   // Put it in a list we can just look through
   // might need a better way to store this information but i think it might work like this
   Iterator<String> itr = ReviewList.iterator();{
      while(itr.hasNext()){
      System.out.println(itr.next());
   // This is to show the list, we hve to move it to UserInterface when working on that, but put it here so we could look at it now
      }
   }
    
   userInput.close();
   }

}
