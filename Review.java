import java.util.Scanner;
class Review
{
public static void main(String [] args)
    {
    int vote;
    int votesCount = 0;
    int number;
    // Núlstillti bara til að byrja með þar sem það er enging tenging við neitt komin
    // breytum þessu á endanum
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
            //Þarf eflaust að breyta þessu þegar tengingin er komin nákvæmlega
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
            // hef ekki prufukeyrt með switch setningunni þar sem það er engin tenging komin en restin virðist virka
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
        // Megið fegra þetta ef þið getið
    }
    int votesTotal;
    {
      if (votesCount > 1){
       votesTotal = vote;
       votesTotal = votesTotal + vote;
       //Skoða þessar 2 línur
       
      }
      else{
        votesTotal = vote;
        // er ekki alveg viss um að þessar if og else séu nóg til að þetta virki en 
        // skal laga það ef þetta virkar ekki þegar tengingin er komin :)
    }
    if (votesCount > 0){
        double average = votesTotal / votesCount;
        System.out.println("Average for trip number " + number + " is: " + average );
    }
    userInput.close();
    // spurning hvernig við viljum vista þetta? Ef það er í lista þa´þurfum við að breyta
    // í int í hvert skipti sem e-ð er sótt í hann þannig held það væri betra að geyma þetta ´fylki
    // hvað finnst ykkur?

    //Það er öruglega bara fínt að geyma þetta inn í fylki :)
    }
}
}