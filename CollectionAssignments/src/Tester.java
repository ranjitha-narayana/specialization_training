import java.util.ArrayList;
import java.util.List;

public class Tester {
        public static void main(String [] args) {
            List<Object> list1 = new ArrayList<Object>();
            List<Object> list2= list1;
            list2.add(12);
            System.out.println(list2.size());
        }
    }

