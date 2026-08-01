// // class Animal {

// //     // method in the superclass
// //     public void eat() {
// //         System.out.println("I can eat");
// //     }
// // }

// // // Dog inherits Animal
// // class Dog extends Animal {

// //     // overriding the eat() method
// //     @Override
// //     public void eat() {
// //         System.out.println("I eat dog food");
// //     }

// //     // new method in subclass
// //     public void bark() {
// //         System.out.println("I can bark");
// //     }
// // }

// // class MethodOver {
// //     public static void main(String[] args) {

// //         // create an object of the subclass
// //         Dog labrador = new Dog();

// //         // call the eat() method
// //         labrador.eat();
// //         labrador.bark();
// //     }
// // }

// // Protected Members in Inheritance
// class Animal {
//     protected String name;

//     protected void display() {
//         System.out.println("I am an animal.")
//     }
// }

// class Dog extends Animal {

//     public void getInfo() {
//         System.out.println("My name is " + name);
//     }
// }

// class MethodOver {
//     public static void main(String[] args) {

//         // create an object of the subclass
//         Dog labrador = new Dog();

//         // access protected field and method
//         // using the object of subclass
//         labrador.name = "Rocky";
//         labrador.display();

//         labrador.getInfo();
//     }
// }

class Animal {
    public void displayInfo() {
        System.out.println("I am an Animal.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

class MethodOver {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}