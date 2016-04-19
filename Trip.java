public class Trip{

	private Object[] Inventory;

	int count;
	
	private String name;
	private String type;
	private boolean animals;
	private boolean insurence;
	private boolean pickUp;
	private boolean accessibility;

	private int review;
	private int cardDir;
	private int selectLanguage;
	private int length;
	private int addInfo;
	private int price;
	
	//Object tripProperties;

	Object tripProperties;



	public makeTrip(String name, String type, int cardDir, int selectLanguage, int review, boolean animals, boolean insurence, boolean pickUp, int lenght, int addInfo, boolean accessibility, int price){
			Object[] getInfor = TripProperties.getInfo();
			this.name = name;
			this.type = type;
			this.cardDir = getInfor.cardDir;
			this.selectLanguage = getInfor.selectLanguage;
			this.review = getInfor.review;
			this.animals = getInfor.animals;
			this.insurence = getInfor.insurence;
			this.pickUp = getInfor.pickUp;
			this.length = getInfor.length;
			this.addInfo = getInfor.addInfo;
			this.accessibility = getInfor.accessibility;
			this.price = getInfor.price;
	}
/*
	//Færði þetta úr TripInventory yfir til hingað

	//Til bráðabirgða allavega þá hugsa ég sniðugt að hafa
	//svona fall til að búa til Trip hlutina  
	//spurning hvernig þetta tengist við sql seinna
	public void makeTrip(String name, String type, int location, int language, int review, Object[] information){
		Trip a = new Trip();
		a.setName(name);
		a.setType(type);
		//a.maketripproperties(information);
		Inventory.addToInventory(a);
	}
	*/
	
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

	public static void addToInventory(Trip a){
		Inventory[count++] = a;
	}
/*
	//creates a connection to the Recieve class within Booking class
	private Recieve sendInfo;

	public Trip(Recieve inv){
		this.sendInfo = inv;
	}

	//sends Inventory over to the class GetInfo in Recieve in Booking
	public void SendInfo(Object[] Inventory){
		sendInfo.GetInfo(Inventory);
	}
	
	*/
	//spurning að hafa þetta sem public void initializeTrip(Object[] Inventory) í staðinn fyrir hitt?

	//public void initializeTrip(Object[] trip1, trip2, trip3, trip4, trip5, trip6, trip7, trip8, trip9, trip10
	//				trip11, trip12, trip13, trip14, trip15, trip16, trip17, trip18, trip19, trip20){

	public void initializeTrip(){

		//á þetta ekki að vera TripProperties, ekki tripProperties, og það fyrir ofan? eða er ég að misskilja?

		//Object[] info = tripProperties.getInfo;

		Object[] info = TripProperties.getInfo;

		//This looks god awful, but it does what we need it to do... 

		//Gætum þurft að setja einhverja tengingu við Object[] info

		Trip[] trips = new Trip[19];

		trips[0] = new Trip("Into the Glacier", "Mountain", 3, 1, 2, false, true, false, 2, 1, false, 5);
		trips[1] = new Trip("Skiing on Hrútafjallstindar", "Skiing", 2, 5, 5, false, true, false, 3, 2, false, 3);
		trips[2] = new Trip("Whale Watching in Húsavík", "Whale Watching", 1, 5, 1, false, false, false, 7, 3, false, 7);
		trips[3] = new Trip("History Walk Through Downtown", "Walking", 4, 2, 1, true, false, true, 1, 4, true, 1);
		trips[4] = new Trip("The Golden Circle and Snorkeling", "Snorkeling", 3, 5, 4, false, true, true, 6, 5, false, 10);
		trips[5] = new Trip("Glacier Walking and Waterfalls", "Mountain", 3, 5, 1, false, false, true, 8, 6, false, 3);
		trips[6] = new Trip("Northern Lights Explorer", "Northern Lights", 3, 5, 1, false, false, true, 2, 7, false, 1);
		trips[7] = new Trip("Game of Thrones - Mývatn Mystery Magic", "Geothermal Pool", 1, 5, 1, false, false, true, 4, 8, false, 4);
		trips[8] = new Trip("A Trip to Papey Islands", "Island", 2, 1, 1, true, false, false, 2, 9, false, 5);
		trips[9] = new Trip("The Caves in Ingólfsfjall", "Mountain", 1, 5, 2, false, true, true, 2, 10, false, 2);
		trips[10] = new Trip("Skiing Through Langanes", "Skiing", 2, 2, 2, true, true, true, 4, 11, false, 6);
		trips[11] = new Trip("Whale Watching in Breiðafjörður", "Whale Watching", 4, 7, 3, true, true, false, 5, 12, false, 8);
		trips[12] = new Trip("Western Dancing Trip", "Dancing", 4, 4, 1, true, true, true, 3, 13, true, 3);
		trips[13] = new Trip("A Walk Through Viðey", "Walking", 4, 5, 1, false, true, false, 2, 14, false, 1);
		trips[14] = new Trip("Landmannalaugar and Hjálparfoss", "Geothermal Pool", 3, 6, 1, false, false, true, 4, 15, false, 3);
		trips[15] = new Trip("Meet the Puffins and Hike", "Hiking", 2, 3, 1, false, false, false, 2, 16, false, 1);
		trips[16] = new Trip("Jökulsárlón", "Touring", 3, 7, 1, false, true, false, 5, 18, false, 5);
		trips[17] = new Trip("Goðafoss, Dimmuborgir and Mývatns Nature Baths", "Touring", 1, 3, 1, false, false, true, 6, 17, false, 5);
		trips[18] = new Trip("Snæfellsnes Penisula", "Touring", 4, 2, 1, true, false, true, 6, 19, false, 4);
	    trips[19] = new Trip("Inside the Volcano", "Mountain", 3, 7, 4, false, true, false, 3, 20, false, 9);

	    Inventory.addToInventory(trips);

		/*Trip trip1 = new Trip();
		
		trip1.name = "Into the Glacier";
		trip1.type = "Mountain";
		trip1.cardDir = 3;
		trip1.selectLanguage = 1;
		trip1.review = 2;
		trip1.animals = false;
		trip1.insurence = true;
		trip1.pickUp = false;
		trip1.length = 2;
		trip1.addInfo = 1;
		trip1.accessibility = false;
		trip1.price = 5;



		Inventory.addToInventory(trip1);

		/*

		Trip trip2 = new Trip();

		trip2.name = "Skiing on Hrútafjallstindar";
		trip2.type = "Skiing";
		trip2.cardDir = 2;
		trip2.selectLanguage = 5;
		trip2.review = 5;
		trip2.animals = false;
		trip2.insurence = true;
		trip2.pickUp = false;
		trip2.length = 3;
		trip2.addInfo = 2;
		trip2.accessibility = false;
		trip2.price = 3;

		Inventory.addToInventory(trip2);

		Trip trip3 = new Trip();

		trip3.name = "Whale Watching in Húsavík";
		trip3.type = "Whale Watching";
		trip3.cardDir = 1;
		trip3.selectLanguage = 5;
		trip3.review = 1;
		trip3.animals = false;
		trip3.insurence = false;
		trip3.pickUp = false;
		trip3.length = 7;
		trip3.addInfo = 3;
		trip3.accessibility = false;
		trip3.price = 7;

		Inventory.addToInventory(trip3);

		

		Trip trip4 = new Trip();

		trip4.name = "History Walk Through Downtown";
		trip4.type = "Walking";
		trip4.cardDir = 4;
		trip4.selectLanguage = 2;
		trip4.review = 1;
		trip4.animals = true;
		trip4.insurence = false;
		trip4.pickUp = true;
		trip4.length = 1;
		trip4.addInfo = 4;
		trip4.accessibility = true;
		trip4.price = 1;

		Inventory.addToInventory(trip4);


		Trip trip5 = new Trip();

		trip5.name = "The Golden Circle and Snorkeling";
		trip5.type = "Snorkeling";
		trip5.cardDir = 3;
		trip5.selectLanguage = 5;
		trip5.review = 4;
		trip5.animals = false;
		trip5.insurence = true;
		trip5.pickUp = true;
		trip5.length = 6;
		trip5.addInfo = 5;
		trip5.accessibility = false;
		trip5.price = 10;

		Inventory.addToInventory(trip5);

			
		Trip trip6 = new Trip();

		trip6.name = "Glacier Walking and Waterfalls";
		trip6.type = "Mountain";
		trip6.cardDir = 3;
		trip6.selectLanguage = 5;
		trip6.review = 1;
		trip6.animals = false;
		trip6.insurence = false;
		trip6.pickUp = true;
		trip6.length = 8;
		trip6.addInfo = 6;
		trip6.accessibility = false;
		trip6.price = 3;

		Inventory.addToInventory(trip6);

		
		Trip trip7 = new Trip();

		trip7.name = "Northern Lights Explorer";
		trip7.type = "Northern Lights";
		trip7.cardDir = 3;
		trip7.selectLanguage = 5;
		trip7.review = 1;
		trip7.animals = false;
		trip7.insurence = false;
		trip7.pickUp = true;
		trip7.length = 2;
		trip7.addInfo = 7;
		trip7.accessibility = false;
		trip7.price = 1;

		Inventory.addToInventory(trip7);

		
		Trip trip8 = new Trio();

		trip8.name = "Game of Thrones - Mývatn Mystery Magic";
		trip8.type = "Geothermal Pool";
		trip8.cardDir = 1;
		trip8.selectLanguage = 5;
		trip8.review = 1;
		trip8.animals = false;
		trip8.insurence = false;
		trip8.pickUp = true;
		trip8.length = 4;
		trip8.addInfo = 8;
		trip8.accessibility = false;
		trip8.price = 4;

		Inventory.addToInventory(trip8);

		Trip trip9 = new Trip();

		trip9.name = "A Trip to Papey Islands";
		trip9.type = "Island";
		trip9.cardDir = 2;
		trip9.selectLanguage = 1;
		trip9.review = 1;
		trip9.animals = true;
		trip9.insurence = false;
		trip9.pickUp = false;
		trip9.length = 2;
		trip9.addInfo = 9;
		trip9.accessibility = false;
		trip9.price = 5;
		
		Inventory.addToInventory(trip9);

	
		Trip trip10 = new Trip();

		trip10.name = "The Caves in Ingólfsfjall";
		trip10.type = "Mountain";
		trip10.cardDir = 1;
		trip10.selectLanguage = 5;
		trip10.review = 2;
		trip10.animals = false;
		trip10.insurence = true;
		trip10.pickUp = true;
		trip10.length = 2;
		trip10.addInfo = 10;
		trip10.accessibility = false;
		trip10.price = 2;
		
		Inventory.addToInventory(trip10);
		
		Trip trip11 = new Trip();

		trip11.name = "Skiing Through Langanes";
		trip11.type = "Skiing";
		trip11.cardDir = 2;
		trip11.selectLanguage = 2;
		trip11.review = 2;
		trip11.animals = true;
		trip11.insurence = true;
		trip11.pickUp = true;
		trip11.length = 4;
		trip11.addInfo = 11;
		trip11.accessibility = false;
		trip11.price = 6;

		Inventory.addToInventory(trip11);

		Trip trip12 = new Trip();

		
		trip12.name = "Whale Watching in Breiðafjörður";
		trip12.type = "Whale Watching";
		trip12.cardDir = 4;
		trip12.selectLanguage = 7;
		trip12.review = 3;
		trip12.animals = true;
		trip12.insurence = true;
		trip12.pickUp = false;
		trip12.length = 5;
		trip12.addInfo = 12;
		trip12.accessibility = false;
		trip12.price = 8;

		Inventory.addToInventory(trip12);

		
		Trip trip13 = new Trip();

		trip13.name = "Western Dancing Trip";
		trip13.type = "Dancing";
		trip13.cardDir = 4;
		trip13.selectLanguage = 4;
		trip13.review = 1;
		trip13.animals = true;
		trip13.insurence = true;
		trip13.pickUp = true;
		trip13.length = 3;
		trip13.addInfo = 13;
		trip13.accessibility = true;
		trip13.price = 3;

		Inventory.addToInventory(trip13);

		Trip trip14 = new Trip();

		
		trip14.name = "A Walk Through Viðey";
		trip14.type = "Walking";
		trip14.cardDir = 4;
		trip14.selectLanguage = 5;
		trip14.review = 1;
		trip14.animals = false;
		trip14.insurence = true;
		trip14.pickUp = false;
		trip14.length = 2;
		trip14.addInfo = 14;
		trip14.accessibility = false;
		trip14.price = 1;

	    Inventory.addToInventory(trip14);

	    Trip trip15 = new Trip();

	    trip15.name = "Landmannalaugar and Hjálparfoss";
		trip15.type = "Geothermal Pool";
		trip15.cardDir = 3;
		trip15.selectLanguage = 6;
		trip15.review = 1;
		trip15.animals = false;
		trip15.insurence = false;
		trip15.pickUp = true;
		trip15.length = 4;
		trip15.addInfo = 15;
		trip15.accessibility = false;
		trip15.price = 3;

	    Inventory.addToInventory(trip15);

	    Trip trip16 = new Trip();

	  
	    trip16.name = "Meet the Puffins and Hike";
		trip16.type = "Hiking";
		trip16.cardDir = 2;
		trip16.selectLanguage = 3;
		trip16.review = 1;
		trip16.animals = false;
		trip16.insurence = false;
		trip16.pickUp = false;
		trip16.length = 2;
		trip16.addInfo = 16;
		trip16.accessibility = false;
		trip16.price = 1;

	    Inventory.addToInventory(trip16);

	    Trip trip17 = new Trip();

	    trip17.name = "Goðafoss, Dimmuborgir and Mývatns Nature Baths";
		trip17.type = "Touring";
		trip17.cardDir = 1;
		trip17.selectLanguage = 3;
		trip17.review = 1;
		trip17.animals = false;
		trip17.insurence = false;
		trip17.pickUp = true;
		trip17.length = 6;
		trip17.addInfo = 17;
		trip17.accessibility = false;
		trip17.price = 5;

	    Inventory.addToInventory(trip17);

	    Trip trip18 = new Trip();

	
	    trip18.name = "Jökulsárlón";
		trip18.type = "Touring";
		trip18.cardDir = 3;
		trip18.selectLanguage = 7;
		trip18.review = 1;
		trip18.animals = false;
		trip18.insurence = true;
		trip18.pickUp = false;
		trip18.length = 5;
		trip18.addInfo = 18;
		trip18.accessibility = false;
		trip18.price = 5;

	    Inventory.addToInventory(trip18);

	    Trip trip19 = new Trip();

	    
	    trip19.name = "Snæfellsnes Peninsula";
		trip19.type = "Touring";
		trip19.cardDir = 4;
		trip19.selectLanguage = 2;
		trip19.review = 1;
		trip19.animals = true;
		trip19.insurence = false;
		trip19.pickUp = true;
		trip19.length = 6;
		trip19.addInfo = 19;
		trip19.accessibility = false;
		trip19.price = 4;

	    Inventory.addToInventory(trip19);

	    Trip trip20 = new Trip();


	    trip20.name = "Inside the Volcano";
		trip20.type = "Mountain";
		trip20.cardDir = 3;
		trip20.selectLanguage = 7;
		trip20.review = 4;
		trip20.animals = false;
		trip20.insurence = true;
		trip20.pickUp = false;
		trip20.length = 3;
		trip20.addInfo = 20;
		trip20.accessibility = false;
		trip20.price = 9;

	    Inventory.addToInventory(trip20);
	    */

	}

	public boolean getPropInfo( Object [] propquest){
		
		//Ef við miðum við það sem ég setti í TripProperties 
		//þá gætum við sótt allt í fylki og borið saman við fylkið sem var sent inn
		//Object[] properties = {animals, insurence, pickUp, accessibility, review, cardDir, selectLanguage, length, addInfo, price};
		Object[] properties = TripProperties.getInfo;
		
		if(!(propquest[0] = NULL || propquest[0] !^ properties[0] )) return false;

		if(!(propquest[1] = NULL || propquest[1] !^ properties[1] )) return false;
		
		if(!(propquest[2] = NULL || propquest[2] !^ properties[2] )) return false;

		if(!(propquest[3] = NULL || propquest[3] !^ properties[3] )) return false;

		if(!(propquest[4] = NULL || properties[4] = (int)(propquest[4]) )) return false;

		if(!(propquest[5] = NULL || properties[7] = (int)(propquest[5]) )) return false;
		
		if(!(propquest[6] = NULL || properties[9] = (int)(propquest[6]) )) return false;

		if(!(propquest[7] = NULL || properties[6] = (int)(propquest[7]) )) return false;

		if(!(propquest[8] = NULL || properties[5] = (int)(propquest[8]) )) return false;

		if(!(propquest[9] = NULL || properties[8] = (int)(propquest[9]) )) return false;
		
		return true;
		
	}
}