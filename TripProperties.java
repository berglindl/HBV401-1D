public class TripProperties extends Trip{

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



	public int dangerReview(){
		int dangerNum;
		switch(review){
			case 1: dangerNum = 1;
					break;
			case 2: dangerNum = 2;
					break;
			case 3: dangerNum = 3;
					break;
			case 4: dangerNum = 4;
					break;
			case 5: dangerNum = 5;
					break;
		}
		return dangerNum;
	}

	//cardDir decides which of those cardinal directions are chosen
	//cardDir = 1 means North, cardDir = 2 means East, ...
	public String location(){
		String cardDirString;
		switch(cardDir){
			case 1: cardDirString = "Norðurland";
					break;
			case 2: cardDirString = "Austurland";
					break;
			case 3: cardDirString = "Suðurland";
					break;
			case 4: cardDirString = "Vesturland";
					break;
		}
		return cardDirString;
	}

	public String language(){
		String selectLanguageString;
		switch(selectLanguage){
			case 1: selectLanguageString = "ISL";
					break;
			case 2: selectLanguageString = "ENG";
					break;
			case 3: selectLanguageString = "CHI";
					break;
			case 4: selectLanguageString = "ESP";
					break;
			//Getum leyst vandann um að velja tvö tungumál svona
			//Þurfum mögulega að breyta því vegna user interface, sjáum til hvernig þetta kemur út
			case 5: selectLanguageString = "ISL" + " ENG";
					break;
			case 6: selectLanguageString = "ENG" + " CHI";
					break;
			case 7: selectLanguageString = "ENG" + "SWE" + "FRE";
					break;
			//má bæta við fleiri af vild
		}
		return selectLanguageString;
	}

	//The length of the trip - length determines what case is used
	//while the value of num determines the outcome
	public int tripLength(){
		int num;
		switch(length){
			//Spurning að setja þetta svona upp?
			// já er það ekki
			case 1: num = 2;
					break;
			case 2: num = 4;
					break;
			case 3: num = 5;
					break;
			case 4: num = 7;
					break;
			case 5: num = 8;
					break;
			case 6: num = 9;
					break;
			case 7: num = 10;
					break;
			case 8: num = 12;
					break;
		}
		return num;
	}

	//Orðinn aðeins meira fallegri svona
	//Það er spurning hvort að það sé í raun ekki bara einfaldast að hafa klasann svona settann upp
	public String additionalInfo(){
		String addInfoString;
		switch(addInfo){
			//Trip Into the Glacier
			case 1: addInfoString = "We start by hiking on Falljökull glacier tongue and from there we explore the cave and a nearby ice tunnel. 
									The tour is highly dependent on the cave's condition, so it must be treated with the utmost care and respect. " 
									+ "Clothing suggestion: Warm and waterproof outwear.";
					break;
			//Trip Skiing on Hrútafjallstindur
			case 2: addInfoString = "We start at Hafrafell nearby Svínafellsjökull and head up to the top of Hrútafjallstindur where we put on our skiis and head down. 
									This is a great sport that has been practiced since the country was settled. " 
									+ "Clothing suggestion: Warm and waterproof outwear.";
					break;
			//Trip Whale Watching in Húsavík
			case 3: addInfoString = "Join us on a day trip and meet the friendly giants of the sea in the breathtaking surroundings of Skálfjandflói Bay. 
									Included is a three hour boat tour. " 
									+ "Clothing suggestion: Warm and waterproof outwear.";
					break;
			//Trip History Walk Through Downtown
			case 4: addInfoString = "Join us in a walk through Reykjavík downtown where the participants will be informed about the rich history of the city 
									and other exciting information. If you seek knowledge and love to travel, this is the trip for you! " 
									+ "Clothing suggestion: Warm clothing and good walking shoes.";
					break;
			//Trip the Golden Circle and Snorkeling
			case 5: addInfoString = "First stop is at Þingvellir National Park, where diving will take place in the Silfra Fissure. 
									From there, we head to the Geysir hot spring, and then finally to the golden waterfall, Gullfoss. "
									+ "Clothing suggestion: Warm outdoor clothing, a change of clothing, and good hiking shoes.";
					break;
			//Trip Glacier Walking and Waterfalls
		    case 6: addInfoString = "An exciting tour along the south coast visiting all the major sites of the area and hiking on a glacier. 
		    						First stop is at Seljalandfoss waterfall, then to Sólheimajökull glacier, to Reynisfjara's black sand beach, to Skógafoss waterfall, 
		    						and with a view to Eyjafjallajökull and Hekla volcano. "
		    						+ "Clothing suggestion: Warm outdoor clothing and good hiking shoes.";
		    		break;
		    //Trip Northern Lights Explorer	
			case 7: addInfoString = "A super jeep tour where we leave the lights of the city behind and head into the darkness for an adventure. 
									On the search for the Northern Lights, we might travel through some of Iceland's most spectacular sights without knowing, 
									but the guide will be sure to let you know! " + "Clothing suggestion: Warm outwear.";
					break;
		    //Trip Game of Thrones - Mývatn Mystery Magic
		    case 8: addInfoString = "Join us on a tour to magical Lake Mývatn and the filming sites of the latest Game of Thrones series, with a pitstop to the Mývatn Nature Baths. "
		    						+ "Clothing suggestion: Warm outdoor clothing.";
		    		break;
		    //Trip A Trip to Papey Islands
		    case 9: addInfoString = "A day trip from Djúpivogur to Papey. We sail around the area and watch the birds and the seals that reside nearby.
		    						After that, we stop by on the island where we walk along with a guide. "
		    						+ "Clothing suggestion: Warm and waterproof outwear.";
		    		break;
		    //Trip The Caves in Ingólfsfjall
		    case 10: addInfoString = "Join us on a search for the ancient treasure in the caves of the mountain Ingólfsfjall. This trip is perfect for adventurers! "
		    						+ "Clothing suggestion: Warm outdoor clothing and good hiking shoes.";
		    		break;
		    //Trip Skiing through Langanes
		    case 11: addInfoString = "Join us on a skiing trip at Langanes where you will be educated about the secrets of Langanes and the exciting facts about its capital, Þórshöfn.
		    						The participants must have all equipment beforehand, but will be picked up by super jeeps and driven to Langanes. "
		    						+ "Clothing suggestion: Warm and waterproof outdoor clothing. ";
		    		break;
		    //Trip Grásleppur, Hvalir og Kynjaverur - Whale Watching in Breiðafjörður
		    case 12: addInfoString = "The boat Nói will take you up to Breiðafjörður where we will look at various dwellers of the sea. If we're lucky, participants might have the chance
		    						to feast upon whale meat from a freshly hunted whale. "
		    						+ "Clothing suggestion: Warm and waterproof outwear. ";
		    		break;
		    //Trip Western Dancing Trip
		    case 13: addInfoString = "A bus will drive the participants to Ísafjörður where the participants have the option to dance with one another. 
		    						This trip is perfect for those who wish to meet new people and to show off their dancing skills! "
		    						+ "Clothing suggestion: Comfortable clothing that will allow you to bust a move!";
		    		break;
		    //Trip Spennuganga um Viðey - A Walk Through Viðey
		    case 14: addInfoString = "Meet us on the Island Viðey where we go on an exciting walk through the island where we try to solve the mystery of the lost elves
		    						and the hidden people who are said to be the islands former residents. "
		    						+ "Clothing suggestion: Warm and waterproof outwear. ";
		    		break;
		    //Trip Landmannalaugar and Hjálparfoss
		    case 15: addInfoString = "Come and join us in this relaxing trip where we will start with a drive to Þjórsárdalur valley and look at Hjálparfoss waterfall. From there we will drive
		    						drive to Landmannalaugar, take a hike and soak ourselves in a relaxing geothermal pool."  
		    						+ "Clothing suggestion: Warm clothes, sturdy shoes, swimsuit & towel. ";
		    		break;
		    //Trip Meet the puffins and go fo a hike
		    case 16: addInfoString = "Come and join us on a hike on Borgarfjörður eystri, on of the best hiking places in Iceland. This trip offers 27 diffrent routes and one of the routes leads
		    						to a excellend bird watching facility where you can see puffins among other thing. ")  
		    						+ "Clothing suggestion: Warm clothes and sturdy shoes. ";
		    		break;
		    //Trip Goðafoss, Dimmuborgir and Mývatn Nature baths
		    case 17: addInfoString = "We set out from Akureyri to the twin waterfall Godafoss, and fom there we eill take a walking tour of Dimmuborgir but Dimmuborgir is a lava park with unique 
		    						rock formations. Then we will head for Myvatn Nature Baths for a relaxing, healing bath but Mývatns Nature Baths are known for their healing abilities. "  
		    						+ "Clothing suggestion: Warm clothes, sturdy shoes, swimsuit & towel. ";
		    		break;
		    //Trip Jöulsárlón
		    case 18: addInfoString = "Join us for a magical trip to Jökulsárlón, a lagoon with enormous and ancient icebergs breaking off from Vatnajökull. The lagoon appears in scenes 
		    						from Batman Begins, Tomb Raider and two James Bond movies. ";
									+ "Clothing suggestion: Warm and waterproof outwear. ";
					break;
			//Trip Snæfellsnes peninsula
		    case 19: addInfoString = "Come and see what Snæfellsnes has to offer. Join us as we visit Sæfellsjökull glacier, white and black sandy beaches, bird cliffs, spectacular mountains and volcanic craters, 
		    						and unique harbours in charming fishing villages. ";
									+ "Clothing suggestion: Warm and waterproof outwear. ";
					break;
			//Trip Inside the volcano
		    case 20: addInfoString = "Come join us on a hike to Þhríhnúkagígur volcano and enjoy the breathtaking scenery along the way. After walking for approximately 50 minutes we will reach the top of the mountain
		    						where visitors will be lowered inside the crater so they can look at the magma chamber. Please note that the age limit is 12. ";
									+ "Clothing suggestion: Warm, waterproof outwear and good shoes. ";
					break;

		}
		return addInfoString;
	}
	

	public int tripPrice(){
		int priceAmount;
		switch(price){
			case 1: priceAmount = 9900;
					break;
			case 2: priceAmount = 11900;
					break;
			case 3: priceAmount = 13900;
					break;
			case 4: priceAmount = 15900;
					break;
			case 5: priceAmount = 18900;
					break;
			case 6: priceAmount = 22900;
					break;
			case 7: priceAmount = 29900;
					break;
			case 8: priceAmount = 39900;
					break;
			case 9: priceAmount = 49900;
					break;
			case 10: priceAmount = 59900;
					break;
		}
		return priceAmount;
	}

	public void getInfo(){
		//Dæmi sem gæti virkað sýnist mér fyrir getPropinfo í trip
		//Þá skilar þetta hreinlega upplýsingum úr hlutnum sem trip getur svo unnið úr 
		return Object[] a = {animals, insurence, pickUp, accessibility, review, cardDir, selectLanguage, length, addInfo, price};
	}
}
