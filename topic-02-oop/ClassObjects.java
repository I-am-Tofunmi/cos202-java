public class ClassObjects{
    public static void main(String[] args) {
        // // state or field
        // private int gear = 5;

        // // behaviour or method
        // public void braking() {
        //     System.out.println("Working of Braking");
        // }

        // field of class
        int gear = 5;

        // method of class
        void braking() {
            ...
        }
    }
    // create object
    Bicycle sportsBicycle = new Bicycle();

    // access field and method
    sportsBicycle.gear;
    sportsBicycle.braking();
}