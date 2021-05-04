package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestMediaCompareTo {
    public static void main(String []args) {
        Collection collection = new ArrayList();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc();
        DigitalVideoDisc dvd2 = new DigitalVideoDisc();
        DigitalVideoDisc dvd3 = new DigitalVideoDisc();
        dvd1.setTitle("Minh");
        dvd2.setTitle("A");
        dvd3.setTitle("Y");
        collection.add(dvd1);
        collection.add(dvd2);
        collection.add(dvd3);
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }
        Collections.sort((java.util.List)collection);
        iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
        }
    }
}
