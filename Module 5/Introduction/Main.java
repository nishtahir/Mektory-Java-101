public class Main {

    public static void main(String[] args) {

        //Here we declare a variable using Fruit as our type.
        //Like anyother variable we give it a name, in this case myFruit
        //We instantiate a new Fruit and set it as the value
        Fruit myFruit = new Fruit();
        //We access properties in the fruit object using the . (dot) separator
        //This allows us to access variables in the Fruit class.
        myFruit.name = "Tomato";  // Tomatoes are actually fruits :)
        myFruit.color = "Red";

        //We can now print out values stored in the Object
        System.out.println(myFruit.name);

    }

}
