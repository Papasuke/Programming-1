package app.model.handle.menu;

import app.implement.helper.Handle;
import app.view.login.Login;
import app.view.notification.KeepVisiting;
import app.view.register.Register;

import java.io.IOException;

public class Model implements Handle {
    @Override
    public void handle(String option) throws IOException, InterruptedException {
        Register user = new Register();
        Login member = new Login();
        switch (option) {
            case "1" -> {
                user.view();
                new KeepVisiting().view();
                new KeepVisiting().run();
            }
            case "2" -> member.view();
            case "3" -> {
                System.out.println("Thank you so much for using our system. See you soon !!!!");
                System.exit(1);
            }
            default -> {
                System.out.println("There is no match option, please enter again");
                new app.view.menu.Menu().run();
            }
        }
    }
}
