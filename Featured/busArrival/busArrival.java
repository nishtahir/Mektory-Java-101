package busArrival;

import java.text.DecimalFormat;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
*	Author - Liliia Oprysk
*/

public class busArrival {

	public static void main(String[] args) {
		
	//put timetable in here		
		NavigableMap<Double, String> map = new TreeMap<>();
	    map.put(11.07, "A");
	    map.put(11.23, "B");
	    map.put(11.38, "C");
	    map.put(11.53, "D");
	    map.put(12.10, "E");
	    map.put(12.27, "F");
	    map.put(12.43, "G");
	    map.put(12.58, "H");
	    map.put(13.14, "I");
	    map.put(13.24, "J");
	    map.put(13.35, "K");
	    map.put(13.46, "L");
	    map.put(13.58, "M");
	    map.put(14.10, "N");
	    map.put(14.22, "O");
	    map.put(14.34, "P");
	    map.put(14.44, "Q");
	    map.put(14.54, "R");
	    map.put(15.04, "S");
	    map.put(15.15, "T");
	    map.put(15.25, "U");
	    map.put(15.36, "V");
	    map.put(15.46, "W");
	    map.put(15.56, "X");
	    map.put(16.06, "Y");
	    map.put(16.16, "Z");
	    map.put(16.26, "a");
	    map.put(16.36, "b");
	    map.put(16.46, "c");
	    map.put(16.57, "d");
	    map.put(17.08, "e");
	    map.put(17.19, "f");
	    map.put(17.31, "g");
	    map.put(17.43, "h");

	    
	  System.out.println("Type time in format HH.MM ");
	  Scanner input = new Scanner(System.in);
	  	
	  double time = input.nextDouble();
	  		// got current time
	  	double value = (time + 0.15);
	  		// need at least 15 minutes to be at the bus stop, let's calculate from that time
	  	double above = map.ceilingKey(value);
	  		// finding the next time greater than value    
	  	double timeremaining = (above - time);
	  		// calculating time remaining
	  DecimalFormat df = new DecimalFormat("##"); 
	  		// just to get a nice format
	  
	  if (timeremaining < 0.40) {
		  	// it could be that suitable time from the table is within next hour (for example, we entered 14.59
		  	// next would be 14.59 + 0.15 = 14.74 and next time shown would be 15.04, which is wrong. how to 
		  	// mitigate that - see comment to the next section. bus goes every 10-15 minutes, so there can not be 
		  	// any legitimate remaining time greater than 30 (15 minutes that were assumed to getting to the stop
		  	// + max 15 minutes to the next bus. Thus, any remaining time that is less than 0.40 is OK. if it is 
		  	// greater than 0,4, it means time + 0.15 is greater than x.60, which is not possible on the clock
		  	// So this if statement is for legitimate timeremaining values 
		  double timeremainingfinal = (timeremaining * 100); 
		  	// finally, getting nice format in minutes
		System.out.println("Bus arrives at " + above + ", in " + df.format(timeremainingfinal) + " minutes"); }
	  else {
		double timenew = time  + 0.40;
			// to mitigate the problem of time + 0.15 being greater then x.60 (up to x.99), let's add 40
			// this is done for getting an accurate timeremaining value
		double valuenew = timenew + 0.15;
			// need 15 minutes to get to the stop, so should calculate from that time
		double abovenew = map.ceilingKey(valuenew);
			// getting closest value
		double timeremaining2 = (abovenew - timenew);
			// calculating remaining time
		double timeremainingfinal2 = (timeremaining2 * 100);
			// getting nice format 
		System.out.println("Bus arrives at " + abovenew + ", in " + df.format(timeremainingfinal2) + " minutes"); }
		
	  // tested to running OK so far :)
	  // first test case: enter 14.15
	  // next bus is at 14.22, but it is too early for 15 minutes rule. you get a right calculation - 
	  // 14.34, with 19 minutes remaining
	  // second test case: enter 14.59
	  // next bus is at 15.04, but it is too early for 15 minutes rule, despite it's within a  "new" hour
	  // you get a right calculation - 15.15 with 16 minutes remaining
	  
	  }
}


