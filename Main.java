import app.view.menu.Menu;
import app.view.order.product.Product;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
//        Menu menu = new Menu();
//        menu.setUp();
//        menu.run();

        Product product = new Product();
        product.view();
    }

}