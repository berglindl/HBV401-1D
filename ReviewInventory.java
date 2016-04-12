public class ReviewInventory extends Review{
import java.util.Scanner;
class update
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
   userInput.close();
 }
}

	}
	public void delete(){
	
	}
}