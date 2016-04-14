import java.util.Scanner;

class Reserve{
  //Smá lagfæringar í gangi
  /*private static int numSeats = 20;*/
  // Þarf að laga þetta með að taka út, þurfum að stilla áður en farið er í reserve að hver dagsetning innihaldi 20 sæti fyrir hverja ferð
  // Getum gert það í Booking, set athugasemd þar líka
  // Vildi ekki taka út fyrr en það kemur inn í Booking eða hvar við viljum gera það
  public static void main(String [] args){
    // má ekki vera static ef við ætlum að nota this.numSeats
    System.out.println("Enter number of tickets needed:");
    Scanner userInput = new Scanner(System.in);
    int tickets = userInput.nextInt();
    if (tickets <= numSeats){
      if (tickets >= 5){
        // ef 5 eða fleiri þá er hægt að kaupa sem hópaferð, þá er bara eitt nafn gefið upp en ekki mörg
        // og það er hægt að kaupa frekar private ferð þar sem þetta er hópur og þú vilt kannski bara fara með fólki sem þú þekkir.
     
        System.out.println("You have chosen a trip for 5 or more persons, press 1 for a private trip for your group and 2 for public:");
        Scanner answ = new Scanner(System.in);
        String input = answ.next();
        if(input.equals("1")){
          System.out.println("Please enter one name for the whole group");
          Scanner name = new Scanner(System.in);
          String names = name.nextLine();       
          BookingsList.add(names);
          BookingsList.add(tickets);
          // eina við booking list er að við erum bara að setja inn nöfn þeirra sem panta en ekki
          // hve mikið það er verið að panta. 

          // gætum bætt við BookingsList.add(tickets); eins og einhver sagði
          //á ég að bæta því inn hér og í cancel eða bíða þangað til numSeats hefur verið útfært því það þarf augljóslega að vistast þar líka



          this.numSeats = 0;
          //verður annaðhvort að breyta Static fallinu í e-ð annað eða taka this.numSeats út og setja numSeats inn í staðinn
          }
          else if(input.equals("2")){
            System.out.println("Please enter one name for the whole group");
            Scanner name = new Scanner(System.in);
            String names = name.nextLine();       
            BookingsList.add(names);
            this.numSeats = numSeats - tickets;
          }
          else{
            System.out.println("invalid input, try again");
            // erum ekki með skipun sem hendir þér aftur í að velja 1 eða 2 heldur klárar forritið bara. Gætum þurft að laga
          }
          answ.close();
        }
        else{
          System.out.println("Enter full name:" );
          for(int i=0; i<tickets; i++){
            System.out.println("Enter full name:");
            Scanner name = new Scanner(System.in);
            String names = name.nextLine();
            BookingsList.add(names);
            this.numSeats = numSeats - tickets;
            //verður annaðhvort að breyta Static fallinu í e-ð annað eða taka this.numSeats út og setja numSeats inn í staðinn
            //gætum þurft að skoða síðustu setninguna hér betur, spurning um að ýta henni úr for lykkjunni?
          }
        }
      }
      else{
        System.out.println("Number of tickets unavailable");
        // hér heldur klasinn bara áfram yfir í borgun, spurning um að breyta þannig þú getur komist héðan aftur
        // yfir í að velja dagsetningu eða cancel
        // t.d. System.out.println("Press 1 to pick another date or 2 to cancel")
        // og síðan tengin þangað??
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
        System.out.println("Invalid input, please try again.");
        // erum ekki með skipun sem hendir þér aftur í að velja 1 eða 2 heldur klárar forritið bara-laga?
      }
      answer.close();
    }
}

import java.util.Scanner;
class Cancellation{
  // Held það eigi núna að virka að cancella hópferðirnar
 //Aftur þarf tengingu hérna við listanna
  public static void main(String [] args){
    // má ekki vera static ef við ætlum að nota this.numSeats
   // muna að lesa inn numSeats, tripName og tripDate þegar það er komið hvernig það verður
   System.out.println("Enter number of tickets you would like to cancel:");
   Scanner userInput = new Scanner(System.in);
   int tickets = userInput.nextInt();
    if (tickets >= 5){
        // útaf hóppöntun
        System.out.println("Press 1 to cancel a private trip and 2 for public:");
        Scanner ans = new Scanner(System.in);
        String input = ans.next();
        if(input.equals("1")){
          System.out.println("Please enter one name to reserve the trip for the whole group");
          Scanner name = new Scanner(System.in);
          String names = name.nextLine();       
          BookingsList.remove(names);
          // viljum við hafa þetta BookingList?
          this.numSeats = 20;
          //verður annaðhvort að breyta Static fallinu í e-ð annað eða taka this.numSeats út og setja numSeats inn í staðinn
          }
        else if(input.equals("2")){
          while (tickets > 0){
          System.out.println("Enter full name for the ticket you wish to cancel:");
          Scanner name = new Scanner(System.in);
          String names = name.nextLine();
          BookingsList.remove(names);
          // skoða hvort það eigi að vera BookingLst

          //spurning hvort að þetta væri betra, ef miðarnir væru fleiri en 1
          this.numSeats = numSeats + tickets;
          //verður annaðhvort að breyta Static fallinu í e-ð annað eða taka this.numSeats út og setja numSeats inn í staðinn
          //numSeats++;
          }
        }
        else{
          System.out.println("Error, please try again.");
        }
        // erum ekki með skipun hvað gerist ef þú ýtir á 3? Gætum lagað??
        //Gætum gert eitthvað eins og þetta, ekki nema eitthvað sérstakt ætti að gerast í tilfelli 3
    }
       else{
        while (tickets > 0){
          System.out.println("Enter full name for the ticket you wish to cancel:");
          Scanner name = new Scanner(System.in);
          String names = name.nextLine();
          BookingsList.remove(names);
          // skoða hvort það eigi að vera BookingList
          // sama hér?
          this.numSeats = numSeats + tickets;
          //verður annaðhvort að breyta Static fallinu í e-ð annað eða taka this.numSeats út og setja numSeats inn í staðinn
          // numSeats++;
       }
    }
   System.out.println(tickets +" tickets have been cancelled");
  }
}

// pæling að færa í Booking eða bara að kalla á þennan kóða þar??

// öruglega fínt að færa hann, það er samt hægt að kalla á kóðann hér. 

import java.util.Scanner;
// ég importa allaf java scanner en megið breyta því :)
class TripDate{
// ykkur er velkomið að breyta class fyrir ofan og public static dæminu hér að neðan 
   public static void main(String args[])
    {
      // Breytti aftur í static main þar sem public int Calendar(){ gefur upp villu í keyrslu
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
    else if(year > 2014 || year <= 2016){
      // lagaði þar sem það vantaði year
      switch (month){  
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