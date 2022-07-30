package app.view.users.password.register;

import app.implement.input.InputTypeString;
import app.model.validator.password.PasswordValidator;

import java.util.Scanner;

public class Password implements InputTypeString {
    @Override
    public String input() {
        PasswordValidator data = new PasswordValidator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Password: ");
        String password = sc.nextLine();

        while(!data.isValid(password)){
            System.out.println("Invalid password, try again !!!!");
            System.out.print("Password: ");
            password = sc.nextLine();
        }
        return password;
    }
}
