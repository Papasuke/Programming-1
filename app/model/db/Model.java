package app.model.admin.db;

import app.lib.crud.read.ReadSpecificColumn;

import java.util.ArrayList;
    public class Model {
        public static ArrayList<String> getAllDevId(){
            String[] readUserName = ReadSpecificColumn.readSpecificColumn(1, "admin.txt", ",");
            ArrayList<String> checkDevId = new ArrayList<>();

            for(int i = 0; i < readUserName.length; i++){
                checkDevId.add(readUserName[i]);
            }
            return checkDevId;
        }
    }
