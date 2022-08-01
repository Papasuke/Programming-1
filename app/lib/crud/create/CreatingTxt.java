package src.app.lib.crud.read;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatingTxt {
    public void creatingTxt() throws IOException {
        Scanner readFile = new Scanner(System.in);
        boolean success = false;

        System.out.println("Enter path of directory");
        String direct = readFile.nextLine();

        //Creating the path of txt file, if is not available
        File directory = new File(direct);
        if (directory.exists())
        { System.out.println("Directory already exists ...");
        }
        else {
            System.out.println("Directory is not available, creating now");
            success = directory.mkdir();
            if (success) {
                System.out.printf("Created new directory : %s%n", direct);
            }
            else {
                System.out.printf("Failed to create new directory: %s%n", direct);
            }
        }

        // Creating new file in Java, only if not exists
        System.out.println("Enter file name to be created ");
        String filename = readFile.nextLine();
        File txt = new File(filename);
        if (txt.exists()) {
            System.out.println("File already exists");
        }
        else {
            System.out.println("No file exists, creating now");
            success = txt.createNewFile();
            if (success) { System.out.printf("Created txt file: %s%n", txt);
            }
            else {
                System.out.printf("Failed to create txt file: %s%n", txt);
            }
        }
        readFile.close();
    }
}
