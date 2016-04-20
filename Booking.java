public class Booking{
	import java.util.Scanner;

	/* Here we need a connection to the trips
	It would be best if a list of the trips would appear that you could choose from
	Then you would chose a date

	NEEDS A CODE THAT MAKES SURE THAT EVERY TRIP OFFERS 20 SEATS PER TRIP

	Then we have to call reserve from booking.inventory 

	*/

	private int numSeats = 20;
	// change to a code gor every trip and date

	private String tripName;

	//The class Recieve grabs the Inventory object from Trip
	class Recieve{
		public void GetInfo(Object[] Inventory){
			// we should problably make new variables that connect trip1-20 to the values in Inventory then 
			//call it as a GetInfo info = new GetInfo or something like that
			// here below

		}
	}


	class SelectTrip{
		public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);
	    {
	        Scanner selectTrip = new Scanner(System.in);

	      	System.out.println("Select the trip you wish to book.");
	        System.out.println("Please note that there are only 20 seats available for each trip.");
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
	        System.out.println("Press 18 for the trip Jökulsárlón,");
	        System.out.println("Press 19 for the trip Snæfellsnes Peninsula,");
	        System.out.println("Press 20 for the trip Inside the Volcano.");

			tripNum = selectTrip.nextInt();
	        //switch(tripNum){
	        //Myndum setja hér case 1 case 2 etc. fyrir ferðirnar
	        }
	    }
	// move date from booking inventory over here to make a connection between classes
	}


}