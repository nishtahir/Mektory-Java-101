public class Methods{
	//These are global or field variables
	//they are avaliable to all methods in
	//this class

	int num1 = 0;
	int num2 = 0;
	int result = 0;

	public static void main(String[] args) {
		//This is how you call a method
		add()
	}

	/*
	*	Methods are awesome. You can write code in them and use them over
	*	and over again. They help keep your code modular and easy to read.
	*	You can name them whatever you want and add any amount of code in them.
	*	
	*	A return type of void means the method will not give back an answer when called
	*/
	public static void add(){
		result = num1 + num2;
	}

	/*
	*	You can specify that a method will give back an answer when it's done
	*	int means that the answer is going to be an integer. You can return any kind of
	*	data type you know
	*/

	public static int sub(){
		return num2 - num1;
	}
}