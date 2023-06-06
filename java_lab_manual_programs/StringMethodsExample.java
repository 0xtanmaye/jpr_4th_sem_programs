public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // length method
        int length = str.length();
        System.out.println("Length of string: " + length);

        // charAt method
        char c = str.charAt(1);
        System.out.println("Character at index 1: " + c);

        // substring method
        String substr = str.substring(7);
        System.out.println("Substring from index 7: " + substr);

        // indexOf method
        int index = str.indexOf("World");
        System.out.println("Index of 'World': " + index);

        // replace method
        String replacedStr = str.replace("World", "Universe");
        System.out.println("Replaced string: " + replacedStr);

        // toLowerCase method
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lower case string: " + lowerCaseStr);

        // toUpperCase method
        String upperCaseStr = str.toUpperCase();
        System.out.println("Upper case string: " + upperCaseStr);

        // trim method
        String strWithWhitespace = "   Hello, World!   ";
        String trimmedStr = strWithWhitespace.trim();
        System.out.println("Trimmed string: " + trimmedStr);

        // startsWith method
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);

        // endsWith method
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWithWorld);

        // equals method
        String str2 = "Hello, World!";
        boolean isEqual = str.equals(str2);
        System.out.println("Strings are equal: " + isEqual);

        // compareTo method
        String str3 = "Goodbye!";
        int result = str.compareTo(str3);
        System.out.println("Compare result: " + result);
    }
}
