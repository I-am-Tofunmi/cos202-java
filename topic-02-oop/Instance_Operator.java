// class Main {

//     public static void main(String[] args) {

//         // create a variable of string type
//         String name = "Programiz";

//         // checks if name is instance of String
//         boolean result1 = name instanceof String;
//         System.out.println("name is an instance of String: " + result1);

//         // create an object of Main
//         Main obj = new Main();

//         // checks if obj is an instance of Main
//         boolean result2 = obj instanceof Main;
//         System.out.println("obj is an instance of Main: " + result2);
//     }
// }


// Java Program to check if an object of a class is also
// an instance of the interface implemented by the class


interface Animal {

}

class Dog implements Animal {

}

class Main {
    public static void main(String[] args) {

        // create an object of the Dog class
        Dog d1 = new Dog();

        // checks if the object of Dog
        // is also an istance of Animal
        System.out.println(d1 instanceof Animal);
    }
}