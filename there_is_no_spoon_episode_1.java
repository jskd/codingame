import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        
        char[][] matrice = new char[height][width];
        
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < height; i++) {
            matrice[i] = in.nextLine().toCharArray(); // width characters, each either 0 or .
        }

        
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height ; y++) {
                
                int right_closet = -1;
                for(int scan_x = x+1; scan_x < width; scan_x++) {
                    if(matrice[y][scan_x] == '0') {
                        right_closet = scan_x;
                        break;
                    }
                }
                
                int down_closet = -1;
                for(int scan_y = y+1; scan_y < height; scan_y++) {
                    if(matrice[scan_y][x] == '0') {
                        down_closet = scan_y;
                        break;
                    }
                }
                
                if(matrice[y][x] == '0')
                    System.out.println( x + " " + y + " "
                    + (right_closet != -1 ? right_closet + " " + y
                    : "-1 -1")
                    + " "
                    + (down_closet != -1 ? x + " " + down_closet
                    : "-1 -1"));
            }  
            
        }
        
        
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

    }
    
}
