package HashMaps;

import java.util.HashMap;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMapTest = new HashMap<String, String>();
        hashMapTest.put("Joe", "Basketball");
        hashMapTest.put("Jane", "Pickleball");
        hashMapTest.put("Jill", "Softball");
        Set<String> keySet = hashMapTest.keySet();
        for (String key : keySet) {
            System.out.println(key + ": " + hashMapTest.get(key));
        }
        hashMapTest.remove("Jane");
        keySet = hashMapTest.keySet();
        for (String key : keySet) {
            System.out.println(key + ": " + hashMapTest.get(key));
        }
    }
}
