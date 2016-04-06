public class TripInventory extends Trip{
	
	import org.junit.*;
	import static org.junit.Assert.*;
	import java.util.Vector;
	
	//Vænanlega geymum við ferðirnar inn í fylki
	private Object[] Inventory;
	
	//gæti verið heppilegt til að vita hve margar ferðir eru í 
	//fylkinu og í hvaða sæti næsta ferð fer.
	int count;
	
	
	//Til bráðabirgða allavega þá hugsa ég sniðugt að hafa
	//svona fall til að búa til Trip hlutina  
	//spurning hvernig þetta tengist við sql seinna
	public void makeTrip(String name, String type, Object[] information){
		Trip a = new Trip;
		a.setname(name);
		a.settype(type);
		a.maketripproperties(information);
		Inventory[count++]=a;
	}
	
	
	
	public Object[] search(String tripName, String tripType, Object[] propinfo){
		//Svona vector er góður þegar við vitum ekki hve mörgum stökum
		//við viljum bæta við í fylki
		//notar searchpositives.add(nafn objects)
		//ef við viljum skila af okkur honum sem fylki searchpositives.toArray();
		Vector<String> searchpositives = new Vector<String>();
		
		for(int i= 0; i!=Inventory.length; i++){
			boolean match == false;
			boolean fail == false; 
			
			if(tripName == NULL || tripName.equals(Inventory[i].getName())) match == true;
			else fail == true;
			
			if(tripType== NULL || tripType.equals(Inventory[i].getType())) match == true;
			else fail == true;
			
			if( propinfo == NULL || Inventory[i].getPropinfo(propinfo) == true ) match == true;
			else fail == true;
			
			if(match && !fail) searchpositives.add(Inventory[i]);
		}
			
		return searchpositives.toArray();
	}




	//Before and after are meant to be empty so nothing to do here
	
	@Before
	public void setUp(){
		//...
	}
	
	@After
	public void tearDown(){
		//...
	}

	
	//Might be interesting to have a searching failure due to not having any trips
	@Test
	public void testSearchingFailiure(){
		assertTrue(Inventory.isEmpty());
		System.out.println("@Test inventory is not empty");
	}

	//basic starts of these classes that can be implemented properly once the search
	//has been properly implemented 
	//Which kind of needs to happen in order to be able to properly do this
	//Otherwise it's just an estimation.

	//This one will only work similarly to this if and only if we set cardDir = 4
	@Test
	public void testSearchingForWestTrips(){
		String west = TripProperties.location();
		assertEquals("Vestur" + west);
		System.out.println("@Test there are available west trips");
		//assertEquals that there are trips in the west
	}
	
	@Test
	public void testSearchingForAvailableSeat(){
		int seats = TripProperties.numSeats();
		assertTrue(seats >= 1);
		System.out.println("@Test there is an available seat");
		//assertTrue that there's an available seat in a certain trip
		//This has the possibility of failing due to the nature of the seat class
		//numSeats could give us a 0, meaning this has a (small) chance of failing
	}
	
	//This will only work similarly to this if and only if we set date = 1
	@Test
	public void testSearchingForADate(){
		String date = TripProperties.tripDate();
		assertEquals("01.05" + date);
		System.out.println("@Test there is an available trip on this date")
		//assertEquals that there's an available trip on a certain date
	}

	@Test
	public void testSearchingForLowPrices(){
		int lowPrice = TripProperties.tripPrice();
		assertTrue(lowPrice <= 20000);
		System.out.println("@Test there is an available trip for less than 20.000kr.");
		//assertTrue that there's trips available for less than ~20.000kr. 
		//This has a possibility of failing due to the nature of the price class
	}
}