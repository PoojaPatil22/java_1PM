package J_30_May_Operations_On_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {

        List list1 = new LinkedList();

        list1.add(10);
        list1.add("Welcome");
        list1.add(12.40);
        list1.add(true);
        list1.add('d');

        //...
        System.out.println("\n\t Total Elements on list1 = " + list1.size());
        System.out.println("\n\t Elements of list1 = " + list1 );
    }
}
