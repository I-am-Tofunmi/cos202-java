// class Animal {

//     // overridden method
//     public void display() {
//         System.out.println("I am an Animal");
//     }
// }

// class Dog extends Animal {

//     // overriding method
//     @Override
//     public void display() {
//         System.out.println("I am a dog")
//     }

//     public void printMessage() {
//         display();
//     }
// }

// class Super {
//     public static void main(String[] args) {
//         Dog dog1 = new Dog();
//         dog1.printMessage();
//     }
// }

// Access superclass Attribute
class Animal {
    protected String type="animal";
}

class Dog extends Animal {
    public String type="mammal";

    public void printType() {
        System.out.println("I am a " + type);
        System.out.println("I am an " + super.type);
    }
}

class Super {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.printType();
    }
}