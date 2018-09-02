import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        
        final int idx_name = 1;
        final int idx_lon  = 4;
        final int idx_lat  = 5;
        final double eath_radius = 6371;
        
        Scanner in = new Scanner(System.in);
        double lon_a = Double.parseDouble( in.next().replace(",",".") );
        double lat_a = Double.parseDouble( in.next().replace(",",".") );
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        String answer_name = "";
        double answer_dist = Double.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            String[] DEFIB = in.nextLine().split(";");
            
            double lon_b = Double.parseDouble( DEFIB[idx_lon].replace(",",".") );
            double lat_b = Double.parseDouble( DEFIB[idx_lat].replace(",",".") );

            double x = (lon_b - lon_a) * Math.cos(  (lat_a +  lat_b ) /2);
            double y = (lat_b -  lat_a);
            double d = Math.sqrt(x*x+y*y)*eath_radius ;
            
            if(d < answer_dist) {
                answer_name = DEFIB[idx_name];
                answer_dist = d;
            }  
        }

        System.out.println(answer_name);
    }
}
