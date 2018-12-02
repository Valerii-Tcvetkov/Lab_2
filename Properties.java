import java.util.HashMap;
import java.util.Map;

public class Properties {

    private final Map<String, Object> properties = new HashMap<String, Object>();

    Properties() {
    }

    public void setProperty(String key, Object value) {
        this.properties.put(key, value);
    }

    public HashMap getProperties() {
        HashMap temp = new HashMap<String, String>();
        temp.putAll(this.properties);
        return temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Properties that = (Properties) o;
        return this.properties.equals(that.properties);
    }

    @Override
    public String toString() {
        return this.properties.toString();
    }
}