import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    
    final static int MIN = -273;
    final static int MAX = 5526;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        
        
        if(n == 0) {
            System.out.println("0");
            return;
        }
        
        int selected = MAX;
        
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
        
            if(Math.abs(t) < Math.abs(selected))
                selected = t;
            if(Math.abs(t) == Math.abs(selected) && t > selected)
                selected = t;
            
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(Integer.toString(selected));
    }
}
