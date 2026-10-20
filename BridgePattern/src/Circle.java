// refined abstraction
public class Circle extends Shape {

    public Circle(Renderer r) {
        super(r);
    }

    @Override
    void draw() {
        this.renderer.render("CIRCLE");
    }
}
