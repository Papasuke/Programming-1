package app.implement.helper;

import java.io.IOException;

public interface Handle {
    void handle(String option) throws IOException, InterruptedException;
}
