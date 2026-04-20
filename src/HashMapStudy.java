import org.w3c.dom.Node;

import java.util.HashMap;

import static java.util.Objects.hash;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/14 - 03 - 14 - 16:41
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class HashMapStudy {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        Integer aaa = hashMap.put("aaa", 111);
        Integer bbb = hashMap.put("aaa", 666);


        String key = "aaa";
        Integer value = 111;
        System.out.println(key.hashCode());
        System.out.println(key.hashCode() >>> 16);
        System.out.println(key.hashCode() ^ key.hashCode() >>> 16);

        putVal(hash(key), key, value, false, true);

        hashMap.put("bbb", 222);
        hashMap.put("ccc", 333);
        hashMap.put("ddd", 444);
    }

    /**
     * @param hash         -- 键的hash值
     * @param key          -- 键
     * @param value        -- 值
     * @param onlyIfAbsent -- 如果键重复是否保留，默认为false不保留
     * @param evict        -- 暂时不需要
     *
     */
    public static void putVal(int hash, String key, Integer value, boolean onlyIfAbsent,
                              boolean evict) {
    }
}
