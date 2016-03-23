public class TripInventory extends Trip{
	
	
	//Vænanlega geymum við ferðirnar inn í fylki
	private Object[] Inventory;
	
	//gæti verið heppilegt til að vita hve margar ferðir eru í 
	//fylkinu og í hvaða sæti næsta ferð fer.
	int count;
	
	
	//Til bráðabirgða allavega þá hugsa ég sniðugt að hafa
	//svona fall til að búa til Trip hlutina  
	//spurning hvernig þetta tengist við sql seinna
	public void maketrip(String name, String type, Object[] information){
		Trip a = new Trip;
		a.setname(name);
		a.settype(type);
		a.maketripproperties(information);
		Inventory[count++]=a;
	}
	
	
	
	public void search(){
		
	}
	
	
	
}