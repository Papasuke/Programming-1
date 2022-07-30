package app.model.users.db.fullname;

import app.lib.crud.read.ReadCol;
import app.model.validator.phonenumber.PhoneNumberValidator;

import java.util.ArrayList;

public class Model extends PhoneNumberValidator {
    public static ArrayList<String> getAllFullName(){
        String[] readFullName = ReadCol.readSpecificColumn(3, "users.txt", ",");
        ArrayList<String> checkFullName = new ArrayList<>();

        for(int i = 0; i < readFullName.length; i++){
            checkFullName.add(readFullName[i]);
        }

        return checkFullName;
    }
}