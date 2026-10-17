public class App {

	public static void main(String[] args) {
		
		OperationManagerBAD manager = new OperationManagerBAD();
		manager.execute(new Multiplication(), 10, 5);

		OperationManager operationManager = new OperationManager();
		operationManager.setStrategy(new Addition());
		operationManager.execute(5,6);

		
	}
}
