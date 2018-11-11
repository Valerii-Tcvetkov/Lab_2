import com.sun.tools.javah.Gen;

import java.util.HashMap;

public class ComparableObject {

    private HashMap<String, Object> properties;

    ComparableObject() {
        properties = new HashMap<String, Object>();
    }

    public HashMap<String, Object> getProperties() {
        return properties;
    }

    public void setProperty(String key, Object value) {
        this.properties.put(key, value);
    }

    public void setProperties(HashMap<String, Object> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        for (String i : ((ComparableObject) o).getProperties().keySet()) {
            if (!this.getProperties().keySet().contains(i)) return false;
            if (i == "genre") {
                if (((Genre) ((ComparableObject) o).getProperties().get(i)).isDescendant(
                        (Genre) this.getProperties().get(i))) return true;
            }
            if (!this.getProperties().get(i).equals
                    (((ComparableObject) o).getProperties().get(i))) return false;
        }
        return true;
    }
}