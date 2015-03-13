public class ForLoops {
	/*
	* For loops work just like while loops, but with everything
	* you need to manage the loop all in one place
	*/
	public static void main(String[] args) {
		// i = i + 1 can be written as i++
		// i = i - 1 can be written as i--

		for( int i = 0; i < 100; i--){
			if(i % 2 == 0){
				System.out.println(i + " - even");
			} else {
				System.out.println(i + " - odd");
			}
		}

	}
}
