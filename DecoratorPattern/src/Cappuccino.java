public class Cappuccino extends BeverageDecorator {

    public Cappuccino(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 7;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Cappuccino ";
    }

}