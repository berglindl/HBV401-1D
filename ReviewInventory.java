public class ReviewInventory extends Review{
import java.util.Scanner;
class Update
{
 //Setti bara inn mjög basic review til að hafa eitthvað inni. Endlega breytið og bætið eins og þið viljið
 //Hér þyrfti tengingu við ferðirnar
 public static void main(String[] args) 
 {
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
   // Spurning hvernig við viljum vista reviews. Eins og er er bara verið að prenta allt en spurning hvort þið vljið gera það svona, eða e-ð öðruvísi
   // ReviewList.add(reviews); 
   // Fer eftir því hvernig við viljum geyma þetta, en kóðinn vrkar eins og er þannig hann er komin
    
   userInput.close();
   }
}