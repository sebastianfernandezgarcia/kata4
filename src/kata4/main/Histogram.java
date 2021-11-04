package kata4.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


class Histogram<T> {
    private final Map<T, Integer> map = new HashMap<>();
    
    public Integer get(T key){
        return this.map.get(key);
    }
    public Set<T> KeySet(){
        return this.map.keySet();
    }

    public void increment(T key) {
        this.map.put(key, map.containsKey(key)?this.map.get(key) + 1: 1);
    }
    
}
