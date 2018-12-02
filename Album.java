import java.util.ArrayList;

public class Album extends EngineObject {

    Album() {
        this.properties.setProperty("songs", new ArrayList<Song>());
    }

    public void addSong(Song song) {
        ((ArrayList<Song>) this.properties.getProperties().get("songs")).add(song);
    }

    public void setAuthor(String author) {
        this.properties.setProperty("author", author);
    }

    public void setName(String name) {
        this.properties.setProperty("name", name);
    }

    public void setReleaseDate(String year) {
        int date = Integer.parseInt(year);
        this.properties.setProperty("release", date);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}