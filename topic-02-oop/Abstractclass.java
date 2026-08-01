// abstract class Language {
    
//     // method of abstract class
//     public void display() {
//         System.out.println("This is Java Programming");
//     }
// }

// class Abstractclass extends Language {

//     public static void main(String[] args) {

//         // create an object of Main
//         Main obj = new Main();

//         // access method of abstract class
//         // using object of Main class
//         obj.display();
//     }
// }

// Implementing Abstract Methods
abstract class Animal {
    abstract void makeSound();

    public void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {

    // provide implementation of abstract method
    public void makeSound() {
        System.out.println("Bark bark");
    }
}

class Abstractclass {
    public static void main(String[] args) {

        // create an object of Dog class
        Dog d1 = new Dog();

        d1.makeSound();
        d1.eat();
    }
}