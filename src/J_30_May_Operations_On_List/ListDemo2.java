package J_30_May_Operations_On_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 30-05-2017.
 */
public class ListDemo2 {
    public static void main(String[] args) {

        List<Integer> numsList = new ArrayList<>(50);
        numsList.add(90);
        numsList.add(10);
        numsList.add(90);
        numsList.add(0, 20);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        numsList.addAll(list2);

        numsList.addAll(Arrays.asList(23,4,3,12,53));

        System.out.println("\n\t element added : " + numsList.add(80));

        int value = numsList.get(1);
        numsList.set(0, 220);
        System.out.println( "\n\t numslist = " + numsList);

        numsList.remove(2);
        System.out.println("\n\t After Remove, Numslist = " +numsList);

        boolean result    = numsList.remove(new Integer(220));
        System.out.println("\n\t Item Deleted :" + result);
        System.out.println("\n\t After Remove, Numslist = " +numsList);
    }
}
