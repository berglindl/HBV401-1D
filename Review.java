import java.util.Scanner;
class Review
{
public static void main(String [] args)
    {
    int vote;
    int votesCount = 0;
    int number;
    // look a votescount, decided to begin with 0 due to lack of connections
    Scanner userInput = new Scanner(System.in);
    {
        Scanner selectTrip = new Scanner(System.in);
        System.out.println("Select the trip you wish to rate.");
        System.out.println("Press 1 for the trip Into the Glacier,");
        System.out.println("Press 2 for the trip Skiing on Hrútafjallstindar,");
        System.out.println("Press 3 for the trip Whale Watching in Húsavík,");
        System.out.println("Press 4 for the trip History Walk Through Downtown,");
        System.out.println("Press 5 for the trip The Golden Circle and Snorkeling,");
        System.out.println("Press 6 for the trip Glacier Walking and Waterfalls,");
        System.out.println("Press 7 for the trip Northern Lights Explorer,");
        System.out.println("Press 8 for the trip Game of Thrones - Mývatn Mystery Magic,");
        System.out.println("Press 9 for the trip A Trip to Papey Islands,");
        System.out.println("Press 10 for the trip The Caves in Ingólfsfjall,");
        System.out.println("Press 11 for the trip Skiing Through Langanes,");
        System.out.println("Press 12 for the trip Whale Watching in Breiðafjörður,");
        System.out.println("Press 13 for the trip Western Dancing Trip,");
        System.out.println("Press 14 for the trip A Walk Through Viðey,");
        System.out.println("Press 15 for the trip Landmannalaugar and Hjálparfoss,");
        System.out.println("Press 16 for the trip Meet the Puffins and Hike,");
        System.out.println("Press 17 for the trip Goðafoss, Dimmuborgir and Mývatn Nature Baths,");
        System.out.println("Press 18 for the trip Jöulsárlón,");
        System.out.println("Press 19 for the trip Snæfellsnes Peninsula,");
        System.out.println("Press 20 for the trip Inside the Volcano.");
            

        number = selectTrip.nextInt();
        selectTrip.close();
        
        switch(number){
            //problably have to change when we have a connection
            case 1: Trip[0]; //eða Trip[trip1]
                    break;
            case 2: Trip[1];
                    break;
            case 3: Trip[2];
                    break;
            case 4: Trip[3];
                    break;
            case 5: Trip[4];
                    break;
            case 6: Trip[5];
                    break;
            case 7: Trip[6];
                    break;
            case 8: Trip[7];
                    break;
            case 9: Trip[8];
                    break;
            case 10: Trip[9];
                    break;
            case 11: Trip[10];
                    break;
            case 12: Trip[11];
                    break;
            case 13: Trip[12];
                    break;
            case 14: Trip[13];
                    break;
            case 15: Trip[14];
                    break;
            case 16: Trip[15];
                    break;
            case 17: Trip[16];
                    break;
            case 18: Trip[17];
                    break;
            case 19: Trip[18];
                    break;
            case 20: Trip[19];
                    break;

            default: System.out.println("Oops! That trip is not listed. Please try again.");
            // can´t test this part without a connection
        }

        System.out.println("Rate this trip on a scale from 0-5");
        vote = userInput.nextInt();
        votesCount++;
        
        if (vote < 0)
        {
         vote = 0;
        }
        else if (vote > 5)
        {
         vote = 5;
        }
        
    }
    int votesTotal;
    {
      if (votesCount > 1){
       votesTotal = vote;
       votesTotal = votesTotal + vote;
       //Needs a closer look
       
      }
      else{
        votesTotal = vote;
        // wasn´t sure about his, but lets fix it when we have a connection and we can see it in action
    }
    if (votesCount > 0){
        double average = votesTotal / votesCount;
        System.out.println("Average for trip number " + number + " is: " + average );
    }
    userInput.close();
    // need to store in an array or someplace else with a connection to database
    }
}
}