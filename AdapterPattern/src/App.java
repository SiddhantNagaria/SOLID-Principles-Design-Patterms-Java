import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {


        Vehicle bus = new Bus();
        Vehicle car = new Car();
        Vehicle bicycle = new BicycleAdapter(new Bicycle());

        bus.accelerate();
        car.accelerate();
        bicycle.accelerate();
    }
}
