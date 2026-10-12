
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputService {

    private static final int THRESHOLD = 5;

    public List<Integer> getInputFromUser() {
        List<Integer> nums = new ArrayList<>();

        System.out.println(
                "Enter 5 valid integers in the range [0, 10]"
        );

        try (Scanner scanner = new Scanner(System.in)) {
            while (nums.size() < THRESHOLD) {
                String input = scanner.nextLine();

                InputValidator validator = new InputValidator();

                if (!validator.isValid(input)) {
                    System.out.println(
                            "Invalid input. Enter an integer from 0 to 10."
                    );
                    continue;
                }

                nums.add(Integer.parseInt(input));
            }
        }

        return nums;
    }
}
