public class TripInventory extends Trip{
	
	import org.junit.*;
	import static org.junit.Assert.*;
	
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
	
	
	
	public void search(){
		//Svona vector er góður þegar við vitum ekki hve mörgum stökum
		//við viljum bæta við í fylki
		//notar searchpositives.add(nafn objects)
		//ef við viljum skila af okkur honum sem fylki searchpositives.toArray();
		Vector<String> searchpositives = new Vector<String>();

		


	}


	public boolean compare(String a, String b){
		if(a.equals(b)){
			return true;
		}
		return false;
	}
	
	public boolean compare(String a, String[] b){
		for(i=0; i!=b.length ; i++){
			if(a.equals(b[i])){
				return true;
			}
		}
		return false;
	}

	public boolean compare(int a, int b){
		if (a==b) return true;
		return false;
	}

	public boolean compare(boolean a,boolean b){
		return !(a^b);
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
	}

	//basic starts of these classes that can be implemented once the search
	//has been properly implemented 
	@Test
	public void testSearchingForWestTrips(){
		Trip = new Trip();
		//assertTrue that there are trips in the west
	}
	
	@Test
	public void testSearchingForAvailableSeat(){
		Trip = new Trip();
		//assertTrue that there's an available seat in a certain trip
		//This has the possibility of failing due to the nature of the seat class
	}

	@Test
	public void testSearchingForADate(){
		Trip = new Trip();
		//assertTrue that there's an available trip on a certain date
	}

	//Maybe implement this as well?
	@Test
	public void testSearchingForLowPrices(){
		Trip = new Trip();
		//assertTrue that there's trips available for less than ~20.000kr. 
		//This has a possibility of failing due to the nature of the price class
	}
}