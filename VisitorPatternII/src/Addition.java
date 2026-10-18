class Addition implements Expression {
	Expression left, right;

	Addition(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}

	public void accept(ExpressionVisitor visitor) {
		visitor.visit(this);
	}
}