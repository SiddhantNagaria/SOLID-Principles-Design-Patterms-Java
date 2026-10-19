public class App {

    public static void main(String[] args) {

        Beverage beverage = new Sugar(new Milk(new Milk(new Cappuccino(new PlainBeverage()))));
        System.out.println(beverage.getCost());
        System.out.println(beverage.getDescription());
        System.out.println(beverage);

    }
}
