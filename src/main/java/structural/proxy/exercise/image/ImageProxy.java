package structural.proxy.exercise.image;

import java.util.HashMap;
import java.util.Map;

public class ImageProxy implements Image {
    private RealImage realImage;

    private final String fileName;

    private static final Map<String, RealImage> imageCache = new HashMap<>();

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    public static Map<String, RealImage> getImageCache() {
        return imageCache;
    }

    @Override
    public void display() {
        // check if the image is already cached
        if (imageCache.containsKey(fileName)) {
            realImage = imageCache.get(fileName);
        } else {
            // if not, create a new one and cache it
            realImage = new RealImage(fileName);
            imageCache.put(fileName, realImage);
        }
        // forward the display request to the real image object
        realImage.display();
    }
}
