// public class ReviewInventory extends Review{

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
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
   //Gætum þurft að hafa hérna veldu ferð tengingu og jafnvel bæta við að nafn á ferðinni vistist með review því veit 
   // ekki hvernig við myndum kalla á review bara fyrir eina gerð af ferðum
   // Því er pælng að hafa að ef þú vilt sjá lista yfir review að þú sjáir bara allar ferðirnar og review saman
   // og skrollir bara í gegnum það. Veit það er ekki jafn flott en það er mun auðveldara og við höfum ekki 
   // allan tíma í heiminum

   //Já, ég held að það væri best að útfæra þetta eins og þú ert að pæla
   Scanner userInput = new Scanner(System.in);
   System.out.println("Type in your review");
   reviewText = userInput.nextLine();
   System.out.println("Type in your name");
   reviewName = userInput.next();
   reviews = reviewName + " wrote: " + reviewText;
   System.out.println(reviews);
   ReviewList.add(reviews); 
   // vistaði þetta bara á sama hátt og Booking, gott að geyma strengi á þennan hátt
   Iterator<String> itr = ReviewList.iterator();{
      while(itr.hasNext()){
      System.out.println(itr.next());
   // Þetta er til að birta ReviewList, þ.e. frá Iterator til itr.next()); Setti þetta hér til að prufukeyra
   // en síðan þegar tengingin á milli klasanna kemur þá fer þetta yfir í Userface? svo fólk geti séð öll review 
      }
   }
    
   userInput.close();
   }

}
