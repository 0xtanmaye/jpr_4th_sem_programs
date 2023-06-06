class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class StringMatcher {
    public static void main(String[] args) {
        try {
            String input = "USA";
            if (!input.equals("India")) {
                throw new NoMatchException("Input string does not match 'India'");
            }
            System.out.println("Match found!");
        } catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }
    }
}