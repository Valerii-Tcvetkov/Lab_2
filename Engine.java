import java.util.ArrayList;

public class Engine {
    private ArrayList<EngineObject> data;

    Engine() {
        data = new ArrayList<EngineObject>();
    }

    public Engine addEngineObject(EngineObject object) {
        this.data.add(object);
        return this;
    }

    public void load(ArrayList<EngineObject> list) {
        this.data.addAll(list);
    }

    public Engine find(Query query) {
        Engine engine = new Engine();
        for (EngineObject object : data) {
            if (query.matches(object)) engine.addEngineObject(object);
        }
        return engine;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}