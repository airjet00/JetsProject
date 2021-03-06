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

	
	private String [] jets = new String[4];
	
	//set alljets with list of all avail jets. 
	private ArrayList<String> allJets = new ArrayList<>(readJetsFromFile("jets.txt"));

	public ArrayList<String> getJets() {
		//System.out.println(allJets);
		return allJets;
	}

	public void setJets(String [] jets) {
		this.jets = jets;
	}
	
	public void fastestJet() {
		int fastestSpeed = 0;
		String fastestJet = "";
		for(int idx = 0; idx < allJets.size(); idx++) {
			String []idxJet = allJets.get(idx).split(", ");
			
			if(Integer.parseInt(idxJet[1]) > fastestSpeed) {
				fastestSpeed = Integer.parseInt(idxJet[1]);
				fastestJet = "Fastest Jet: " +idxJet[0] + ", Speed: " + idxJet[1] +" mph, "
						 +"Range: "+ idxJet[2] + " mi, Price: $" + idxJet[3] +" million.\n";
			}
		}System.out.println(fastestJet);
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
		//System.out.println(names);
		return names;
	}
	public void setAirField() {
		int idx = 0;
		for (String list : allJets) {
			jets[idx]= list;
		}
	}
	//This will print all jets 
	public String toString() {
		String airFieldJets="";
		for(int idx = 0; idx < allJets.size(); idx++) {
			String []idxJet = allJets.get(idx).split(", ");
			airFieldJets += ""+ (idx+1) +". AirField Jets: " +idxJet[0] + ", Speed: " + idxJet[1] +" mph, "
							 +"Range: "+ idxJet[2] + " mi, Price: $" + idxJet[3] +" million.\n";
		}
		
		return airFieldJets;
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
//
//	public String setModel(Collection<List<String>> allJets) {
//		String model = "";
//		for (List<String> list : allJets) {
//			model = list.get(0);
//		}
//		
//		return model;
//	}

//
//	
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
