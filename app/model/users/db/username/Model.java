package app.model.users.db.username;

import app.lib.crud.read.ReadSpecificColumn;

import java.util.ArrayList;

public class Model {
    public static ArrayList<String> getAllUserName(){
        String[] readUserName = ReadSpecificColumn.readSpecificColumn(1, "users.txt", ",");
        ArrayList<String> checkUserName = new ArrayList<>();

        for(int i = 0; i < readUserName.length; i++){
            checkUserName.add(readUserName[i]);
        }

        return checkUserName;
    }
}
