//find max in arraylist
import java.util.*;
import java.util.Collections;
public class Arraylist5{
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        
        System.out.println("before "+list);
        //ascending
        Collections.sort(list);
        System.out.println("after (asc)"+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("after (dsc)"+list);
    }
}