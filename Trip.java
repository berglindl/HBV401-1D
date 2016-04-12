public class Trip{
	
	private String name;
	private String type;
	
	Object tripProperties;

	//Færði þetta úr TripInventory yfir til hingað

	//Til bráðabirgða allavega þá hugsa ég sniðugt að hafa
	//svona fall til að búa til Trip hlutina  
	//spurning hvernig þetta tengist við sql seinna
	public void makeTrip(String name, String type, Object[] information){
		Trip a = new Trip;
		a.setName(name);
		a.setType(type);
		a.maketripproperties(information);
		Inventory.addToInventory(a);
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setType(String t){
		type = t;
	}
	
	public String getName(){
		return name;
	}
	
	public String getType(){
		return type;
	}
	
	public boolean getPropInfo( Object [] propquest){
		
		//Ef við miðum við það sem ég setti í TripProperties 
		//þá gætum við sótt allt í fylki og borið saman við fylkið sem var
		//sent inn
		Object[] properties = tripProperties.getInfo;
		
		//Þá breytum við lítillega því sem er fyrir neðan
		/*
		if(!(propquest[0] == NULL || tripProperties.getLoc() == (int)(propquest[0])) ) return false;
		
		if(!(propquest[1] == NULL || (tripProperties.getlanguage()).equals((String)(propquest[1])))) return false;
		
		if(!(propquest[2] == NULL || tripProperties.getDanger() == (int)(propquest[2]) ) return false;
				
		if(!(propquest[3] == NULL || propquest[3] !^ tripProperties.getAnimal() )) return false;
		*/
				
		//*Hérna vantar á milli*//

		//Á þetta að vera sett upp svona?
		//Ef svo ekki, endilega laga það þá

		//Þurfum mögulega að gera þetta á einhvern annan hátt því við þurfum að skilgreina seinna hvaða case er verið að tala um...
		//þ.e fyrir int og string

		if(!(propquest[0] == NULL || propquest[0] !^ tripProperties.animals() )) return false;

		if(!(propquest[1] == NULL || propquest[1] !^ tripProperties.insurence() )) return false;
		
		if(!(propquest[2] == NULL || propquest[2] !^ tripProperties.pickUp() )) return false;

		if(!(propquest[3] == NULL || propquest[3] !^ tripProperties.accessibility() )) return false;

		if(!(propquest[4] == NULL || tripProperties.dangerReview() == (int)(propquest[4]) ) return false;

		if(!(propquest[5] == NULL || tripProperties.tripLength() == (int)(propquest[5]) ) return false;
		
		if(!(propquest[6] == NULL || tripProperties.tripPrice() == (int)(propquest[6]) ) return false;

		if(!(propquest[7] == NULL || (tripProperties.language()).equals((String)(propquest[7])))) return false;

		if(!(propquest[8] == NULL || (tripProperties.location()).equals((String)(propquest[8])))) return false;

		if(!(propquest[9] == NULL || (tripProperties.additionalInfo()).equals((String)(propquest[9])))) return false;
				

		if(!(tripProperties.getSearchprop((Object[])(propquest[14])))) return false;
		
		
		return true;
		
	}
	
	
	public void compare(){
		
	}
	
	public void initializeTrip(){
		//Trip trip1.getInfo = new Trip
		//eða eitthvað á þá leið?
		//trips from 0 - 14
		//segja hvaða ferð er hvað?
		//tengist við tripProperties/getInfo.TripProperties


	}
}