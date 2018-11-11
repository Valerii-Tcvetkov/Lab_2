public class EngineObject extends ComparableObject {
    EngineObject() {
    }

    @Override
    public String toString() {
        return this.getProperties().toString();
    }
}