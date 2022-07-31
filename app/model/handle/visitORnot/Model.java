package app.model.handle.visitORnot;

import app.implement.helper.Handle;
import app.view.menu.Menu;

import java.io.IOException;

public class Model implements Handle {
    @Override
    public void handle(String option) throws IOException, InterruptedException {
        Menu menu = new Menu();
        switch (option) {
            case "1" -> {
                menu.setUp();
                menu.run();
            }
            case "2" -> {
                System.out.println("Thank you so much for using our system. See you soon !!!!");
                System.exit(1);
            }
            default -> {
                System.out.println("There is no match option, please enter again");
                new app.view.notification.KeepVisiting().view();
                new app.view.notification.KeepVisiting().run();
            }
        }
    }
}
