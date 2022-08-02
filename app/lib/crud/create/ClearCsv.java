package app.Admin;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ClearCsv {
    public void clearSpecFile(String filePath) throws IOException {
        File clearedFile = new File(filePath);
        PrintWriter writer = new PrintWriter(clearedFile);
        writer.print("");
        writer.close();
    }
}
