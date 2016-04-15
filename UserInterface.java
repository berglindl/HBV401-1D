import java.util.Scanner;

class UserInterface{

	public static void main( String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose the desired operation");
		System.out.println("1. Search for a daytrip");
		System.out.println("2. Reserve a daytrip");
		System.out.println("3. Look at reviews");
		System.out.println("Please press 1, 2 or 3: ");
		int operation = sc.nextInt();
		if(operation==1)Search();
		if(operation==2)Reserve();
		if(operation==3)ReviewLook();
		// á þetta þá að skila reviewList??
	}


	public static void Search(){
		Scanner ssc = new Scanner(System.in);

		System.out.println("Searching for daytrips");
		System.out.println("Are you searching for a specific trip?");
		System.out.println("If so, please enter the name of the trip. Please be sure to capitalize as instructed. If not, press the ENTER key.");
		System.out.println("Here are the names of the trips we have to offer: ");
		System.out.println("Into the Glacier");
		System.out.println("Skiing on Hrútafjallstindar");
		System.out.println("Whale Watching in Húsavík");
		System.out.println("History Walk Through Downtown");
		System.out.println("The Golden Circle and Snorkeling");
		System.out.println("Glacier Walking and Waterfalls");
		System.out.println("Northern Lights Explorer");
		System.out.println("Game of Thrones - Mývatn Mystery Magic");
		System.out.println("A Trip to Papey Islands");
		System.out.println("The Caves in Ingólfsfjall");
		System.out.println("Skiing Through Langanes");
		System.out.println("Whale Watching in Breiðarfjörður");
		System.out.println("Western Dancing Trip");
		System.out.println("A Walk Through Viðey");
		System.out.println("Landmannalaugar and Hjálparfoss");
		System.out.println("Meet the Puffins and Hike");
		System.out.println("Goðafoss, Dimmuborgir and Mývatn Nature Baths");
		System.out.println("Jökulsárlón");
		System.out.println("Snæfellsnes Penisula");
		System.out.println("Inside the Volcano");

		String tripName = ssc.nextLine();
		if(tripName.length<1)tripName=null;

		System.out.println("Are you searching for a specific type of trips?");
		System.out.println("If so, please enter the type of trip. Please be sure to capitalize as instruced. If not, press the ENTER key.");
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

		String tripType = ssc.nextLine();
		if(tripType.length<1)tripType=null;

		Object[] propinf = TripPropSearch();

		Object[] results = TripInventory.search(tripName, tripType, propinfo);

		if(results.length<1) System.out.println("Sorry! No day trips matched your input.");
		else System.out.println("The following day trips matched your criteria:");
		for(int i = 0;i!=results.length;i++)System.out.println(results[i].getName());

	}

	public static Object[] TripPropSearch(){

		Scanner trsc = new Scanner(System.in);
		System.out.println("Please enter the cardinal direction you wish to see the trips for.");
		System.out.println("Press 1 for North, 2 for East, 3 for South, 4 for West, or press the ENTER key to skip this question.");
		int cardDir = trsc.nextInt();
		if(cardDir.length<1)cardDir=null;

		System.out.println("Please enter your language.");
		System.out.println("Press 1 for Icelandic, 2 for English, 3 for Chinese, 4 for Spanish, 5 for French, 6 for Swedish, or press the ENTER key to skip this question."); 

		int selectLanguage = trsc.nextInt();
		if(selectLanguage.length<1)selectLanguage=null;

		System.out.println("Please enter the desired danger level on a scale of 1 to 5.");
		System.out.println("Press the ENTER key to skip this question.");
		int review = trsc.nextInt();
		if(review < 0 || review > 5) review = null;

		System.out.println("Do you wish to allow pets on the trip?");
		System.out.println("Please enter Yes or No, or press the ENTER key to skip this question.");
		String anima = trsc.nextLine();
		//boolean animals = new boolean;
		boolean animals = new Boolean();
		//Arranged so that both inputs will be valid,
		//since a lot of people don't capitalize letters, despite being asked to do so
		//we can get away with not doing so here, but not above. 
		if(anima.equals("Yes"))animals = true;
		if(anima.equals("yes"))animals = true;
		if(anima.equals("No"))animals = false;
		if(anima.equals("no"))animals = false;
		else animals = null;

		System.out.println("Do you wish to have insurence included on the trip?");
		System.out.println("Please enter Yes or No, or press the ENTER key to skip this question.");
		String insurenc = trsc.nextLine();
		//boolean insurence = new boolean;
		boolean insurence = new Boolean();
		if(insurenc.equals("Yes")) insurence = true;
		if(insurenc.equals("yes")) insurence = true;
		if(insurenc.equals("No")) insurence = false;
		if(insurenc.equals("no")) insurence = false;
		else insurence = null;

		System.out.println("Do you wish to be picked up and dropped off at your hotel or a nearby location?");
		System.out.println("Please enter Yes or No, or press ENTER to skip this question.");
		String picku = trsc.nextLine();
		//boolean pickUp = new boolean();
		boolean pickUp = new Boolean();
		if(picku.equals("Yes")) pickUp = true;
		if(picku.equals("yes")) pickUp = true;
		if(picku.equals("No")) pickUp = false;
		if(picku.equals("no")) pickUp = false;
		else pickUp = null;

		System.out.println("Do you wish for the trip to be accessible for the disabled?");
		System.out.println("Please enter Yes or No, or press ENTER to skip this question.");
		String accessibilit = trsc.nextLine();
		//boolean accessibility = new boolean();
		boolean accessibility = new Boolean();
		if(accessibilit.equals("Yes")) accessibility = true;
		if(accessibilit.equals("yes")) accessibility = true;
		if(accessibilit.equals("No")) accessibility = false;
		if(accessibilit.equals("no")) accessibility = false;
		else accessibility = null;

		//Þegar ég reyni að keyra forritið kemur upp villa út af þessu

		return Object[] a = {cardDir, selectLanguage, review, animals, insurence, pickUp, accessibility};
	}
}