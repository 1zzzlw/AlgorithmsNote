import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: zzzlew
 * @Date: 2026/3/14 - 03 - 14 - 15:02
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class ArrayListStudy {
    public static void main(String[] args) {

        // 基于数组
        ArrayList arrayList = new ArrayList();
        boolean b = arrayList.addAll(List.of(123));
        // arrayList.get(4);

        // 基于双向链表
        LinkedList linkedList = new LinkedList();

        // linkedList.get(3);

        // 反射代码
        System.out.println(Arrays.toString(Arrays.stream(ArrayListStudy.class.getMethods()).map(item -> {
            // 调用里面的方法
            try {
                if (item.getName().equals("Text")) {
                    Object value = item.invoke(null);
                    System.out.println(value);
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
            return item.getName();
        }).toArray()));
    }

    public static int Text() {
        return 2222332;
    }
}
