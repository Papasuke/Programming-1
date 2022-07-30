package app.view.users.username.register;

import app.implement.input.InputTypeString;
import app.model.users.db.username.Model;
import app.model.validator.username.UserNameValidator;

import java.util.ArrayList;
import java.util.Scanner;

public class UserName implements InputTypeString{
    @Override
    public String input() {
        UserNameValidator data = new UserNameValidator();
        ArrayList<String> userNameDB = Model.getAllUserName();
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String userName = sc.nextLine();

        while(!data.isValid(userName) || userNameDB.contains(userName)){
            System.out.println("This username is already exist or invalid username, try again !!!!");
            System.out.print("Username: ");
            userName = sc.nextLine();
        }
        return userName;
    }
}