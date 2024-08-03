//basics of arraylist and operations
import java.util.*;
public class Arraylist1{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        //operations\
        //add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //get
        int e = list.get(2);
        System.out.println(e);

        //remove
        list.remove(4);
        System.out.println(list);

        //set
        list.set(2,10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}
