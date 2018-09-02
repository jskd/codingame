import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {




    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int maxX = in.nextInt(); // width of the building.
        int maxY = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        int minX = 0;
        int minY = 0;
        
        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            
            if(bombDir.matches(".*R.*")) {
                minX = X0;
                X0 += Math.ceil( (maxX - X0)  / 2.0 );
            }
            else if(bombDir.matches(".*L.*")){
                maxX = X0;
                X0 -= Math.ceil( (X0 - minX)  / 2.0 );
            }
            
            if(bombDir.matches(".*D.*")) {
                minY = Y0;
                Y0 += Math.ceil( (maxY - Y0)  / 2.0 );
            }
            else if(bombDir.matches(".*U.*")) {
                maxY = Y0;      
                Y0 -= Math.ceil( (Y0 - minY)  / 2.0 );
            }
            
            System.out.println(X0 + " " + Y0);
        }
    }
}
