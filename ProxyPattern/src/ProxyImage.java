public class ProxyImage implements Image {

    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("Proxy image: Displaying " + filename);
        if (realImage == null) {
            realImage = new RealImage(filename);
            System.out.println("created new real image");
        } else {
            System.out.println("using proxy as real image already created");
            realImage.display();
            System.out.println("Proxy image: logging " + realImage);
        }
    }


}
