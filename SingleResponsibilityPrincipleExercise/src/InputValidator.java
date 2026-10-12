
public class InputValidator {

    public boolean isValid(String input) {
        try {
            int num = Integer.parseInt(input);
            return num >= 0 && num <= 10;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
