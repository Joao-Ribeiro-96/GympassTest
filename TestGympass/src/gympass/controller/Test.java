package gympass.controller;
import gympass.model.*;
import java.io.*;

public class Test {

	public static void main(String[] args) {
		
		try{
		//read file
		FileInputStream fstream = new FileInputStream("race.log");

		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		// read log line by line 
		while ((strLine = br.readLine()) != null) {
		
		// save first 4 characters	
		String frow = strLine.substring(0,3);
		String[] array;
		int[] ids = new int[10];
		int[] hashCode = new int[10]; 
		
		// check if first line should be skipped
		if(frow.matches("Hora")){
			continue;
		}
		
		// if not, splits spaces into array
		else {
		array = strLine.split("\\s+");
		}
		// then, split the second column to determine name and id.
		String[] transfer = array[1].split("-");
		boolean found = false;
		for(int i = 0; i < ids.length;i++) {
			// looking for id already in array
			
			if(Integer.parseInt(transfer[0]) == ids[i]) {
				// add new lap
				System
				found = true;
			}
		}
			if(found == false) {
				for(int i = 0;i < ids.length;i++) {
				if(ids[i]==0) {
				ids[i] = Integer.parseInt(transfer[0]);
				// create a driver Object with specified attributes
				Driver driver = new Driver(Integer.parseInt(transfer[0]),transfer[1]);
				
				// saving the reference of new Object
				hashCode[i] = System.identityHashCode(driver);
				}
			}
		}
		
		
		
		}
		// end file input stream
		fstream.close();

		} catch (Exception e) {

		System.err.println("Error: " + e.getMessage());

		}
	}

}
