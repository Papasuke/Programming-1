package app.view.notification;

import app.api.API;
import app.implement.notification.Notification;
import app.view.option.Option;
import java.io.IOException;

public class KeepVisiting extends API implements Notification{
    @Override
    public void view() {
        System.out.println("\n===================================================================== Keep visiting or exit !!! =====================================================================");
        System.out.println("""
                    1. Visit
                    2. Exit""");
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
        app.model.handle.visitORnot.Model model = new  app.model.handle.visitORnot.Model();
        model.handle(request);
    }
}
