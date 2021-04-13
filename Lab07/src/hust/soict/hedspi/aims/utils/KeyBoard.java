package hust.soict.hedspi.aims.utils;

import java.util.Scanner;

public class KeyBoard {
    public static String getKeyBoard() {
        Scanner keyBoard = new Scanner(System.in);
        return keyBoard.next();
    }

    public static boolean isFloat(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
