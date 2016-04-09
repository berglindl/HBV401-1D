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
		
		boolean match == true;
			
		if(!(propquest[0] == NULL || tripProperties.getLoc() == (int)(propquest[0])) ) match==false;
		
		
		if(!(propquest[1] == NULL || (tripProperties.getlanguage()).equals((String)(propquest[1])) )) match == false;
		else return false;
		
		if(!(propquest[2] == NULL || tripProperties.getDanger() == (int)(propquest[2]) ) match == false;
		else return false;
		
		if(!(propquest[3] == NULL || propquest[3] !^ tripProperties.getAnimal() )) match == false;
		else return false;
		
		//*Hérna vantar á milli*//
		
		if(!(tripProperties.getSearchprop((Object[])(propquest[14])))) match == false;
		else return false;
		
		return match;
		
	}
	
	
	public void compare(){
		
	}
	
	public void initializeTrip(){
		//trips from 0 - 14
		//segja hvaða ferð er hvað?
		//tengist við tripProperties/getInfo.TripProperties

		//EÐA hafa þetta millivegarklasa sem TripInventory sækjir upplýsingar í
	
	}
}