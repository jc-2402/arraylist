//multi dim arraylist
import java.util.*;
public class Arraylist6{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        //adding elements in each list
        for(int i=1; i<=5; i++){
            list1.add(i*1); //1 2 3 4
            list2.add(i*2); //2 4 6 8
            list3.add(i*3); //3 6 9 12   
        }
        //adding the lists to the main list
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        //printing
        System.out.println(mainlist);
    }
}