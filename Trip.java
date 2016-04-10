public class Trip{
	
	private String name;
	private String type;
	
	Object tripProperties;
	
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
	
	public boolean getPropinfo( Object [] propquest){
		
		//Ef við miðum við það sem ég setti í TripProperties 
		//þá gætum við sótt allt í fylki og borið saman við fylkið sem var
		//sent inn
		Object[] properties = tripProperties.getInfo;
		
		//Þá breytum við lítillega því sem er fyrir neðan
		if(!(propquest[0] == NULL || tripProperties.getLoc() == (int)(propquest[0])) ) return false;
		
		if(!(propquest[1] == NULL || (tripProperties.getlanguage()).equals((String)(propquest[1])))) return false;
		
		if(!(propquest[2] == NULL || tripProperties.getDanger() == (int)(propquest[2]) ) return false;
				
		if(!(propquest[3] == NULL || propquest[3] !^ tripProperties.getAnimal() )) return false;
				
		//*Hérna vantar á milli*//
		
		if(!(tripProperties.getSearchprop((Object[])(propquest[14])))) return false;
		
		
		return true;
		
	}
	
	
	public void compare(){
		
	}
	
	public void initializeTrip(){
		//trips from 0 - 14
		//segja hvaða ferð er hvað?
		//tengist við tripProperties/getInfo.TripProperties
	}
}