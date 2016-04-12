public class ReviewInventory extends Review{
import java.util.Scanner;
class Update
{
 //Setti bara inn mjög basic review til að hafa eitthvað inni. Endlega breytið og bætið eins og þið viljið
 //Hér þyrfti tengingu við ferðirnar
 public static void main(String[] args) 
 {
   String reviewText;
   //megið breyta nafninu, datt bara ekkert betra í hug í bili
   Scanner userInput = new Scanner(System.in);
   System.out.println("Type in your review");
   reviewText = userInput.next();
   System.out.println(reviewText);
   ReviewList.add(reviewText);
   // Gætum þá séð lista af reviews, á að bæta við username í listann eða viljum við hafa  
   // þetta naflaust? 

   //Ég held að user name gæti verið fínt, en er ReviewList fylki eða eitthvað þannig?
   userInput.close();
   }
}

//Tók út delete því ég held að það sé algjör óþarfi eins og verkefnið stendur núna