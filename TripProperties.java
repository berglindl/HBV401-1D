public class TripProperties extends Trip{

	private boolean animals;
	private boolean insurence;
	private boolean pickUp;
	private boolean accessibility;


	//Þetta er bara í rauninni bara öðruvísi leið til að nota if-statements
	//er basically það sama og gera if(review = 1){dangerNum == 1}
	public int dangerReview(int review){
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
	public String location(int cardDir){
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

	//Mögulega hafa þetta sett upp svona líka?
	public String language(int selectLanguage){
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

	//Ég legg til að við annað hvort tökum út þennan klasa og sjáum um sætin bara í BookingInventory
	//Þ.e tengjum ferðirnar þar við
	//Eða sjáum um það hér
	//Það er eflaust betra að sjá bara um þetta í BookingInventory. 
	/*
	public int numSeats(int seat){
		int min = 0;
		int max = 50;
		seat = Math.random() * (max - min) + min;
		if(seat == 0){
			System.out.println("Booking is full! Try another date.");
		}
		else{
			System.out.println("Booking successful, enjoy your trip!");
		}
		return seat;
	}
	*/

	//The length of the trip - length determines what case is used
	//while the value of num determines the outcome
	public int tripLength(int tLength){
		int num = 0;
		switch(tLength){
			//Spurning að setja þetta svona upp?
			case 1: num = 2 + " hours";
					break;
			case 2: num = 4 + " hours";
					break;
			case 3: num = 5 + " hours";
					break;
			case 4: num = 7 + " hours";
					break;
			case 5: num = 8 + " hours";
					break;
			case 6: num = 9 + " hours";
					break;
			case 7: num = 10 + " hours";
					break;
			case 8: num = 12 + " hours";
					break;
		}
		return num;
	}

	//Orðinn aðeins meira fallegri svona
	//Það er spurning hvort að það sé í raun ekki bara einfaldast að hafa klasann svona settann upp
	//Og hafa þá bara auka copy í SQL database-inum
	//Ásamt öllum öðrum upplýsingum
	//Nema það sé ekkert mál að tengja upplýsingarnar yfir, þá er mögulega betra að gera það þannig
	//But for now... 
	public String additionalInfo(int addInfo){
		String addInfoString;
		switch(addInfo){
			//Trip Into the Glacier
			case 1: addInfoString = "We start by hiking on Falljökull glacier tongue and from there we explore the cave and a nearby ice tunnel. 
									The tour is highly dependent on the cave's condition, so it must be treated with the utmost care and respect. " 
									+ "Clothing suggestion: Warm and waterproof outwear.";
					break;
			//Trip Skíðaferð á Hrútafjallstinda
			//Skiing on Hrútafjallstindur
			case 2: addInfoString = "We start at Hafrafell nearby Svínafellsjökull and head up to the top of Hrútafjallstindur where we put on our skiis and head down. 
									This is a great sport that has been practiced since the country was settled. " 
									+ "Clothing suggestion: Warm and waterproof outwear.";
					break;
			//Trip Whale Watching in Húsavík
			case 3: addInfoString = "Join us on a day trip and meet the friendly giants of the sea in the breathtaking surroundings of Skálfjandflói Bay. 
									Included is a three hour boat tour. " + "Clothing suggestion: Warm and waterproof outwear.";
					break;
			//Trip Söguferð um Miðbæinn
			//History Walk Through Downtown
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
		    //Trip Papeyjarferðir
		    //A Trip to Papey Islands
		    case 9: addInfoString = "A day trip from Djúpivogur to Papey. We sail around the area and watch the birds and the seals that reside nearby.
		    						After that, we stop by on the island where we walk along with a guide. "
		    						+ "Clothing suggestion: Warm and waterproof outwear.";
		    		break;
		    //Trip Hellaferð við Ingólfsfjall
		    //The Caves in Ingólfsfjall
		    case 10: addInfoString = "Join us on a search for the ancient treasure in the caves of the mountain Ingólfsfjall. This trip is perfect for adventurers! "
		    						+ "Clothing suggestion: Warm outdoor clothing and good hiking shoes.";
		    		break;
		    //Trip Á Gönguskíðum við Langanes
		    //Skiing through Langanes
		    case 11: addInfoString = "Join us on a skiing trip at Langanes where you will be educated about the secrets of Langanes and the exciting facts about its capital, Þórshöfn.
		    						The participants must have all equipment beforehand, but will be picked up by super jeeps and driven to Langanes. "
		    						+ "Clothing suggestion: Warm and waterproof outdoor clothing. ";
		    		break;
		    //Trip Grásleppur, Hvalir og Kynjaverur
		    //Whale Watching in Breiðafjörður
		    case 12: addInfoString = "The boat Nói will take up to Breiðafjörður where we will look at various dwellers of the sea. If we're lucky, participants might have the chance
		    						to feast upon whale meat from a freshly hunted whale. "
		    						+ "Clothing suggestion: Warm and waterproof outwear. ";
		    		break;
		    //Trip Vestfirsk dansferð
		    //Western Dancing Trip
		    case 13: addInfoString = "A bus will drive the participants to Ísafjörður where the participants have the option to dance with one another. 
		    						This trip is perfect for those who wish to meet new people and to show off their dancing skills! "
		    						+ "Clothing suggestion: Comfortable clothing that will allow you to bust a move!";
		    		break;
		    //Trip Spennuganga um Viðey
		    //A Walk Through Viðey
		    case 14: addInfoString = "Meet us on the island Viðey where we go on an exciting walk through the island where we try to solve the mystery of the lost elves
		    						and the hidden people who are said to be the islands former residents. "
		    						+ "Clothing suggestion: Warm and waterproof outwear. ";
		    		break;
		}
		return addInfoString;
	}


	//Hér geymum við Price :)
	
	//Hafa þetta eins sett upp og hitt?
	//Bara svona general case, má velja það sem manni finnst eiga við við hvaða ferð
	public int tripPrice(int price){
		int priceAmount;
		switch(price){
			case 1: priceAmount = 9900 + " ISK";
					break;
			case 2: priceAmount = 11900 + " ISK";
					break;
			case 3: priceAmount = 13900 + " ISK";
					break;
			case 4: priceAmount = 15900 + " ISK";
					break;
			case 5: priceAmount = 18900 + " ISK";
					break;
			case 6: priceAmount = 22900 + " ISK";
					break;
			case 7: priceAmount = 29900 + " ISK";
					break;
			case 8: priceAmount = 39900 + " ISK";
					break;
			case 9: priceAmount = 49900 + " ISK";
					break;
			case 10: priceAmount = 59900 + " ISK";
					break;
		}
		return priceAmount;
	}

	public void getInfo(Object[] trip1, trip2, trip3, trip4, trip5, trip6, trip7, trip8, trip9, trip10, trip11, trip12, trip13, trip14){
		//gefa switch hlutunum gildi hér?
		//initializeTrip ætti að sækja upplýsingar hér
		//og search ætti að sækja upplýsingar í initializeTrip

		//Into the Glacier
		if(trip1){
			this.cardDir = 3;
			this.selectLanguage = 1;
			this.review = 2;
			this.animals = false;
			this.insurence = true;
			this.pickUp = false;
			this.tLength = 2;
			this.addInfo = 1;
			this.accessibility = false;
			this.price = 5;
		}
		//Setti restina af ferðunum inn, kannski ekki það fallegasta en virkar :)

		// Skíðaferð á Hrútafjallstinda
		if(trip2){
			this.cardDir = 2;
			this.selectLanguage = 5;
			this.review = 5;
			this.animals = false;
			this.insurence = true;
			this.pickUp = false;
			this.tLength = 3;
			this.addInfo = 2;
			this.accessibility = false;
			this.price = 3;
		}
		//Whale Watching í Húsavík
			if(trip3){
			this.cardDir = 1;
			this.selectLanguage = 5;
			this.review = 1;
			this.animals = false;
			this.insurence = false;
			this.pickUp = false;
			this.tLength = 7;
			this.addInfo = 3;
			this.accessibility = false;
			this.price = 7;
		}
					
			//Trip Söguferð um Miðbæinn
			//History Walk Through Downtown
			if(trip4){
			this.cardDir = 4;
			this.selectLanguage = 2;
			this.review = 1;
			this.animals = true;
			this.insurence = false;
			this.pickUp = true;
			this.tLength = 2;
			this.addInfo = 4;
			this.accessibility = false;
			this.price = 1;
		}
			
			//Trip the Golden Circle and Snorkeling
			if(trip5){
			this.cardDir = 3;
			this.selectLanguage = 5;
			this.review = 2;
			this.animals = false;
			this.insurence = false;
			this.pickUp = true;
			this.tLength = 6;
			this.addInfo = 5;
			this.accessibility = false;
			this.price = 9;
		}
			//Trip Glacier Walking and Waterfalls
		    if(trip6){
			this.cardDir = 3;
			this.selectLanguage = 5;
			this.review = 1;
			this.animals = false;
			this.insurence = false;
			this.pickUp = true;
			this.tLength = 8;
			this.addInfo = 6;
			this.accessibility = false;
			this.price = 3;
		}
		    //Trip Northern Lights Explorer	
			if(trip7){
			this.cardDir = 3;
			this.selectLanguage = 5;
			this.review = 1;
			this.animals = false;
			this.insurence = false;
			this.pickUp = true;
			this.tLength = 2;
			this.addInfo = 7;
			this.accessibility = false;
			this.price = 1;
		}
		    //Trip Game of Thrones - Mývatn Mystery Magic
		    if(trip8){
			this.cardDir = 1;
			this.selectLanguage = 5;
			this.review = 1;
			this.animals = false;
			this.insurence = false;
			this.pickUp = true;
			this.tLength = 4;
			this.addInfo = 8;
			this.accessibility = false;
			this.price = 4;
		}
		    //Trip Papeyjarferðir
		    //A Trip to Papey Islands
		    if(trip9){
			this.cardDir = 2;
			this.selectLanguage = 1;
			this.review = 1;
			this.animals = true;
			this.insurence = false;
			this.pickUp = false;
			this.tLength = 2;
			this.addInfo = 9;
			this.accessibility = false;
			this.price = 5;
		}
		    //Trip Hellaferð við Ingólfsfjall
		    //The Caves in Ingólfsfjall
		    if(trip10){
			this.cardDir = 1;
			this.selectLanguage = 5;
			this.review = 2;
			this.animals = false;
			this.insurence = true;
			this.pickUp = true;
			this.tLength = 2;
			this.addInfo = 10;
			this.accessibility = false;
			this.price = 2;
		}
		    //Trip Á Gönguskíðum við Langanes
		    //Skiing through Langanes
		    if(trip11){
			this.cardDir = 2;
			this.selectLanguage = 2;
			this.review = 2;
			this.animals = true;
			this.insurence = true;
			this.pickUp = true;
			this.tLength = 4;
			this.addInfo = 11;
			this.accessibility = false;
			this.price = 6;
		}
		    //Trip Grásleppur, Hvalir og Kynjaverur
		    //Whale Watching in Breiðafjörður
		    if(trip12){
			this.cardDir = 4;
			this.selectLanguage = 7;
			this.review = 3;
			this.animals = true;
			this.insurence = true;
			this.pickUp = false;
			this.tLength = 5;
			this.addInfo = 12;
			this.accessibility = false;
			this.price = 8;
		}
		    //Trip Vestfirsk dansferð
		    //Western Dancing Trip
		    if(trip13){
			this.cardDir = 4;
			this.selectLanguage = 5;
			this.review = 1;
			this.animals = true;
			this.insurence = true;
			this.pickUp = true;
			this.tLength = 3;
			this.addInfo = 13;
			this.accessibility = false;
			this.price = 3;
		}
		    //Trip Spennuganga um Viðey
		    //A Walk Through Viðey
		    if(trip14){
			this.cardDir = 4;
			this.selectLanguage = 5;
			this.review = 1;
			this.animals = false;
			this.insurence = true;
			this.pickUp = false;
			this.tLength = 2;
			this.addInfo = 14;
			this.accessibility = false;
			this.price = 1;
		}

		//mögulega hægt að setja þetta upp þannig að við erum með ferðir trip1 - trip14
		//og síðan sækir initializeTrip þessar upplýsingar og setur það inn í array/lista
		//svo að ef við erum að leita af ferðum með review = 2
		//þá tjékkar initializeTrip á þessu og skilar lista af þeim ferðum?
		//eða myndi það vera í compare?? 
		//pælingar.. 
		
		//Dæmi sem gæti virkað sýnist mér fyrir getPropinfo í trip
		//Þá skilar þetta hreinlega upplýsingum úr hlutnum sem trip getur svo unnið úr 
		return Object[] a={animals,insurence,pickUp,accessibility};

		//hvernig væri hægt að skila hinum hlutunum yfir? 
		//þ.e þeim hlutum sem eru ekki boolean gildi?
		
		
		//Best væri að fá inn í fylkið prímitiv gildi eins og int boolean, strengi o.s.frv.

		//þannig sem switch virkar er að þetta er í raun þæginlegri leið til að gera fullt af if setningum
		//t.d switch(price) case 1 case 2 etc etc er það sama og segja if(price == 1) then priceAmount = 9900 + " ISK", if(price == 2) then priceAmount = 11900 + " ISK"
		//það sem þarf að gera til að fá rétta útkomu er að gefa price gildi sem samræmist case-inu.
		//þannig að ef price = 2, þá skilum við priceAmount og fáum út 11900 + " ISK"
		
		//hvar geymum við int price?

		//það er einmitt spurningin. public int tripPrice(int price) tekur það inn þarna, og ef við útfærum ferðirnar eins og ég var byrjuð að gera fyrir ofan
		//þá væri hægt að gefa því gildi þar, þ.a hver ferð hefur mismunandi gildi á hlutum eins og price og addInfo o.s.frv eftir því sem á við
		//en það er spurning með getPropInfo hvernig við útfærum int gildin fyrir það. 
		//væri hægt að frumstilla þau sem private breytur, helduru að það myndi virka?
		//þ.a private static int price;

		//ef þetta er gert þannig að við erum bara með trip1 til trip14 þá ætti að vera hægt að skila þeim gildum
		//og svo festa þá niður í initializeTrip?
	}
}
