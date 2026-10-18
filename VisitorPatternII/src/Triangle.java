public class Triangle implements Shape {

	@Override
	public void accept(Visitor visitor) {
		visitor.visitTriangle(this);
	}
}
