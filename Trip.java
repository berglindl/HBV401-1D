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
	
	public void initializeTrip(Object[] trip1, trip2, trip3, trip4, trip5, trip6, trip7, trip8, trip9, trip10
					trip11, trip12, trip13, trip14){

		Object[] info = tripProperties.getInfo;

		//Spurning um að þetta gæti virkað svona?

		Trip trip1 = new Trip({
			this.name = "Into the Glacier",
			this.type = "Mountain",
			this.cardDir = 3,
			this.selectLanguage = 1,
			this.review = 2,
			this.animals = false,
			this.insurence = true,
			this.pickUp = false,
			this.length = 2,
			this.addInfo = 1,
			this.accessibility = false,
			this.price = 5
		});

		Inventory.addToInventory(trip1);

		Trip trip2 = new Trip({
			this.name = "Skiing on Hrútafjallstindar",
			this.type = "Skiing",
			this.cardDir = 2,
			this.selectLanguage = 5,
			this.review = 5,
			this.animals = false,
			this.insurence = true,
			this.pickUp = false,
			this.length = 3,
			this.addInfo = 2,
			this.accessibility = false,
			this.price = 3
		});

		Inventory.addToInventory(trip2);

		Trip trip3 = new Trip({
			this.name = "Whale Watching in Húsavík",
			this.type = "Whale Watching",
			this.cardDir = 1,
			this.selectLanguage = 5,
			this.review = 1,
			this.animals = false,
			this.insurence = false,
			this.pickUp = false,
			this.length = 7,
			this.addInfo = 3,
			this.accessibility = false,
			this.price = 7
		});

		Inventory.addToInventory(trip3);
		
		Trip trip4 = new Trip({
			this.name = "History Walk Through Downtown",
			this.type = "Walking", // ?? ekki viss hvað á að setja hér
			this.cardDir = 4,
			this.selectLanguage = 2,
			this.review = 1,
			this.animals = true,
			this.insurence = false,
			this.pickUp = true,
			this.length = 1,
			this.addInfo = 4,
			this.accessibility = true,
			this.price = 1
		});

		Inventory.addToInventory(trip4);

		Trip trip5 = new Trip({
			this.name = "The Golden Circle and Snorkeling",
			this.type = "Snorkeling", //sama hér og fyrir ofan
			this.cardDir = 3,
			this.selectLanguage = 5,
			this.review = 2,
			this.animals = false,
			this.insurence = false,
			this.pickUp = true,
			this.length = 6,
			this.addInfo = 5,
			this.accessibility = false,
			this.price = 10
		});

		Inventory.addToInventory(trip5);
			
		Trip trip6 = new Trip({
			this.name = "Glacier Walking and Waterfalls",
			this.type = "Mountain",
			this.cardDir = 3,
			this.selectLanguage = 5,
			this.review = 1,
			this.animals = false,
			this.insurence = false,
			this.pickUp = true,
			this.length = 8,
			this.addInfo = 6,
			this.accessibility = false,
			this.price = 3
		});

		Inventory.addToInventory(trip6);

		Trip trip7 = new Trip({
			this.name = "Northern Lights Explorer",
			this.type = "Northern Lights",
			this.cardDir = 3,
			this.selectLanguage = 5,
			this.review = 1,
			this.animals = false,
			this.insurence = false,
			this.pickUp = true,
			this.length = 2,
			this.addInfo = 7,
			this.accessibility = false,
			this.price = 1
		});

		Inventory.addToInventory(trip7);
		
		Trip trip8 = new Trip({
			this.name = "Game of Thrones - Mývatn Mystery Magic",
			this.type = "Misc",
			this.cardDir = 1,
			this.selectLanguage = 5,
			this.review = 1,
			this.animals = false,
			this.insurence = false,
			this.pickUp = true,
			this.length = 4,
			this.addInfo = 8,
			this.accessibility = false,
			this.price = 4
		});

		Inventory.addToInventory(trip8);
		
		Trip trip9 = new Trip({
			this.name = "A Trip to Papey Islands",
			this.type = "Island",
			this.cardDir = 2,
			this.selectLanguage = 1,
			this.review = 1,
			this.animals = true,
			this.insurence = false,
			this.pickUp = false,
			this.length = 2,
			this.addInfo = 9,
			this.accessibility = false,
			this.price = 5
		});

		Inventory.addToInventory(trip9);
		    
		Trip trip10 = new Trip({
			this.name = "The Caves in Ingólfsfjall",
			this.type = "Mountain",
			this.cardDir = 1,
			this.selectLanguage = 5,
			this.review = 2,
			this.animals = false,
			this.insurence = true,
			this.pickUp = true,
			this.length = 2,
			this.addInfo = 10,
			this.accessibility = false,
			this.price = 2
		});

		Inventory.addToInventory(trip10);
		    
		Trip trip11 = new Trip({
			this.name = "Skiing Through Langanes",
			this.type = "Skiing",
			this.cardDir = 2,
			this.selectLanguage = 2,
			this.review = 2,
			this.animals = true,
			this.insurence = true,
			this.pickUp = true,
			this.length = 4,
			this.addInfo = 11,
			this.accessibility = false,
			this.price = 6
		});

		Inventory.addToInventory(trip11);
		    
		Trip trip12 = new Trip({
			this.name = "Whale Watching in Breiðafjörður",
			this.type = "Whale Watching",
			this.cardDir = 4,
			this.selectLanguage = 7,
			this.review = 3,
			this.animals = true,
			this.insurence = true,
			this.pickUp = false,
			this.length = 5,
			this.addInfo = 12,
			this.accessibility = false,
			this.price = 8
		});

		Inventory.addToInventory(trip12);
		    
		Trip trip13 = new Trip({
			this.name = "Western Dancing Trip",
			this.name = "Misc",
			this.cardDir = 4,
			this.selectLanguage = 4,
			this.review = 1,
			this.animals = true,
			this.insurence = true,
			this.pickUp = true,
			this.length = 3,
			this.addInfo = 13,
			this.accessibility = false,
			this.price = 3
		});

		Inventory.addToInventory(trip13);
		
	    Trip trip14 = new Trip({
	    	this.name = "A Walk Through Viðey",
	    	this.type = "Walking",
	    	this.cardDir = 4,
			this.selectLanguage = 5,
			this.review = 1,
			this.animals = false,
			this.insurence = true,
			this.pickUp = false,
			this.length = 2,
			this.addInfo = 14,
			this.accessibility = false,
			this.price = 1
	    });

	    Inventory.addToInventory(trip14);
		
	    Trip trip15 = new Trip({
	    	this.name = "Landmannalaugar and Hjálparfoss",
	    	this.type = "A visit to a geothermal pool",
	    	this.cardDir = 3,
			this.selectLanguage = 6,
			this.review = 1,
			this.animals = false,
			this.insurence = false,
			this.pickUp = true,
			this.length = 4,
			this.addInfo = 15,
			this.accessibility = false,
			this.price = 3
	    });

	    Inventory.addToInventory(trip15);
		
	    Trip trip16 = new Trip({
	    	this.name = "Meet he puffins and hike",
	    	this.type = "Hiking with birds",
	    	this.cardDir = 2,
			this.selectLanguage = 3,
			this.review = 1,
			this.animals = false,
			this.insurence = false,
			this.pickUp = false,
			this.length = 2,
			this.addInfo = 16,
			this.accessibility = false,
			this.price = 1
	    });

	    Inventory.addToInventory(trip16);
		
	    Trip trip17 = new Trip({
	    	this.name = "Goðafoss, Dimmuborgir and Mývatns Nature baths",
	    	this.type = "Tour of Nature",
	    	this.cardDir = 1,
			this.selectLanguage = 3,
			this.review = 1,
			this.animals = false,
			this.insurence = false,
			this.pickUp = true,
			this.length = 6,
			this.addInfo = 17,
			this.accessibility = false,
			this.price = 5
	    });

	    Inventory.addToInventory(trip17);
		
	    Trip trip18 = new Trip({
	    	this.name = "Jökulsárlón",
	    	this.type = "Glacier",
	    	this.cardDir = 3,
			this.selectLanguage = 7,
			this.review = 1,
			this.animals = false,
			this.insurence = true,
			this.pickUp = false,
			this.length = 5,
			this.addInfo = 18,
			this.accessibility = false,
			this.price = 5
	    });

	    Inventory.addToInventory(trip18);
		
	    Trip trip19 = new Trip({
	    	this.name = "Snæfellsnes peninsula",
	    	this.type = "A tour through Snæfellsnes",
	    	this.cardDir = 4,
			this.selectLanguage = 2,
			this.review = 1,
			this.animals = true,
			this.insurence = false,
			this.pickUp = true,
			this.length = 6,
			this.addInfo = 19,
			this.accessibility = false,
			this.price = 4
	    });

	    Inventory.addToInventory(trip19);
		
	    Trip trip20 = new Trip({
	    	this.name = "Inside the volcano",
	    	this.type = "A rupturing experience",
	    	this.cardDir = 3,
			this.selectLanguage = 7,
			this.review = 4,
			this.animals = false,
			this.insurence = true,
			this.pickUp = false,
			this.length = 3,
			this.addInfo = 20,
			this.accessibility = false,
			this.price = 9
	    });

	    Inventory.addToInventory(trip20);

	}

	public boolean getPropInfo( Object [] propquest){
		
		//Ef við miðum við það sem ég setti í TripProperties 
		//þá gætum við sótt allt í fylki og borið saman við fylkið sem var
		//sent inn
		Object[] properties = tripProperties.getInfo;
		
		if(!(propquest[0] == NULL || propquest[0] !^ tripProperties.animals() )) return false;

		if(!(propquest[1] == NULL || propquest[1] !^ tripProperties.insurence() )) return false;
		
		if(!(propquest[2] == NULL || propquest[2] !^ tripProperties.pickUp() )) return false;

		if(!(propquest[3] == NULL || propquest[3] !^ tripProperties.accessibility() )) return false;

		if(!(propquest[4] == NULL || tripProperties.review() == (int)(propquest[4]) ) return false;

		if(!(propquest[5] == NULL || tripProperties.length() == (int)(propquest[5]) ) return false;
		
		if(!(propquest[6] == NULL || tripProperties.price() == (int)(propquest[6]) ) return false;

		if(!(propquest[7] == NULL || tripProperties.selectLanguage() == (int)(propquest[7]) ) return false;

		if(!(propquest[8] == NULL || tripProperties.cardDir() == (int)(propquest[8]) ) return false;

		if(!(propquest[9] == NULL || tripProperties.addInfo() == (int)(propquest[9]) ) return false;


		// Þetta mátti taka út, right?
		/*if(!(tripProperties.getSearchprop((Object[])(propquest[14])))) return false;*/
		
		
		return true;
		
	}
}