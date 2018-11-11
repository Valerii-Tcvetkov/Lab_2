import java.util.ArrayList;

public class Playlist extends EngineObject {
    Playlist() {
        this.setProperty("songs", new ArrayList<Song>());
    }
}