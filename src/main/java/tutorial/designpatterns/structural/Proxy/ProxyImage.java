package tutorial.designpatterns.structural.Proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename); // Încărcăm imaginea doar la prima afișare
        }
        realImage.display();
    }
}
