import java.util.HashMap;

public class QueryBuilder {
    private Query query;

    public QueryBuilder setProperty(String name, String value) {
        if (name == "genre"){
            this.query.getProperties().put(name, Genre.findGenre(value));
            return this;
        }
        if (name == "release"){
            this.query.getProperties().put(name, Integer.parseInt(value));
            return this;
        }
        if (name == "time"){
            this.query.getProperties().put(name, Double.parseDouble(value));
            return this;
        }
        this.query.getProperties().put(name, value);
        return this;
    }

    public QueryBuilder setProperties(HashMap<String, Object> properties) {
        this.query.setProperties(properties);
        return this;
    }

    private void createNewQuery() {
        query = new Query();
    }

    QueryBuilder() {
        createNewQuery();
    }

    public Query build() {
        return query;
    }
}