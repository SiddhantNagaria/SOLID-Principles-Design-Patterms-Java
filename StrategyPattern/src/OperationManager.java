// abstract layer in between the high level modules and the low level modules
public class OperationManager {

	// we have to use composition
	// BECAUSE THE BEHAVIOR CAN BE CHANGED AT RUN-TIME
	private Strategy strategy;

	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}

	public void execute(int n1, int n2){
		this.strategy.execute(n1, n2);
	}
}
