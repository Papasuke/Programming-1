package app.view.users.username.login;

import app.implement.input.InputTypeString;
import app.model.users.db.username.Model;
import app.model.validator.username.UserNameValidator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserName implements InputTypeString{
    private String userName;

    @Override
    public String input() throws IOException {
        UserNameValidator data = new UserNameValidator();
        ArrayList<String> userNameDB = Model.getAllUserName();
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String userName = sc.nextLine();

        while(!data.isValid(userName) || !userNameDB.contains(userName)){
            System.out.println("The username does not exist, please sign up !!!!");
            app.view.register.Register form = new app.view.register.Register();
            form.view();
        }
        this.setUserName(userName);
        return userName;
    }

    public UserName() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
