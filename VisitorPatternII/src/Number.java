class Number implements Expression {
	int value;

	Number(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void accept(ExpressionVisitor visitor) {
		visitor.visit(this);
	}
}