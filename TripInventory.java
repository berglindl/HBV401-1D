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
	
	//Just a general case to have *something* there
	//Might need some tweaking to get this to work.. agh
	
	@Test
	public void searchFor(){
		assertTrue(Inventory.isEmpty());
	}
	
}