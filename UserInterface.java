import java.util.Scanner;

class UserInterface{

	public static void main( String[] args){
		//Scanner sc = new Scanner(System.in);
		/*System.out.println("Please choose the desired operation");
		System.out.println("1. Search for a daytrip");
		System.out.println("2. Reserve a daytrip");
		System.out.println("3. Look at reviews");
		System.out.println("Please press 1, 2 or 3: ");
		int operation = sc.nextInt();
		if(operation==1)Search();
		if(operation==2)Reserve();
		if(operation==3)ReviewLook(); */
		// á þetta þá að skila reviewList??
		
		//Þetta á í raun ekki að skila neinu bara kalla á önnur föll sem skila prenta út eitthvað, og sum kalla á föll í öðrum klösum sem skila þá gögnum (inntakinu) í gagnasöfnin okkar
		Search();
	}


	public static void Search(){
		//Search tekur inn af aðalinntaki þau gögn sem notandi vill leita eftir
		//kallar á TripPropSearch til að fylla inn fylki af enn frekari gögnum sem notandi kann að vilja leita eftir
		//Sendir fyrrnenfnd gögn til TripInventory.search(); og tekur við niðurstöðum þess sem fylki.
		//Notandi getur þá valið að panta eða skoða umsagnir um ferðir.
		
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
		//if(tripName.length<1)tripName=null;

		System.out.println("Are you searching for a specific type of trips?");
		System.out.println("If so, please enter the type of trip. Please be sure to capitalize as instructed. If not, press the ENTER key.");
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
		//if(tripType.length<1)tripType=null;

		Object[] propinf = TripPropSearch();

		Object[] results = TripInventory.search(tripName, tripType, propinf);

		if(results.length<1) {System.out.println("Sorry! No day trips matched your input.");return;}
		else System.out.println("The following day trips matched your criteria:");
		for(int i = 0;i!=results.length;i++)System.out.println("Trip no "+i+" "results[i].getName());
		System.out.println("Do you wish to reserve  any of these trips?");
		System.out.println("Please enter Trip no");
		int tripno = sc.nextInt();
		System.out.println("Do you wish to look at its review first?");
		System.out.println("Please enter yes or no.");
		String revw = ssc.nextLine();
		if(revw.equals("Yes"))ReviewLook();
		if(revw.equals("yes"))ReviewLook();
		if(tripno==null)return;
		Reserve(results[tripno])		
		

	}

	public static Object[] TripPropSearch(){
		//TripPropSearch safnar saman upplýsingum sem geymdar eru í TripProperties sem leitandi vill leita eftir og skilar til baka fylki með 
		//leitarupplýsingum.

		Scanner trsc = new Scanner(System.in);
		System.out.println("Please enter the cardinal direction you wish to see the trips for.");
		System.out.println("Press 1 for North, 2 for East, 3 for South, 4 for West, or press the ENTER key to skip this question.");
		int cardDir = trsc.nextInt();
		//if(cardDir < 0 || cardDir > 4) cardDir = null;
		//if(cardDir.length<1)cardDir=null;

		System.out.println("Please enter your language.");
		System.out.println("Press 1 for Icelandic, 2 for English, 3 for Chinese, 4 for Spanish, 5 for French, 6 for Swedish, or press the ENTER key to skip this question."); 

		int selectLanguage = trsc.nextInt();
		//if(selectLanguage < 0 || selectLanguage > 6) selectLanguage = null;
		//if(selectLanguage.length<1)selectLanguage=null;

		System.out.println("Please enter the desired danger level on a scale of 1 to 5.");
		System.out.println("Press the ENTER key to skip this question.");
		int review = trsc.nextInt();
		//if(review < 0 || review > 5) review = null;

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
		//else animals = null;

		System.out.println("Do you wish to have insurance included on the trip?");
		System.out.println("Please enter Yes or No, or press the ENTER key to skip this question.");
		String insurenc = trsc.nextLine();
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
		//else pickUp = null;

		System.out.println("Do you wish for the trip to be accessible for the disabled?");
		System.out.println("Please enter Yes or No, or press ENTER to skip this question.");
		String accessibilit = trsc.nextLine();
		//boolean accessibility = new boolean();
		boolean accessibility = new Boolean();
		if(accessibilit.equals("Yes")) accessibility = true;
		if(accessibilit.equals("yes")) accessibility = true;
		if(accessibilit.equals("No")) accessibility = false;
		if(accessibilit.equals("no")) accessibility = false;
		//else accessibility = null;

		//Þegar ég reyni að keyra forritið kemur upp villa út af þessu
		// Villan kemur hjá mér líka, ásamt villum tengdum .length á öðru stöðum.

		//return Object[] a = {cardDir, selectLanguage, review, animals, insurence, pickUp, accessibility};

		Object[] a = {cardDir, selectLanguage, review, animals, insurence, pickUp, accessibility};

		return a;
	}

	public static void Reserve(Trip rtrip){
		//klasinn sem hendir inn í Reserve
		//Núna þarf aðferð í BookingInventory sem býr til nýtt Booking með öllum þeim upplýsingum sem þurfa að koma fram.
		//Í þessari aðferð höfum við t.d. aðgang að "Hlutnum Ferðinni" sem ætlunin er að panta sæti í.
		
		
		
		
	}

	public static void ReviewLook(){
		//klasinn sem hendir inn í Review
		
		
	}
}