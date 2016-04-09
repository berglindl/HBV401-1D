public class BookingInventory extends Booking{
import java.util.Scanner;

//Spurning um að hafa hér líka valmöguleikann á að panta hópferð
//Þ.e ef það er valið, þá er öllin ferðin frátekin fyrir sá hóp
//Getum haft það að min 5 þurfi þá að mæta
class Reserve
{
		// Þarf að tengja hérna við listanna 
 		// til að sækja upplýsingar um ferðirnar
	public static void main(String [] args)
 	{
  		int numSeats = 20;
  		// Setti þennan fjölda bara inn sem prufuskilyrði þar sem þetta er ekki tengt við neitt ennþá
  		// og vildi sjá hvernig það virkaði, á eftir að setja inn dagsetningarnar þ.e. hvernig þær fara inn í kóðann
  		// var ekki viss með það en ætluðum við ekki að hafa fyrirfram ákveðnar dagsetningar en ekki hvað sem er?
  		System.out.println("Enter number of tickets needed:");
  		Scanner userInput = new Scanner(System.in);
  		int tickets = userInput.nextInt();
 		if (tickets <= numSeats)
  		{
   			System.out.println("Enter full name:" );
   			//Hugsaði að það væri gott að hafa fullt nafn til að geta rakið pöntun ef 
   			//einhver cancellar pöntun, yrði vandræðanlegt að cancella vitlausa pöntun
   			for(int i=0; i<tickets; i++)
   			{
    			System.out.println("Enter full name:");
    			Scanner name = new Scanner(System.in);
    			String names = name.nextLine();
    			//Ef það á að cancella bara fyrir 1 af 10 t.d í pöntun þá gæti verið gott að rekja til nafns? Getum breytt
    			BookingsList.add(names);
    			//Setti þetta inn því ég gerði ráð fyrir að við myndum hafa lista sem héldi skrá yfir pantanir
    			//og fannst sniðugt að það sé hægt að leita eftir nöfnum, ekkert mál
    			//að breyta þessu en vildi hafa eitthvað inni á meðan við ynnum þetta svo það gleymdist ekki
    			numSeats--;
  			 }
  		}
  		else
  		{
   			System.out.println("Number of tickets unavailable");
 		}
	}
	// spurning um að setja hér System.out.println("Press 1 to pay now and 2 to pay upon arrival");
	// eða eitthvað sambærilegt? Var ekki annars pælingin að hafa bara svipað t.d. 1 eða 2
	// ef 2 þá kemur e-ð eins og System.out.println("Payment will be requested upon arrival eða e-ð"); og ef 1
	// þá System.out.println("Payment successful"); Hvað finnst ykkur?
}

import java.util.Scanner;
class Cancellation
{
	//Aftur þarf tengingu hérna við listanna
  	public static void main(String [] args)
 	{
  		// muna að lesa inn numSeats, tripName og tripDate þegar það er komið hvernig það verður
  		System.out.println("Enter number of tickets you would like to cancel:");
  		Scanner userInput = new Scanner(System.in);
  		int tickets = userInput.nextInt();
  		// spurning hvort við setjum inn skilyrði hér til að passa að þú getir ekki cancellað 10 miðum
  		// ef það er bara búið að panta 3. Er ekki viss hvort við þurfum það
  		while (tickets > 0)
  		{
  			System.out.println("Enter full name for ticket cancelled:");
    		Scanner name = new Scanner(System.in);
   			String names = name.nextLine();
    		BookingsList.remove(names);
    		//Skoða þetta vel, er ekki alveg viss um að þetta sé nóg til að þetta virki en hugsaði að
    		//þetta væri betra en ekki neitt
   	 		numSeats++;
   	 	}
	   	System.out.println(tickets +"tickets have been cancelled");
	  	// viljum við breyta þessu þannig þú sjáir nöfn þeirra sem voru cancellaðir eða er fjöldi nóg?
	}
}