class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.")
    }
}

class Dog extends Animal {
    public void displayInfo() {
        super.displayInfo();
        System.out.println("I am a dog.");
    }
}

class SuperKeyword {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}