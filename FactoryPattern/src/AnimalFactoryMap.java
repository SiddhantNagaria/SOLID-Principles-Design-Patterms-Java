import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class AnimalFactoryMap {

    private static final Map<AnimalType, Supplier<Animal>> map = new HashMap<>();

    static {
        map.put(AnimalType.CAT,Cat::new);
        map.put(AnimalType.DOG,Dog::new);
        map.put(AnimalType.LION,Lion::new);
        map.put(AnimalType.TIGER,Tiger::new);
    }

    public static Animal getAnimal(AnimalType type){
        return map.get(type).get();
    }
}
