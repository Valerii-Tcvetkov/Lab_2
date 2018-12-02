public class QueryBuilder {
    private final Query query = new Query();

    public QueryBuilder setProperty(String name, String value) {
        if (name.equals("genre")){
            this.query.genre = new Genre().genres.findGenre(value);
            return this;
        }
        if (name == "release"){
            this.query.properties.setProperty(name, Integer.parseInt(value));
            return this;
        }
        if (name == "time"){
            this.query.properties.setProperty(name, Double.parseDouble(value));
            return this;
        }
        this.query.properties.setProperty(name, value);
        return this;
    }

    QueryBuilder() {
    }

    public Query build() {
        return query;
    }
}