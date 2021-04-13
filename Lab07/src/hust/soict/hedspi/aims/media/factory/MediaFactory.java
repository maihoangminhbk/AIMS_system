package hust.soict.hedspi.aims.media.factory;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.KeyBoard;
import hust.soict.hedspi.aims.utils.RandomId;

import java.awt.image.Kernel;

public class MediaFactory {
    public Media getItem(String itemName) {
        System.out.println("Input title:");
        String title = KeyBoard.getKeyBoard();
        System.out.println("Input category:");
        String category = KeyBoard.getKeyBoard();
        System.out.println("Input cost: (float value)");
        String cost = KeyBoard.getKeyBoard();
        while(!KeyBoard.isFloat(cost)) {
            System.out.println("Cost is float value, Input cost:");
            cost = KeyBoard.getKeyBoard();
        }
        Float costFloat = Float.parseFloat(cost);
        String id = RandomId.randomAlphaNumeric(6);

        switch (itemName) {
            case "book": {
                System.out.println("Input author:");
                String author = KeyBoard.getKeyBoard();

                return new Book(id, title, category, costFloat, author);
            }
            case "CD":{
                System.out.println("Input author:");
                String author = KeyBoard.getKeyBoard();

                return new CompactDisc();
            }
            case "DVD": {
                System.out.println("Input length:");
                String length = KeyBoard.getKeyBoard();
                while (!KeyBoard.isNumeric(length)) {
                    System.out.println("Length is numeric, Input length:");
                    length = KeyBoard.getKeyBoard();
                }
                int lengthInt = Integer.parseInt(length);

                System.out.println("Input director:");
                String director = KeyBoard.getKeyBoard();

                return new DigitalVideoDisc(id, title, category, costFloat, lengthInt, director);
            }
            default: {
                System.out.println("Item name wrong");
                return null;

            }
        }
    }
}
