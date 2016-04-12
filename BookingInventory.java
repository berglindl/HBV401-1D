public class BookingInventory extends Booking{
import java.util.Scanner;

//Spurning um að hafa hér líka valmöguleikann á að panta hópferð
//Þ.e ef það er valið, þá er öllin ferðin frátekin fyrir sá hóp
//Getum haft það að min 5 þurfi þá að mæta
class Reserve
{
		// Þarf að tengja hérna við listanna 
 		// til að sækja upplýsingar um ferðirnar
	private static int numSeats = 20;

	public static void main(String [] args)
 	{
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

// hvort sem við höfum þetta hér eða í booking þá getum vð notað þennan kóða ef það má velja allar dagsetningar
// gamli kóðinn er hér að ofan, vildi ekki taka hann út ef þið viljið frekar nota hann
// fannst þetta samt ágætis leið til að hafa allar dagsetningar inni
import java.util.Scanner;
// ég importa allaf java scanner en megið breyta því :)
class tripDate
// ykkur er velkomið að breyta class fyrir ofan og public static dæminu hér að neðan 
{
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
    //Til að setja restrictions svo að það sé ekki hægt að bóka ferð árið 1827 eða 2200
    if(year <= 2014){
      System.out.print(year + " is an invalid year.");
    }
    else if(year > 2016){
      System.out.print(year + " is an invalid year.");
    }
    //Ef að árið sem er sett inn er á milli 2015 og 2016
    else if(year > 2014 || <= 2016){
      switch (month) 
      {  
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
            if (day > 29)
              System.out.print(day + "/" + month + "/" + year + " is an invalid day.");
            else
              System.out.print(" Your trip is booked on " + day + "/" + month + "/" + year);
            else if
              if (day > 28)
                System.out.print(day + "/" + month + "/" + year + " is an invalid day.");
              else
                System.out.print(" Your trip is booked on " + day + "/" + month + "/" + year);
        break;

        default:
          System.out.println("The date: " + day + "/" + month + "/" + year + " has an invalid month");
      }       
      userInput.close();
    }
  }
}