public class ReviewInventory extends Review{

import java.util.ArrayList;
import java.util.Scanner;
class Update
{
 //Setti bara inn mjög basic review til að hafa eitthvað inni. Endlega breytið og bætið eins og þið viljið
 //Hér þyrfti tengingu við ferðirnar
 public static void main(String[] args) 
 {
   ArrayList<String> ReviewList = new ArrayList<String>();
   String reviewName;
   String reviewText;
   String reviews;
   //megið breyta nafninu, datt bara ekkert betra í hug í bili
   Scanner userInput = new Scanner(System.in);
   System.out.println("Type in your review");
   reviewText = userInput.nextLine();
   System.out.println("Type in your name");
   reviewName = userInput.next();
   reviews = reviewName + " wrote: " + reviewText;
   System.out.println(reviews);
   ReviewList.add(reviews); 
   // vistaði þetta bara á sama hátt og Booking, gott að geyma strengi á þennan hátt
    
   userInput.close();
   }
}