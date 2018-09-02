import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long r1 = in.nextLong();
        long r2 = in.nextLong();
        System.err.println("r1: " + r1 + "\n"
                          +"r2: " + r2 );
        
        while(r1 != r2)
            if(r1 < r2)
                r1 = nextRivers(r1);
            else
                r2 = nextRivers(r2);
                
        System.out.println(r1);
    }
    
    public static long nextRivers(long value) {
        for(Character ch : String.valueOf(value).toCharArray())
            value +=  Character.digit(ch, 10);
        return value; 
    }
}
