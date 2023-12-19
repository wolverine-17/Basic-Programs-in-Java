package Wrapper;

public class WrapperExample {
    public static void main(String[] args) {
        // Using Integer wrapper class
        Integer intWrapper = Integer.valueOf(42);
        int intValue = intWrapper.intValue();
        System.out.println("Primitive int value: " + intValue);

        // Using Double wrapper class
        Double doubleWrapper = Double.valueOf(3.14);
        double doubleValue = doubleWrapper.doubleValue();
        System.out.println("Primitive double value: " + doubleValue);
    }
}
