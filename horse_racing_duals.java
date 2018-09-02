import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        ArrayList<Integer> horses = new ArrayList<Integer>();
        
        for (int i = 0; i < N; i++) {
            horses.add(in.nextInt());
        }

        Collections.sort(horses);
        
        int p_horse = -1;
        int closest = Integer.MAX_VALUE;
        
        for(int horse : horses) {
            if( Math.abs(p_horse - horse) < closest && p_horse != -1)
                closest = Math.abs(p_horse - horse);
            p_horse = horse;
        }

        System.out.println(closest);
    }
}
