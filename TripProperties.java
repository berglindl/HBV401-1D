public class TripProperties extends Trip{

	private boolean animals;
	private boolean insurence;
	private boolean pickUp;
	private boolean accessibility;

	//example of mock object? 
	public int dangerReview(int mockReview){
		mockReview = 2;
	}

	//cardDir decides which of those cardinal directions are chosen
	//cardDir = 1 means North, cardDir = 2 means East, ...
	public String location(String cardDirString){
		int cardDir;
		switch(cardDir){
			case 1: cardDirString = "Norður";
					break;
			case 2: cardDirString = "Austur";
					break;
			case 3: cardDirString = "Suður";
					break;
			case 4: cardDirString = "Vestur";
					break;
		}
	}

	//Mögulega hafa þetta sett upp svona líka?
	public String language(String selectLanguageString){
		int selectLanguage;
		switch(selectLanguage){
			case 1: selectLanguageString = "ISL";
					break;
			case 2: selectLanguageString = "ENG";
					break;
			case 3: selectLanguageString = "CHI";
					break;
			//má bæta við fleiri af vild
		}
	}

	//Mock object því þetta tengist booking, right?
	//For now returns a random number between 1 and 50
	public int numSeats(int seat){
		int min = 0;
		int max = 50;
		seat = Math.random() * (max - min) + min
		if(seat == 0){
			System.out.println("Booking is full! Try another date.");
		}
		else{
			System.out.println("Booking successful, enjoy your trip!");
		}
	}

	//The length of the trip - length determines what case is used
	//while the value of num determines the outcome
	public int tripLength(int length){
		int num = 0;
		switch(length){
			case 1: num = 4;
					break;
			case 2: num = 7;
					break;
			case 3: num = 10;
					break;
		}
	}

	//Gæti verið að við þurfum að breyta þessum klasa því hann er frekar ljótur 
	//en hann á allaveganna að virka svona þannig að ... 
	public String additionalInfo(String addInfoString){
		int addInfo;
		switch(addInfo){
			//Trip Into the Glacier
			case 1: addInfoString = "We start by hiking on Falljökull glacier tongue and from there we explore the cave and a nearby ice tunnel. The tour is highly dependent on the cave's condition, so it must be treated with the utmost care and respect. " + "Clothing suggestion: Warm and waterproof jacket and pants, hiking boots, headwear and gloves.";
					break;
			//Trip Skíðaferð á Hrútafjallstinda
			case 2: addInfoString = "We start at Hafrafell nearby Svínafellsjökull and head up to the top of Hrútafjallstind where we put on our skiis and head down. This is a great sport that has been practiced since the country was settled. " + "Clothing suggestions: Warm and waterproof clothing.";
					break;
			//Trip Whale Watching in Húsavík
			case 3: addInfoString = "Join us on a day trip and meet the friendly giants of the sea in the breathtaking surroundings of Skálfjandflói Bay. Included is a three hour boat tour. " + "Clothing suggestions: Warm and waterproof clothing.";
					break;
			//Trip Söguferð um Miðbæinn
			case 4: addInfoString = "Join us in a walk through Reykjavík downtown where the participants will be informed about the long history of the city and other exciting information. If you seek knowledge and love to travel, this is the trip for you! " + "Clothing suggestions: Warm clothing and good walking shoes.";
					break;
			//Trip Northern Lights Explorer	
			case 5: addInfoString = "A super jeep tour where we leave the lights of the city behind and head into the darkness for an adventure. On the search for the Northern Lights, we might travel through some of Iceland's most spectacular sights without knowing, but the guide will be sure to let you know! " + "Clothing suggestions: Warm outwear.";
					break;
		}
	}

	//Mock object ?? 
	//For now only shows three dates, first, second and third of may. 
	public String tripDate(String dateString){
		int date;
		switch(date){
			case 1: dateString = "01.05";
					break;
			case 2: dateString = "02.05";
					break;
			case 3: dateString = "03.05";
					break;
		}
	}

	//Potential mock object? Just returns a random number between min and max
	public int tripPrice(int price){
		int min = 5000;
		int max = 25000;
		//returns a random number between 5000 and 25000
		price = (Math.random() * (max - min) + min);
	}

	//setja override? 
	public void getInfo(){
		//pseudocode um hvernig ég hef hugsað að hægt sé að útfæra þetta:
		//ef x-ferð
		//þá er animals = true
		//...
		//þá er cardDir == 2 og skila cardDirString
		//...

	}
}
