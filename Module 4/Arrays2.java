public class Arrays2{
	//You can declare an array by specifying the size;
	int[] myDynamicArray = new int[10];

	public static void main(String[] args) {
		//You can add content to the array by providing it with the index
		//where you want to store something. For example
		//	myDynamicArray[0] = 50;		

		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];
		
		for(int i = 0; i < numbers.length; i++){
			System.out.print("Type in a number: ");
			numbers[i] = input.nextInt();
		}
		
		// by the time we get here Our array is full of stuff
		// We are creating a variable here to hold whatever
		// we think the biggest number is
		int biggestNumber = 0;
		
		// For each loop to go through all the numbers in the 
		// array.
		for(int number : numbers){
			// if the number we are currently looking at in the 
			// for each loop is larger than what we think the biggest
			// number is, then we set biggestNumber to that number
			if(number > biggestNumber){
				biggestNumber = number;
			}
		}
		// print the result
		System.out.println("The biggest number is: " + biggestNumber);
	}
}