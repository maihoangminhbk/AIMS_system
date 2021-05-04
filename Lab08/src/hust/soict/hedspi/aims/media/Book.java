package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();
    public Book() {

    }

    public Book(String id, String title, String category, float cost, String author) {
        super(id, title, category, cost);
        this.authors.add(author);
    }






    public void addAthor(String authorName) {
        if(authorName == null) {
            return;
        }

        if(authors.contains(authorName)) {
            System.out.println("Authorize " + authorName + " exist" );
            return;
        }

        authors.add(authorName);
    }
    public void removeAuthor(String authorName) {
        if(authorName == null) {
            return;
        }

        if(!authors.contains(authorName)) {
            System.out.println("Author " + authorName + "not exist");
            return;
        }
        authors.remove(authorName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + authors +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }




    public void printInfo() {

        toString();
    }





}
