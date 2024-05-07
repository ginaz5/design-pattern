package structural.proxy.exercise.image;

public class ProxyCacheDemo {
    public static void main(String[] args) {
        // Using the image proxy with caching
        Image proxyImage1 = new ImageProxy("sample_1.jpg");
        proxyImage1.display();
        printImageCache();

        System.out.println();

        // load another image
        Image proxyImage2 = new ImageProxy("sample_2.jpg");
        proxyImage2.display();
        printImageCache();

        System.out.println();

        // load the same image again
        System.out.println("===== Retrieved from cache =====");
        Image proxyImage3 = new ImageProxy("sample_1.jpg");
        proxyImage3.display();
    }

    static void printImageCache(){
        System.out.println("===== Cached Image =====");
        for (String key : ImageProxy.getImageCache().keySet()) {
            System.out.println(key);
        }
    }
}
