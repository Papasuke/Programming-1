package app.api;

import app.model.handle.menu.Model;
import java.io.IOException;

public abstract class API{
    protected abstract void sendRequest(String request) throws IOException, InterruptedException;
}
