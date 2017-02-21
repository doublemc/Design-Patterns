package structural.proxy;

/**
 * Created by michal on 21.02.17.
 *
 * http://www.oodesign.com/proxy-pattern.html
 */
public class ProxyMain {
    public static void main(String[] args) {
        // using proxy to get object of RealImage class
        Image image = new ProxyImage("pic10mb001.jpg");

        // image will be loaded from disk
        image.display();

        System.out.println();

        // image will not be loaded from disk thus saving us time
        image.display();
    }
}
