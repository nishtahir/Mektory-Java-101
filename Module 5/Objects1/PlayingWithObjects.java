public class PlayingWithObjects {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Voldermort";
		person1.job = "Evil wizard";
		person1.age = 100000000;
		person1.car = new Car();

		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.job);

		Person person2 = new Person();
		person2.name = "Harry";
		person2.job = "Hogwarts graduate";
		person2.age = 18;
		person2.pet = "White owl";
		person2.car = new Car();
		System.out.println(person2.toString());
		
//		Car c = new Car("Red", 2016, "AX234");
//		Person person3 = new Person("Bob", "Surgeon", c);
//		System.out.println(person3.toString());
		
		Person person3 = new Person("Bob", "Surgeon", new Car("Red", 2016, "AX234"));
		System.out.println(person3.toString());
		
		
		if (person2.isOver18() == true) {
			System.out.println("You can drive.");
		} else {
			System.out.println("Shouldn't you be in potions class?");
		}
		
		Car myCar = new Car();
		myCar.color = "Hot rod red";
		myCar.model = 1989;
		myCar.plateNumber = "I M IRONMAN";

		Car mySecondCar = new Car("Midnight Blue", 2015,
				"JAVA DUDE");
		System.out.println(mySecondCar.toString());
		
	}

}
