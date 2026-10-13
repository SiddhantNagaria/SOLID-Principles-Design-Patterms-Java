public class DatabaseConnector {

    // eager version
    //private static DatabaseConnector INSTANCE = new DatabaseConnector();

    // lazy version
    private static DatabaseConnector INSTANCE;

    // we are not able to instantiate the class
    // "reflection attack"
    private DatabaseConnector() {
        if (INSTANCE != null) {
            throw new IllegalStateException(
                    "Instance already exists!"
            );
        }
    }

    public static DatabaseConnector getInstance() {
        //return INSTANCE;
        // we just instantiate the class if necessary
        // IF WE HAVE MULTIPLE THREADS???
        if (INSTANCE == null) {
            // this block can be entered by a single thread
            // PROBLEM: it is too slow (100x)
            synchronized (DatabaseConnector.class) {
                INSTANCE = new DatabaseConnector();
            }
        }

        return INSTANCE;
    }

    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting...");
    }
}
