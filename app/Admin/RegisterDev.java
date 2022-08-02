package app.Admin;

import app.lib.counting.Counting;
import app.lib.crud.read.ReadSpecificColumn;
import app.lib.hashing.Hashing;
import app.lib.time.DateAndTime;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RegisterDev {
    private String devId;
    private String Password;
    private static int id = Counting.getCount();

    public RegisterDev() {
    }

    ;

    public RegisterDev(String devId, String Password) {
        this.devId = devId;
        this.Password = Password;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = Hashing.hashing(password);
    }

    public void registerDev() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("admin.txt"));
        int lines = 0;
        while (reader.readLine() != null) {
            if (lines == 0) {
                Counting.increment(id);
                lines++;
            } else {
                Counting.increment(id);
            }
            lines++;
        }
    }

    public void writeLine() throws IOException {
        try {
            ArrayList<String> devId = new ArrayList<>();
            ArrayList<String> db = new ArrayList<>();
            FileWriter txtFile = new FileWriter("admin.txt", true);

            db.add(this.toString());

            String[] data = ReadSpecificColumn.readSpecificColumn(1, "admin.txt", ",");

            for (int i = 0; i < data.length; i++) {
                devId.add(data[i]);
            }
            for (int i = 0; i < db.size(); i++) {
                // Check the duplicated of userName
                if (!devId.contains(this.getDevId())) {
                    txtFile.append(String.valueOf(db.get(i)));
                    txtFile.append("\n");
                }
            }
            txtFile.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public String toString(){
        return  ++id + "," +
                this.getDevId() + "," +
                this.getPassword() + "," +
                new DateAndTime().getDateAndTime();
    }
}




