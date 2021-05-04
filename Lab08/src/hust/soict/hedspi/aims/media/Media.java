package hust.soict.hedspi.aims.media;

import java.util.Objects;

public abstract class Media implements Comparable{
    protected String id;
    protected String title;
    protected String category;
    protected float cost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media() {

    }

    public Media(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Media(String id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    abstract void printInfo();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return Objects.equals(id, media.id);
    }


    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        String objectTitle = null;
        if(o instanceof Media) {
            objectTitle = ((Media) o).getTitle();
        }
        return this.title.compareTo(objectTitle);
    }
}
