package lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    protected static final float DEFAULT_LOAD_FACTOR = 0.75F;
    protected static final int DEFAULT_INITIAL_CAPACITY = 5000;
    private static final long serialVersionUID = -9179676638408888162L;
    private int maximumSize;

    public LruLinkedHashMap(int maximumSize) {
        this(5000, 0.75F, true, maximumSize);
    }

    public LruLinkedHashMap(int maximumSize, boolean accessOrder) {
        this(5000, 0.75F, accessOrder, maximumSize);
    }

    public LruLinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder, int maximumSize) {
        super(initialCapacity, loadFactor, accessOrder);
        this.maximumSize = maximumSize;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > this.maximumSize;
    }

    public static void main(String[] args){
        LruLinkedHashMap map = new LruLinkedHashMap(5);
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        map.put("5",5);
        map.put("3",3);
        map.put("6",6);
        map.get("2");
        map.put("1",1);
        System.out.println(map);
    }

}
