package app.view.login;

import java.io.IOException;

public class Login{
    private String userName;
    private String password;

    public Login(){

    }

    public void view() throws IOException {
        System.out.println("\n===================================================================== Member Login Form =====================================================================");
        app.model.login.Model member = new app.model.login.Model();
        member.login();
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
