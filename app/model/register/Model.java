package app.model.register;

import app.lib.counting.Counting;
import app.lib.crud.create.CreateObj;
import app.lib.time.DateAndTime;
import app.lib.crud.read.ReadCol;
import app.lib.hashing.Hashing;
import app.implement.write.WriteFile;

import java.io.*;
import java.util.ArrayList;

public class Model extends CreateObj implements WriteFile{
    @Override
    protected void createObj() {
        app.view.users.username.register.UserName userName = new app.view.users.username.register.UserName();
        app.view.users.password.register.Password password = new app.view.users.password.register.Password();
        app.view.users.fullname.register.FullName fullName = new app.view.users.fullname.register.FullName();
        app.view.users.phonenumber.register.PhoneNumber phoneNumber = new app.view.users.phonenumber.register.PhoneNumber();

        this.setUserName(userName.input());
        this.setPassword(password.input());
        this.setFullName(fullName.input());
        this.setPhoneNumber(phoneNumber.input());
    }

    public enum MembershipCategories{
        Silver,
        Gold,
        Platinum;
    }
    private String userName;
    private String password;
    private String fullName;
    private String phoneNumber;
    private static int id = Counting.getCount();


    public Model() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = Hashing.hashing(password);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {this.fullName = fullName;}

    public String getPhoneNumber() {return phoneNumber;}

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void register() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
        int lines = 0;
        while (reader.readLine() != null){
            if(lines == 0){
                Counting.increment(id);
                lines++;
            }
            else{
                Counting.increment(id);
            }
            lines++;
        }
        reader.close();

        this.createObj();
        this.write();
    }

    @Override
    public void write(){
        try {
            /*
             * @param userName: to check the duplicate userName because userName is only unique */
            ArrayList<String> userName = new ArrayList<>();
            ArrayList<String> db = new ArrayList<>();
            FileWriter csvFile = new FileWriter("users.txt", true);

            db.add(this.toString());

            String[] data = ReadCol.readSpecificColumn(1, "users.txt", ",");

            for(int i = 0; i < data.length; i++){
                userName.add(data[i]);
            }
            for(int i = 0; i < db.size(); i++){
                // Check the duplicated of userName
                if(!userName.contains(this.getUserName())){
                    csvFile.append(String.valueOf(db.get(i)));
                    csvFile.append("\n");
                }
            }
            csvFile.close();
        }catch (Exception e){
            e.getStackTrace();
        }
    }

    @Override
    public String toString() {
        return  ++id + "," +
                this.getUserName() + "," +
                this.getPassword() + "," +
                this.getFullName() + "," +
                this.getPhoneNumber() + "," +
                new DateAndTime().getDateAndTime();
    }

}
