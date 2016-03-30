public class TripProperties extends Trip{

	private boolean animals;
	private boolean insurence;
	private boolean pickUp;
	private boolean accessibility;

	//example of mock object? 
	public int dangerReview(){
		return 2;
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
		return cardDirString;
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
		return selectLanguageString;
	}

	//Mock object því þetta tengist booking, right?
	public int numSeats(int seat){
		int min = 1;
		int max = 50;
		//returns a random number between 1 and 50
		return (Math.random() * (max - min) + min)
	}

	//setja override? 
	public void getInfo(){

	}
}