
public class Car {
	
	String color;
	int model;
	String plateNumber;
	
	/*
	*	This is a constructor for the car object
	*	A constructor with empty () are sometimes refered
	*	to as the default constructor
	*/	
	public Car(){
		System.out.println("Car constructor");
	}
	
	/*
	*	Here we specify a constructor that takes in parameters
	*/
	public Car(String mColor, int mModel,
			String mPlateNumber){
		color = mColor;
		model = mModel;
		plateNumber = mPlateNumber;
		
		//We could do other things here that are required to make
		//the objects useful
	}
	
	/*
	*	Methods that help make our lives easier
	*/
	public boolean isRegistered(){
		if(plateNumber != null && plateNumber != ""){
			return true;
		}else{
			return false;
		}
	}

	/*
	*	toString is a nice convinient method of 
	*	printing out all of the content of the method
	*/
	public String toString(){
		return "Color: " + color 
				+ ", Model: " + model
				+ ", PlateNo: " + plateNumber;
	}
}
