import java.util.ArrayList;
import java.util.List;

public class TestGenericConversion {
    public static void main(String [] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("one");
        list1.add(1);
        System.out.println(list1.get(0).length());
    }
}
