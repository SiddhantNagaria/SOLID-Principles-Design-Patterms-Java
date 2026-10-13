public class App {

    public static void main(String[] args) {

        DatabaseConnector.getInstance().connect();

        DatabaseConnector d1 = DatabaseConnector.getInstance();
        DatabaseConnector d2 = DatabaseConnector.getInstance();

        if (d1 == d2) {
            System.out.println("The DbConnector objects are same...");
        } else {
            System.out.println("both are different");
        }


        Database o1 = Database.INSTANCE;
        Database o2 = Database.INSTANCE;

        Database.INSTANCE.connect();

        if (o1 == o2) {
            System.out.println("The objects are the same...");
        } else {
            System.out.println("both are different");
        }
    }
}
