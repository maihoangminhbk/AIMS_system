package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.media.track.Track;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc() {

    }

    public CompactDisc(String artist) {
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if(tracks.contains(track)) return;
        tracks.add(track);
    }

    public void removeTrack(Track track) {
        if(tracks.contains(track)) {
            System.out.println("track existed");
            return;
        }
        tracks.remove(track);
    }

    public int getLength() {
        int length = 0;
        for(Track track : tracks) {
            length += track.getLength();
        }
        return length;
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "artist='" + artist + '\'' +
                ", tracks=" + tracks +
                ", length=" + length +
                ", director='" + director + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    void printInfo() {
        toString();
    }
    public void play() {
        for (Track track : tracks) {
            track.play();
        }
    }
}
