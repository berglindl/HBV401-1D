public class Booking{
	//...
	//Spurning að tengja bókun við ferðir hér?

	//Held við þurfum að setja hérna inn ýmisslegt
	/* Byrja á að birta lista yfir ferðir
	Síðan velja ferð, þ.e. eftir að búið er að kalla á listann yfir ferðir
	Hér er kallað á dagsetningaklasann og dagsetning sleginn inn

	Og það þarf einhvern kóða hér til að segja að sæti séu sjálfkrafa 20 hér
	og það þarf að vera tengt við ferðir og dagsetningu myndi ég halda

	Síðan kemur reserve klasinn í BookingInventory hér(kallað á hann);

	Hvað finnst ykkur, myndi það ekki virka ágætlega þannig og síðan myndi þetta bara vistast yfir í BookingList???
	*/

	//Jú, það hljómar bara vel :) 
	//Ætlum við að hafa lokagildið að það séu bara 20 sæti?

	private int numSeats = 20;
	//Gætum gert þetta svipað og við gerum í review

	Scanner userInput = new Scanner(System.in);
    {
        Scanner selectTrip = new Scanner(System.in);
        System.out.println("Select the trip you wish to book.");
        System.out.println("Please note that there are only 20 seats available for each trip.")
        System.out.println("Press 1 for the trip Into the Glacier,");
        System.out.println("Press 2 for the trip Skiing on Hrútafjallstindar,");
        System.out.println("Press 3 for the trip Whale Watching in Húsavík,");
        System.out.println("Press 4 for the trip History Walk Through Downtown,");
        System.out.println("Press 5 for the trip The Golden Circle and Snorkeling,");
        System.out.println("Press 6 for the trip Glacier Walking and Waterfalls,");
        System.out.println("Press 7 for the trip Northern Lights Explorer,");
        System.out.println("Press 8 for the trip Game of Thrones - Mývatn Mystery Magic,");
        System.out.println("Press 9 for the trip A Trip to Papey Islands,");
        System.out.println("Press 10 for the trip The Caves in Ingólfsfjall,");
        System.out.println("Press 11 for the trip Skiing Through Langanes,");
        System.out.println("Press 12 for the trip Whale Watching in Breiðafjörður,");
        System.out.println("Press 13 for the trip Western Dancing Trip,");
        System.out.println("Press 14 for the trip A Walk Through Viðey,");
        System.out.println("Press 15 for the trip Landmannalaugar and Hjálparfoss,");
        System.out.println("Press 16 for the trip Meet the Puffins and Hike,");
        System.out.println("Press 17 for the trip Goðafoss, Dimmuborgir and Mývatn Nature Baths,");
        System.out.println("Press 18 for the trip Jöulsárlón,");
        System.out.println("Press 19 for the trip Snæfellsnes Peninsula,");
        System.out.println("Press 20 for the trip Inside the Volcano.");

        tripNum = selectTrip.nextInt();
        switch(tripNum){
            //Þarf eflaust að breyta þessu þegar tengingin er komin nákvæmlega
            case 1: Trip[0]; //eða Trip[trip1]
                    break;
            case 2: Trip[1];
                    break;
            case 3: Trip[2];
                    break;
            case 4: Trip[3];
                    break;
            case 5: Trip[4];
                    break;
            case 6: Trip[5];
                    break;
            case 7: Trip[6];
                    break;
            case 8: Trip[7];
                    break;
            case 9: Trip[8];
                    break;
            case 10: Trip[9];
                    break;
            case 11: Trip[10];
                    break;
            case 12: Trip[11];
                    break;
            case 13: Trip[12];
                    break;
            case 14: Trip[13];
                    break;
            case 15: Trip[14];
                    break;
            case 16: Trip[15];
                    break;
            case 17: Trip[16];
                    break;
            case 18: Trip[17];
                    break;
            case 19: Trip[18];
                    break;
            case 20: Trip[19];
                    break;

            default: System.out.println("Oops! That trip is not listed. Please try again.");
        }
    }

}