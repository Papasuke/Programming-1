package app.view.users.phonenumber.register;

import app.implement.input.InputTypeString;
import app.model.validator.phonenumber.PhoneNumberValidator;

import java.util.Scanner;

public class PhoneNumber implements InputTypeString{
    @Override
    public String input() {
        PhoneNumberValidator data = new PhoneNumberValidator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Phone-number: ");
        String phoneNumber = sc.nextLine();

        while(!data.isValid(phoneNumber)){
            System.out.println("Invalid phone-number, try again !!!!");
            System.out.print("Phone-number: ");
            phoneNumber = sc.nextLine();
        }
        return phoneNumber;
    }
}
