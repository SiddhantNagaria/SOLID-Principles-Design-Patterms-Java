class Evaluator implements ExpressionVisitor {
    int result;

    public int getResult() {
        return result;
    }

    public void visit(Number number) {
        result = number.getValue();
    }

    public void visit(Addition addition) {
        addition.getLeft().accept(this);
        int leftVal = result;
        addition.getRight().accept(this);
        int rightVal = result;
        result = leftVal + rightVal;
    }

    public void visit(Multiplication multiplication) {
        multiplication.getLeft().accept(this);
        int leftVal = result;
        multiplication.getRight().accept(this);
        int rightVal = result;
        result = leftVal * rightVal;
    }
}