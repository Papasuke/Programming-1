package app.model.users.db.phonenumber;

import app.lib.crud.read.ReadSpecificColumn;
import app.model.validator.phonenumber.PhoneNumberValidator;

import java.util.ArrayList;

public class Model extends PhoneNumberValidator {

    private String phoneNumber;

    public static ArrayList<String> getAllPhoneNumber(){
        String[] readPhoneNumber = ReadSpecificColumn.readSpecificColumn(4, "users.txt", ",");
        ArrayList<String> checkPhoneNumber = new ArrayList<>();

        for(int i = 0; i < readPhoneNumber.length; i++){
            checkPhoneNumber.add(readPhoneNumber[i]);
        }

        return checkPhoneNumber;
    }

}
