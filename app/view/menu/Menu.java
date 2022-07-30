package app.view.menu;

import app.api.API;
import app.model.handle.menu.Model;
import app.view.option.Option;
import java.io.IOException;

public class Menu extends API{
    public void setUp() {
        System.out.println("\n===================================================================== WELCOME TO APPLE STORE MANAGEMENT SYSTEM !!! =====================================================================");
        System.out.println("""
                    1. Register
                    2. Login
                    3. Exit""");
    }

    public String getOption() throws IOException {
        String option = new Option().input();

        return option;
    }

    public void run() throws IOException, InterruptedException {
        String request = this.getOption();
        this.sendRequest(request);
    }


    @Override
    protected void sendRequest(String request) throws IOException, InterruptedException {
        Model model = new Model();
        model.handle(request);
    }
}
