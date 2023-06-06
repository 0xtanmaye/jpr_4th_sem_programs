public class IntegerWrapperExample {
    public static void main(String[] args) {
        // parseInt() method
        String numberString = "123";
        int number = Integer.parseInt(numberString);
        System.out.println("Parsed integer value: " + number);

        // valueOf() method
        int value = 456;
        Integer integerObj = Integer.valueOf(value);
        System.out.println("Integer object value: " + integerObj);

        // compareTo() method
        Integer first = 123;
        Integer second = 456;
        int result = first.compareTo(second);
        System.out.println("Compare result: " + result);

        // toString() method
        Integer integer = 789;
        String string = integer.toString();
        System.out.println("Integer string: " + string);
    }
}
