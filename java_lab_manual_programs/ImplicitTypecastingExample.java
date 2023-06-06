public class d {
    public static void main(String[] args) {
        byte b = 10;
        short s = b; // byte implicitly cast to short
        int i = s; // short implicitly cast to int
        long l = i; // int implicitly cast to long
        float f = l; // long implicitly cast to float
        double d = f; // float implicitly cast to double

        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
    }
}