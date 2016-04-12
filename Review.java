import java.util.Scanner;
class Review
// var ekki alveg viss hvernig ég ætti að gera þetta þannig ákvað að henda up smá byrjun
// Þetta var fyrsta útgáfan þar sem ég fékk ekki villu í keyrslu þannig hélt henni inni en 
// eins og þið sjáið þá er þetta ekki fallegt
{
    // Hér þyrfti að vera einhver tenging við ferðirnar en var ekki viss hvernig við vildum gera þetta
    // þannig tengdi ekki við tripNames eða neitt svoleiðis ennþá

    //Það er tæknilega séð komin tenging hér, þ.e maður þarf fyrst að velja ferð
    //En review-in vistast ekkert endilega, þarf öruglega að laga það
public static void main(String [] args)
    {
    int vote;
    int votesCount = 0;
    // Núlstillti bara til að byrja með þar sem það er enging tenging við neitt komin
    // breytum þessu á endanum
    Scanner userInput = new Scanner(System.in);
    {
        Scanner selectTrip = new Scanner(System.in);
        System.out.println("Select the trip you wish to rate.");
        System.out.println("Write 1 for the trip Into the Glacier,");
        System.out.println("Write 2 for the trip Skiing on Hrútafjallstindar,");
        System.out.println("Write 3 for the trip Whale Watching in Húsavík,");
        System.out.println("Write 4 for the trip History Walk Through Downtown,");
        System.out.println("Write 5 for the trip The Golden Circle and Snorkeling,");
        System.out.println("Write 6 for the trip Glacier Walking and Waterfalls,");
        System.out.println("Write 7 for the trip Northern Lights Explorer,");
        System.out.println("Write 8 for the trip Game of Thrones - Mývatn Mystery Magic,");
        System.out.println("Write 9 for the trip A Trip to Papey Islands,");
        System.out.println("Write 10 for the trip The Caves in Ingólfsfjall,");
        System.out.println("Write 11 for the trip Á Gönguskíðum við Langanes,");
        System.out.println("Write 12 for the trip Whale Watching in Breiðafjörður,");
        System.out.println("Write 13 for the trip Western Dancing Trip,");
        System.out.println("Write 14 for the trip A Walk Through Viðey.");

        number = selectTrip.nextInt();
        switch(number){
            //Þarf eflaust að breyta þessu þegar tengingin er komin nákvæmlega
            case 1: Trip[0];
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
            default: System.out.println("Oops! That trip is not listed. Please try again.")
        }

        System.out.println("Rate this trip on a scale from 0-5");
        vote = userInput.nextInt();
        votesCount++;
        // Setti þetta inn hér því annars var hann ekki að telja 
        // Endilega lagið þetta ef þið getið
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
       votesTotal = vote;
       votesTotal = votesTotal + vote;
    }
    // Tilgangslaust að telja ef það eru engin atkvæði
    if (votesCount > 0){
        double average = votesTotal / votesCount;
        System.out.println("Average for this trip is:" + average );
    }
    userInput.close();
    // átti eftir að bæta inn svo þetta færi allt í sama lista
    }
}