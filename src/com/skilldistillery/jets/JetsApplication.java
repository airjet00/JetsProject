package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.Scanner;

public class JetsApplication {

	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();

		ja.run();
	}

	public void run() {
		// display menu test
		AirField af = new AirField();
		//af.setAirField();
//		af.toString();
		
//		AirField af = new AirField("F-22", 100,200,300);
//		af.set();
		displayUserMenu();
		// af.runTest();
		//af.parkJets(jetContainer, jetInfo);
	}

	public JetsApplication() {

	}

	private void launch() {

	}

	private void displayUserMenu() {

		int userSelect = 0;
		while (userSelect != 9) {
			System.out.println("Enter your number seclection");
			System.out.println();
			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range ");
			System.out.println("5. Load all Cargo Jets ");
			System.out.println("6. Dogfight! ");
			System.out.println("7. Add a jet to Fleet ");
			System.out.println("8. Remove a jet from Fleet ");
			System.out.println("9. Quit");
			System.out.println();
			
			userSelect = kb.nextInt();
			AirField af = new AirField();
			JetImpl impl;
			FighterJet fj;  //for adding fj
			//JetImpl jetImpl = new JetImpl();
			switch(userSelect) {
			case 1:	af.setAirField();
					System.out.println(af.toString());
					System.out.println();
					break;
			case 2: 
				
				for (String jet : af.getJets()) {
					String [] jetInfo = jet.split(", ");
					impl = new JetImpl(jetInfo[0], Double.parseDouble(jetInfo[1]), 
							Integer.parseInt(jetInfo[2]), Long.parseLong(jetInfo[3]));
						System.out.println(jetInfo[1]);
			}
				break;
			case 3: af.fastestJet();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9: System.out.println("Goodbye");
				break;

			}
			
		}
	}
}