package hust.soict.hedspi.garbage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {

    public static void main(String[] args) throws IOException {
        String str = "";
        FileReader file = null;
        long start = System.currentTimeMillis();

        try {
            file = new FileReader("/home/hoangminh/IdeaProjects/Lab5/src/hust/soict/hedspi/garbage/input.txt");
            int c;
            while((c = file.read()) != -1) {
                str = str + (char) c;
            }
        }
        finally {
            file.close();
        }
        System.out.println(str);
        System.out.println(System.currentTimeMillis() - start);


    }
}
