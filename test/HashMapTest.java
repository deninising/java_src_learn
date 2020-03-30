import java.util.HashMap;

/**
 * 描述： hashmap学习
 *
 * @author Dennis
 * @version 1.0
 * @date 2020/3/28 22:47
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("k1", 1);
        map.remove("k1");
        System.out.println(map);
    }
}
