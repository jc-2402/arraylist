//pair sum 1
// find if any pair in sorted arraylist has target sum
// list - [1,2,3,4,5,6] target = 5
import java.util.*;
public class Arraylist9{
    public static boolean  pairsum2(ArrayList <Integer> list, int target){

        //2 pointer approach
        int pivotpoint = -1; //does not exist initially
        int n = list.size();
        //to find breaking or pivot point
        for(int i=0;i<n; i++){
            if(list.get(i) > list.get(i+1)){//since sorted list
                pivotpoint = i;
                break;
            }
        } 

        int lp =pivotpoint+1;
        int rp = pivotpoint;
        while(lp != rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //case 2
            if(list.get(lp) + list.get(rp) < target){
                lp =(lp+1)%n;
            }
            //case 3
            if(list.get(lp) + list.get(rp) > target){
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target  = 16;

        System.out.println(pairsum2(list,target));
    }
}