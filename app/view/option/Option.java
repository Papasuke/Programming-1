package app.view.option;

import app.implement.input.InputTypeString;

import java.util.Scanner;

public class Option implements InputTypeString {
    @Override
    public String input() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter the number to select an option:  ");
            String option = sc.nextLine();

            return option;
        }
    }
}
