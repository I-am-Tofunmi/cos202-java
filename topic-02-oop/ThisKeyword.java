// class Main {
//     int instVar;

//     Main(int instVar){
//         this.instVar = instVar;
//         System.out.println("this reference = " + this);
//     }

//     public static void main(String[] args) {
//         Main obj = new Main(8);
//         System.out.println("object reference = " + obj);
//     }
// }

class ThisExample {
    // declare variables
    int x;
    int y;

    ThisExample(int x, int y) {
        // assign values of variables inside constructor
        this.x = x;
        this.y = y;

        // value of x and y before calling add()
        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    void add(ThisExample o){
        o.x += 2;
        o.y += 2;
    }
}

class ThisKeyword {
    public static void main( String[] args) {
        ThisExample obj = new ThisExample(1, -2);
    }
}