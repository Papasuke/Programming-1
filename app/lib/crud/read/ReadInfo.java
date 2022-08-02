package app.Admin;

import app.lib.crud.read.ReadAllLine;
import java.io.IOException;
import java.util.ArrayList;

public class ReadInfo {
    public void readInfo(String filePath) throws IOException {
        ReadAllLine line = new ReadAllLine();
        ArrayList<String[]> info = line.read(filePath);
        for (int row = 0; row < info.size(); row++){
            if (filePath.equals("users.txt")){
                System.out.println("\nUser Id: " + info.get(row)[0] + "\nUser Name: " + info.get(row)[1] + "\nPassword: " + info.get(row)[2]
                + "\nName: " + info.get(row)[3] + "\nPhone Number: " + info.get(row)[4]);
            }
            else if (filePath.equals("products.txt")){
                System.out.println("\nProduct Id: " + info.get(row)[0] + "\nDevice: " + info.get(row)[1] + "\nModel: " + info.get(row)[2]
                        + "\nPrice: " + info.get(row)[3]);
            }
        }
    }
}