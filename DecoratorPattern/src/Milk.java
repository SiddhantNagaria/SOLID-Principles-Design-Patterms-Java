public class Milk extends  BeverageDecorator{

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "milk ";
    }
}
