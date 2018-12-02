public class EngineObject {

    protected Properties properties = new Properties();

    protected Genre genre = new Genre();

    EngineObject() {
    }

    public void setGenre(String name){
        this.genre = new Genre().genres.findGenre(name);
    }

    @Override
    public String toString() {
        return this.properties.toString() + "genre=" + this.genre.name;
    }
}