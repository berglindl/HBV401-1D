import java.util.Scanner;

public class UserInterface{

	public static void main( String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose the desired operation");
		System.out.println("1. Search for a daytrip");
		System.out.println("2. Reserve a daytrip");
		System.out.println("3. Look at reviews");
		System.out.println("Please press 1, 2 or 3: ");
		int operation = sc.nextInt();
		if(operation==1)search();
		if(operation==2)reserve();
		if(operation==3)reviewlook();
		// á þetta þá að skila reviewList??
	}
}

public static void Search(){
	Scanner ssc = new Scanner(System.in);
	System.out.println("Searching for daytrips");
	System.out.println("Are you searching for a specific trip?");
	System.out.println("If so, please enter the name of the trip. If not, press the ENTER key.");
	// Væri ekki betra að birta lista yfir ferðirnar einhversstaðar eða er einhversstaðar í forritinu hægt fyrir notenda að hugsa
	// Hvað ætli sé í boði og leita því eftir allt?

	//Ég held að það væri fínt að hafa valmöguleikann á að sjá allar ferðirnar, mögulega að gera það fyrst, þ.e á undan specific trip
	String tripname = ssc.nextLine();
	if(tripname.length<1)tripname=null;
	System.out.println("Are you searching for a specific type of trips?");
	System.out.println("If so, please enter the type of trip. If not, press the ENTER key.");
	System.out.println("Here are the type of trips we have to offer: ");
	System.out.println("Mountain");
	System.out.println("Skiing");
	System.out.println("Whale Watching");
	System.out.println("Walking");
	System.out.println("Snorkeling");
	System.out.println("Northern Lights");
	System.out.println("Geothermal Pool");
	System.out.println("Island");
	System.out.println("Dancing");
	System.out.println("Hiking");
	System.out.println("Touring");
	//Mögulega segja hér hvaða valkostir eru?
	// Líst vel á það þar sem ég veit ekki sjálf hvað er í boði, er þetta hiking og það eða e-ð annað?

	//Mögulega að gera þetta svona?

	String triptype = ssc.nextLine();
	if(triptype.length<1)triptype=null;

	Object[] propinf = tripPropSearch();

	Object[] results = TripInventory.search(tripname,tripname,propinf);

	if(results.length<1) System.out.println("Sorry! No day trips matched your input.");
	else System.out.println("The following day trips matched your criteria:");
	for(int i = 0;i!=results.length;i++)System.out.println(results[i].getName());

}

public static Object[] TripPropSearch(){
	Scanner trsc = new Scanner(System.in);
	System.out.println("Please enter the cardinal direction you wish to see the trips for.");
	System.out.println("Press 1 for North, 2 for East, 3 for South, 4 for West, or press the ENTER key to skip this question.");
	int location = trsc.nextInt();
	if(location.length<1)location=null;

	System.out.println("Please enter your language.");
	System.out.println("Press 1 for Icelandic, 2 for English, 3 for Chinese, 4 for Spanish, 5 for French, 6 for Swedish, or press the ENTER key to skip this question."); 
	//ENG:english,CHI:chinese,ISL:Icelandic
	//Spurning um að bæta hinum tungumálunum við? Það eru spænska(ESP), Franska(FRE) og Sænska(SWE)??

	//Bætti þeim við :)
	int language = trsc.nextInt();
	if(language.length<1)language=null;

	System.out.println("Please enter the desired danger level on a scale of 1 to 5.");
	//Pæling við erum ekki að nota öll danger level, þannig þarf ekki annaðhvort að laga það eða taka þetta út?

	//Mér sýnist við vera að nota öll, spurning um að bulla smá ef ekki hehe 
	System.out.println("Press the ENTER key to skip this question.");
	int danger = trsc.nextInt();

	System.out.println("Do you wish to allow pets on the trip?");
	System.out.println("Please enter Yes or No, or press the ENTER key to skip this question.");
	String anima = trsc.nextLine();
	boolean animals = new boolean;
	//Arranged so that both inputs will be valid,
	//since a lot of people don't capitalize letters, despite being asked to do so
	if(anima.equals("Yes"))animals = true;
	if(anima.equals("yes"))animals = true;
	if(anima.equals("No"))animals = false;
	if(anima.equals("no"))animals = false;

	System.out.println("Do you wish to have insurence included on the trip?");
	System.out.println("Please enter Yes or No, or press the ENTER key to skip this question.");
	String insurenc = trsc.nextLine();
	boolean insurence = new boolean;
	if(insurenc.equals("Yes")) insurence = true;
	if(insurenc.equals("yes")) insurence = true;
	if(insurenc.equals("No")) insurence = false;
	if(insurenc.equals("no")) insurence = false;

	System.out.println("Do you wish to be picked up and dropped off at your hotel or a nearby location?");
	System.out.println("Please enter Yes or No, or press ENTER to skip this question.");
	String picku = trsc.nextLine();
	boolean pickUp = new boolean();
	if(picku.equals("Yes")) pickUp = true;
	if(picku.equals("yes")) pickUp = true;
	if(picku.equals("No")) pickUp = false;
	if(picku.equals("no")) pickUp = false;

	System.out.println("Do you wish for the trip to be accessible for the disabled?");
	// Fannst handicapped allt í einu hljóma illa, getið breytt aftur
	//Já ég var pínu sceptical um hvort að það væri rétta orðið, þetta hljómar betur
	System.out.println("Please enter Yes or No, or press ENTER to skip this question.");
	String accessibilit = trsc.nextLine();
	boolean accessibility = new boolean();
	if(accessibilit.equals("Yes")) accessibility = true;
	if(accessibilit.equals("yes")) accessibility = true;
	if(accessibilit.equals("No")) accessibility = false;
	if(accessibilit.equals("no")) accessibility = false;
	

	//Object[] SearchProp = SearchPropSearch();


	return Object[] a={location,language,danger,animals,insurence, pickUp, accessibility};
}

/*
public static Object[] SearchPropSearch();{



}
*/