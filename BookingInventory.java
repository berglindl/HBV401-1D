import java.util.Scanner;

class Reserve
{
  //Smá lagfæringar í gangi
 private static int numSeats = 20;
 public static void main(String [] args)
  {
   System.out.println("Enter number of tickets needed:");
   Scanner userInput = new Scanner(System.in);
   int tickets = userInput.nextInt();
   if (tickets <= numSeats)
    {
     if (tickets >= 5)
       // ef 5 eða fleiri þá er hægt að kaupa sem hópaferð, þá er bara eitt nafn gefið upp en ekki mörg
       // og þð er hægt að kaupa frekar private ferð þar sem þetta er hópur.
       // Er það ekki það sem við vorum að tala um að vilja getað gert?
     {
      System.out.println("You have chosen a trip for 5 or more persons, press 1 for a private trip for your group and 2 for public:");
          Scanner answ = new Scanner(System.in);
          String input = answ.next();
          if(input.equals("1"))
          {
           System.out.println("Please enter one name for the whole group");
              Scanner name = new Scanner(System.in);
              String names = name.nextLine();       
              BookingsList.add(names);
              // eina við booking list er að við erum bara að setja inn nöfn þeirra sem panta en ekki
              // hve mikið það er verið að panta. En þar sem við erum búin að breyta þannig það þarf ekki alltaf
              // að gefa upp nafn fyrir hvern farþega, hvort viljið þið hafa annan lista með magni ferðaplássa pantað
              // láta nafn þess sem pantar fyrir 5 koma 5sinnum eða bæði?
              int numSeats = 0;
             }
          else if(input.equals("2"))
          {
              System.out.println("Please enter one name for the whole group");
              Scanner name = new Scanner(System.in);
             String names = name.nextLine();       
             BookingsList.add(names);
             int numSeats = numSeats - tickets;
          }
          else
          {
           System.out.println("invalid input");
          }
          answ.close();
         }
         else
         {
      System.out.println("Enter full name:" );
      for(int i=0; i<tickets; i++)
      {
       System.out.println("Enter full name:");
       Scanner name = new Scanner(System.in);
       String names = name.nextLine();
       BookingsList.add(names);
       numSeats--;
     }
    }
    }
    else
    {
      System.out.println("Number of tickets unavailable");
     }
     // bætti hérna við mjög einföldu borgunarekrfi, má breyta
    System.out.println("Press 1 to pay now and 2 to pay upon arrival:");
    Scanner answer = new Scanner(System.in);
    String response = answer.next();
    if(response.equals("1"))
       {
           System.out.println("Payment successful");
       }
       else if(response.equals("2"))
       {
           System.out.println("Payment will be requested upon arrival");
       }
       else
       {
           System.out.println("invalid input");
    }
       answer.close();
 }
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
      // Spurning varðandi hóppönun hvort það þurfi ekki að vera hægt að afpanta hlta af henni?
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
class TripDate
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