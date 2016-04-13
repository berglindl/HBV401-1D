import java.util.Scanner;

public class UserInterface
{

public static void main( String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Please choose desired operation");
	System.out.println("1.Search for daytrip");
	System.out.println("2.Reserve a daytrip");
	System.out.println("3.Look at reviews");
	System.out.println("Please enter 1,2 or 3.");
	int operation = sc.nextInt();
	if(operation==1)search();
	if(operation==2)reserve();
	if(operation==3)reviewlook();
}
}

public static void Search(){
	Scanner ssc = new Scanner(System.in);
	System.out.println("Searching for daytrips");
	System.out.println("Do you have a trip name to search for?");
	System.out.println("Please enter the name or only press ENTER else");
	String tripname = ssc.nextLine();
	if(tripname.length<1)tripname=null;
	System.out.println("Do you have a trip type to search for?");
	System.out.println("Please enter the type name or only press ENTER else");
	String triptype = ssc.nextLine();
	if(triptype.length<1)triptype=null;

	Object[] propinf = trippropsearch();

	Object[] results = TripInventory.search(tripname,tripname,propinf);

	if(results.length<1) System.out.println("No day trips were matched to your search criteria.");
	else System.out.println("Following day trips matched your criteria");
	for(int i = 0;i!=results.length;i++)System.out.println(results[i].getName());

}

public static Object[] TripPropSearch(){
	Scanner trsc = new Scanner(System.in);
	System.out.println("Please enter which part of Iceland you wish to go");
	System.out.println("Press 1 for North, 2 for East, 3 for South or 4 for West.");
	String location = trsc.nextLine();
	if(location.length<1)location=null;

	System.out.println("Please enter your language");
	System.out.println("Press 1 for Icelandic, 2 for English or 3 for Chinese."); //ENG:english,CHI:chinese,ISL:Icelandic
	String language = trsc.nextLine();
	if(language.length<1)language=null;

	System.out.println("Please the desired danger level ");
	System.out.println("on a scale of 1-5.");
	int danger = trsc.nextInt();

	System.out.println("Do you wish to allow pets on the trip?");
	System.out.println("Please enter True or False.");
	String anima = trsc.nextLine();
	boolean animals = new boolean;
	if(anima.equals("True"))animals==true;
	if(anima.equals("False"))animals==false;

	System.out.println("Do you wish to have insurence included on the trip?");
	System.out.println("Please enter True or False");
	String insurenc = trsc.nextLine();
	boolean insurence = new boolean;
	if(insurenc.equals("True")) insurence == true;
	if(insurenc.equals("False")) insurence == false;

	System.out.println("Do you wish for to be picked up at your hotel or nearby location?");
	System.out.println("Please enter True or False");
	String picku = trsc.nextLine();
	boolean pickUp = new boolean();
	if(picku.equals("True")) pickUp == true;
	if(picku.equals("False")) pickUp == false;

	System.out.println("Do you wish for the trip to be accessible for handicapped?");
	System.out.println("Please enter True or False");
	String accessibilit = trsc.nextLine();
	boolean accessibility = new boolean();
	if(accessibilit.equals("True")) accessibility == true;
	if(accessibilit.equals("False")) accessibility == false;
	
	//Hérna vantar restina á milli eins

	Object[] SearchProp = SearchPropSearch();


	return Object[] a={location,language,danger,animals,insurence, pickUp, accessibility,SearchProp};
}

public static Object[] SearchPropSearch();{



}