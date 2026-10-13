public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {

        // "design smell"
        if (factory.equals("ELECTRIC"))
            return new ElectricCarFactory();
        else if (factory.equals("PETROL"))
            return new PetrolCarFactory();

        return null;
    }
}
