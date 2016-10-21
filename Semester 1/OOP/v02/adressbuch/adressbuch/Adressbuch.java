package adressbuch;

public class Adressbuch {

	// Author: 	DS
	// Text: 	this is not working. Commented out
	//Person p;

	//
	public static void main(String[] args) {
		
		// Author: 	DS
		// Text:	define Person on call of main()
		//			instancing it for each object
		Person p = new Person();
		p.eingabeVorname();
		p.eingabeNachname();
		p.eingabeStraße();
		p.eingabeHausNr();
		p.eingabePLZ();
		p.eingabeOrt();
		p.print();

	}

}
