package com.skilldistillery.jets;

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
		af.toString();
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
			userSelect = kb.nextInt();
		}
	}
}