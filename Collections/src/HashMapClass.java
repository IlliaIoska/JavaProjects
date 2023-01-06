import java.util.Map;
import java.util.HashMap;
public class HashMapClass {
    private Map<String, String> map;

    public HashMapClass() {
        this.map = new HashMap<>();
        this.map.put("Jojo", "123");
    }

    public Map<String, String> getMap() {
        for (String key : this.map.keySet()) {
            System.out.println("Key = " + key);
            System.out.println("Value = " + this.map.get(key));
        }
        return map;
    }
}
