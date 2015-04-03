
public class Person {

	String name;
	String job;
	int age;
	String pet;
	Car car;
	
	/*
	*	This is a constructor. It's called whenever
	*	the object is created. We use it to perform tasks
	*	that we need to do in order to make the object useful
	*/	
	public Person() {
		
	}

	/*
	*	You can pass parameters to a constructor. But only 
	*	one constructor can be called at a time.
	*/	
	public Person(String name, String job, 
			Car car){
		this.name = name;
		this.job = job;
		this.car = car;
	}

	/*
	*	Objects can have methods. Add methods that are relevant
	*	to the object to help make your life a little easier.
	*
	*	This method returns true if the person is over 18
	*/
	public boolean isOver18(){
		// This is the ternary operator
		// it's kind of like a short hand for
		// the if statement 
		return (age >= 18) ? true : false;
	
		/*
		* 	The expression above is the same as
		* 	writting 
		*
		*	if(age >= 18){
		*		return true;
		*	} else {
		*		return false;
		*	}
		*/
	}
	
	/*
	*	This method is a nice convenience method to help print all
	*	the values of all the fields in this class.
	*/
	public String toString(){
		String value = "Name: " + name + ", Job: "
				+ job + ", Age: " + age
				+ ", Pet: " + pet + ", Car: " + car.toString();
		return value;
	}
}
