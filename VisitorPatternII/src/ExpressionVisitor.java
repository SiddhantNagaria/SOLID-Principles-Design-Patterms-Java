public interface ExpressionVisitor {
	void visit(Number number);
	void visit(Addition addition);
	void visit(Multiplication multiplication);
}