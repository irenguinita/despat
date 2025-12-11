package Structural.Proxy;

public interface Image {
    void display();
}

public class RealImage implements Image {
    public RealImage(URL url) {
        loadImage(url);
    }
}
