public class Song extends EngineObject {
    public void setName(String name) {
        this.setProperty("name", name);
    }

    public void setLength(String time) {
        double length = Double.parseDouble(time);
        this.setProperty("time", length);
    }

    public void setSinger(String singer) {
        this.setProperty("singer", singer);
    }

    public void setReleaseDate(String year){
        int date = Integer.parseInt(year);
        this.setProperty("release", date);
    }

    public void setGenre(String value) {
        Genre genre = Genre.findGenre(value);
        this.setProperty("genre", genre);
    }
}