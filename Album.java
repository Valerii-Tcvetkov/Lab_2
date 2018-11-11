import java.util.ArrayList;

public class Album extends EngineObject {

    Album() {
        this.setProperty("songs", new ArrayList<Song>());
    }

    public void addSong(Song song){
        ((ArrayList)(this.getProperties().get("songs"))).add(song);
    }

    public void setAuthor(String author) {
        this.setProperty("author", author);
    }

    public void setName(String name) {
        this.setProperty("name", name);
    }

    public void setGenre(String value) {
        Genre genre = Genre.findGenre(value);
        this.setProperty("genre", genre);
    }

    public void setReleaseDate(String year) {
        int date = Integer.parseInt(year);
        this.setProperty("release", date);
    }
}