package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AirField {
	public AirField() {}

	
	private Jet [] jets = new Jet[4];
	
	//set alljets with list of all avail jets. 
	private ArrayList<String> allJets = new ArrayList<>(readJetsFromFile("jets.txt"));

	public Jet [] getJets() {
		return jets;
	}

	public void setJets(Jet [] jets) {
		this.jets = jets;
	}
	
	@Override
	public String toString() {
		return "AirField [allJets=" + allJets + "]";
	}

	//Read jets from file into collection
	private Collection<String> readJetsFromFile(String fileName) {

		BufferedReader reader = null;
		Collection<String> names = new ArrayList<>();
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = reader.readLine()) != null) {

				names.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println(names);
		return names;
	}
}
	// AirField af = new AirField();
//
//	// read jet info into array

//	public AirField(String model, double speed, int range, long price) { // no arg constructor
//		super(model, speed, range, price);
//
//	}
//
//	public void setAirField() {
//		Collection<String> jetInfo = readJetsFromFile("jets.txt");
//
//		Collection<List<String>> jetContainer = createAirField();
//
//		//complete airfield
//		Collection<List<String>> allJets = parkJets(jetContainer, jetInfo);
//		
//	}
//
//	public String setModel(Collection<List<String>> allJets) {
//		String model = "";
//		for (List<String> list : allJets) {
//			model = list.get(0);
//		}
//		
//		return model;
//	}
//	public String
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("AirField Model: ");
//		builder.append(getModel());
//		builder.append(", Speed: ");
//		builder.append(getSpeed());
//		builder.append(", Range: ");
//		builder.append(getRange());
//		builder.append(", Price: ");
//		builder.append(getPrice());
//		builder.append(", toString()=");
//		builder.append(super.toString());
//		builder.append("]");
//		return builder.toString();
//	}
//
//	public void getJet() {
//
//	}
//
//	// now we have our airfield, need jets.
//	// create method to populate airfield
//	public Collection<List<String>> parkJets(Collection<List<String>> jetContainer, Collection<String> jetInfo) {
//
//		// Need to add jets in jetInfo to either jetContainer
//		// or manipulate and set variable based on jetInfo
//		for (String string : jetInfo) {
//			ArrayList<String> tempInfo = new ArrayList<>();
//			tempInfo.toArray(string.split(", "));
//			jetContainer.add(tempInfo);
//		}
//		System.out.println(jetContainer);
//		return jetContainer;
//	}
//
//	private Set<List<String>> createAirField() {
//		Set<List<String>> jetMainifest = new HashSet<>();
//
//		// create airfield that can hold up to 10 different aircraft
//		for (int idx = 0; idx < 10; idx++) {
//			jetMainifest.add(new ArrayList<>());
//		}
//
//		return jetMainifest;
//	}
//
//	private Collection<String> readJetsFromFile(String fileName) {
//
//		BufferedReader reader = null;
//		Collection<String> names = new ArrayList<>();
//		try {
//			reader = new BufferedReader(new FileReader(fileName));
//			String line;
//			while ((line = reader.readLine()) != null) {
//
//				names.add(line);
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if (reader != null) {
//				try {
//					reader.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//		System.out.println(names);
//		return names;
//	}
//
//}
