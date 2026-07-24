class Lamp {
        // stores the value for light
        // true if light is on
        // false if light is off
        boolean isOn;

        // method to turn on the light
        void turnOn() {
            isOn = true;
            System.out.println("Light on? " + isOn);
        }

        // method to turnoff the light
        void turnOff() {
            isOn = false;
            System.out.println("Light on? " + isOn);
        }
}

public class LampClassOb {
    public static void main(String[] args) {

        // create objects led and halogen
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        // turn on the light by
        // calling method turnOn()
        led.turnOn();

        // turn off the light by
        // calling method turnOff()
        halogen.turnOff():
    }
}