public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        System.out.println("real image: file loading: " + filename);
        this.filename = filename;
    }


    @Override
    public void display() {
        System.out.println("real image: file loading: " + filename);
    }
}
