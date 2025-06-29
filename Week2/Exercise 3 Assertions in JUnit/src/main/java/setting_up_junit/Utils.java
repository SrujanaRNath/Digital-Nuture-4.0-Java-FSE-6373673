package setting_up_junit;

public class Utils {
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isEmpty(String input) {
        return input == null || input.isEmpty();
    }
}
