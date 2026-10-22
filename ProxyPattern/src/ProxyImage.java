public class ProxyImage implements Image {

    private final String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("Proxy image: Displaying " + filename);

        if (realImage == null) {
            realImage = new RealImage(filename);               // lazy creation, first call only
            System.out.println("Created new real image");
        } else {
            System.out.println("Using existing real image");
        }

        realImage.display();                                    // always delegate
        System.out.println("Proxy image: logging " + filename);
    }
}