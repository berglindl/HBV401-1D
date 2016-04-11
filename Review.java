import java.util.Scanner;
class review
// var ekki alveg viss hvernig ég ætti að gera þetta þannig ákvað að henda up smá byrjun
// Þetta var fyrsta útgáfan þar sem ég fékk ekki villu í keyrslu þannig hélt henni inni en 
// eins og þið sjáið þá er þetta ekki fallegt
{
    // Hér þyrfti að vera einhver tenging við ferðirnar en var ekki viss hvernig við vildum gera þetta
    // þannig tengdi ekki við tripNames eða neitt svoleiðis ennþá
public static void main(String [] args)
    {
    int vote;
    int votesCount = 0;
    // Núlstillti bara til að byrja með þar sem það er enging tenging við neitt komin
    // breytum þessu á endanum
    Scanner userInput = new Scanner(System.in);
    {
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