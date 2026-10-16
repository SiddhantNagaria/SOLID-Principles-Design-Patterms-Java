package cloneable;

public class App {

    public static void main(String[] args) {

        Circle circle1 = new Circle();   // imagine this is expensive to create
        circle1.setWidth(20);
        circle1.setHeight(10);
        circle1.setColor("green");

        Circle circle2 = (Circle) circle1.clone();  // copy, no re-creation
        circle2.setColor("blue");                   // change only what differs

        System.out.println(circle1);  // Circle 20 10 green
        System.out.println(circle2);  // Circle 20 10 blue
    }
}