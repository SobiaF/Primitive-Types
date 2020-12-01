package learningjava;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 123;
        short shortValue = 4567;
        int intValue = 101;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
    }
}
