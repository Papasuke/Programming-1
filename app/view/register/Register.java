package app.view.register;

import app.lib.hashing.Hashing;
import java.io.IOException;

public class Register {
    public enum MembershipCategories{
        Silver,
        Gold,
        Platinum;
    }
    private String userName;
    private String password;
    private String fullName;
    private String phoneNumber;

    private static final int id = 0;

    public Register() {

    }

    /** This method is to view the register form after receiving the result from model*/
    public void view() throws IOException {
        System.out.println("===================================================================== User Registration Form =====================================================================");
        app.model.register.Model user = new app.model.register.Model();
        user.register();
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


}
