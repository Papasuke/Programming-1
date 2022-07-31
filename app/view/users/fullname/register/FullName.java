package app.view.users.fullname.register;

import app.implement.input.InputTypeString;
import app.model.validator.fullname.FullNameValidator;

import java.util.Scanner;

public class FullName implements InputTypeString{
    @Override
    public String input() {
        FullNameValidator data = new FullNameValidator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Full name: ");
        String fullName = sc.nextLine();

        while(!data.isValid(fullName)){
            System.out.println("Invalid full name, try again !!!!");
            System.out.print("Full name: ");
            fullName = sc.nextLine();
        }
        return fullName;
    }
}
