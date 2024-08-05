//container with the most water
//arraylist
import java.util.*;
public class Arraylist7{
    public static int storewater(ArrayList<Integer> height){
        // //brute force
        // int maxwater = Integer.MIN_VALUE;
        // for(int i=0; i<height.size(); i++){
        //     for(int j = i+1; j<height.size(); j++){
        //         int ht = Math.min(height.get(i), height.get(j)); // height of water
        //         int width = j - i;
        //         int currwater = ht * width;
        //         maxwater = Math.max(maxwater , currwater);
        //     }
        // }
        // return maxwater;

        //by 2 pointer approach
        int maxwater = Integer.MIN_VALUE;
        int lp = 0;
        int rp = height.size() - 1;

        while(lp < rp){
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currwater = ht * width;
            maxwater = Math.max(maxwater , currwater);

            //update ptr .. to get max height of both the poles
            if(height.get(lp) < height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String args[]){
        ArrayList <Integer> height = new ArrayList<>();
        //heights
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        
        System.out.println(storewater(height));
    }
}