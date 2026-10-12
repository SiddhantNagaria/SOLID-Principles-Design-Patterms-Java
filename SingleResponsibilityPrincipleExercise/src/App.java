
import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        InputService inputService = new InputService();
        NumberSorter numberSorter = new NumberSorter();
        NumberDisplay numberDisplay = new NumberDisplay();

        List<Integer> nums = inputService.getInputFromUser();

        numberSorter.sort(nums);

        numberDisplay.show(nums);
    }
}
