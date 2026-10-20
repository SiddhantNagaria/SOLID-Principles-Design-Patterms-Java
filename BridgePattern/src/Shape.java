// abstraction
public abstract class Shape {

    protected Renderer renderer;    //the bridge

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    abstract void draw();
}
