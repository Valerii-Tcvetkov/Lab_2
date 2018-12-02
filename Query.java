public class Query {

    public Properties properties = new Properties();
    public Genre genre;

    public boolean matches(EngineObject o) {
        for (Object i : this.properties.getProperties().keySet()) {
            if (!o.properties.getProperties().keySet().contains(i)) return false;
            if (!o.properties.getProperties().get(i).equals
                    ((this.properties.getProperties().get(i)))) return false;
        }
        if (this.genre != null) {
            if (o.genre != null) {
                if (!(this.genre.equals(o.genre) || o.genre.isDescendantOf(this.genre))) return false;
            } else return false;
        }
        return true;
    }
}