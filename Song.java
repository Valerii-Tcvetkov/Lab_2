public class Song extends EngineObject {
    public void setName(String name) {
        this.properties.setProperty("name", name);
    }

    public void setLength(String time) {
        double length = Double.parseDouble(time);
        this.properties.setProperty("time", length);
    }

    public void setSinger(String singer) {
        this.properties.setProperty("singer", singer);
    }

    public void setReleaseDate(String year) {
        int date = Integer.parseInt(year);
        this.properties.setProperty("release", date);
    }
}