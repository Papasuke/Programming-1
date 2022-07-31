package app.view.users.password.login;

import app.implement.input.InputTypeString;

import java.util.Scanner;

public class Password implements InputTypeString{
    private String password;

    @Override
    public String input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Password: ");
        String password = sc.nextLine();
        this.setPassword(password);
        return password;
    }

    public Password() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
