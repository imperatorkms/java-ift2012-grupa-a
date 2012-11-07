package collections;

public interface Map {

    Object get(Object key);
    void put(Object key, Object value);
    int size();
    void remove(Object key);
    Set keySet();
}
