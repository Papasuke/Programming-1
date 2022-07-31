package app.api;

import java.io.IOException;

/** The role of 'API' class is to interact with request from users and
 * After that, API will send request of users to model */
public abstract class API{
    protected abstract void sendRequest(String request) throws IOException, InterruptedException;
}
