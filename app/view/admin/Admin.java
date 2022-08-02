package app.view.admin;

import app.implement.input.InputTypeString;
import app.model.admin.db.Model;
import app.model.validator.username.UserNameValidator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin implements InputTypeString {
    private String devId;
    @Override
    public String input() throws IOException {
        UserNameValidator data = new UserNameValidator();
        ArrayList<String> devIdDB = Model.getAllDevId();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Developing department ID: ");

        String devId = sc.nextLine();
        while(!data.isValid(devId) || !devIdDB.contains(devId)){
            System.out.println("The Developing ID does not exist, please sign up !!!!");
        }
        this.setDevId(devId);
        return devId;
    }
    public Admin() {
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }
}
