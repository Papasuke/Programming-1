package app.model.login;

import app.lib.crud.read.ReadLine;
import app.lib.hashing.Hashing;
import app.view.users.username.login.UserName;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Model {
    private boolean isLogged = false;
    private String userName;
    private String password;
    public void login() throws IOException {
        UserName userName = new UserName();
        app.view.users.password.login.Password password = new app.view.users.password.login.Password();
        System.out.println("Login Status: "+ isLogged);
        if(verifyLogin(userName.input(), password.input(), "users.txt", ",")){
            ReadLine readLine = new ReadLine();
            String[] data = readLine.readSpecificLine(userName.getUserName(), 1, "users.txt", ",");
            System.out.println("\nUsername: " + data[1] + "\nFull name: " + data[3] + "\nPhone-number: " + data[4]);

            isLogged = true;
        }
        else{
            System.out.println("Wrong password, try again bro !!!!");
            new app.view.login.Login().view();
        }
        System.out.println("Login Status: " + isLogged);
    }
    public Model(){

    }
    public static boolean verifyLogin(String userName, String password, String filePath, String delimiter){
        String hashing = Hashing.hashing(password);
        String currentLine;
        String data[];
        try{
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            while((currentLine = br.readLine()) != null){
                data = currentLine.split(delimiter);
                if(data[1].equals(userName) && data[2].equals(hashing)){
                    return true;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
