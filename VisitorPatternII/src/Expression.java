public interface Expression {
	void accept(ExpressionVisitor visitor);
}