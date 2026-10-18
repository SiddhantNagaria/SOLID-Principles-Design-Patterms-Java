
public class VisitorPatternExpressionDemo {

    public static void main(String[] args) {
        // Represents: (5 + 3) * 2
        Expression expr = new Multiplication(
                new Addition(
                        new Number(5),
                        new Number(3)
                ),
                new Number(2)
        );

        Evaluator evaluator = new Evaluator();
        expr.accept(evaluator);

        System.out.println("Result: " + evaluator.getResult()); // Output: 16
    }
}