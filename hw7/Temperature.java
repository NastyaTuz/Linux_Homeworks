package hw7;

public class Temperature {
    public static void main(String[] args) {
        int temperature1 = 101;
        int temperature2 = 99;

        boolean isWorking = testDevice(temperature1, temperature2);
        System.out.println("Работает ли устройство ? " + isWorking);
    }

    public static boolean testDevice(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            return true;
        } else {
            return false;
        }
    }
}
