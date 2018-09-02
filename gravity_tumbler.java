import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.Collectors;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();
        int count = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        char[][] landscape = new char[height][width];
        for (int i = 0; i < height; i++) {
            landscape[i]  = in.nextLine().toCharArray();
            System.err.println(landscape[i]);
        }

       for(int turn = 0; turn < count; turn++){     
            // Apply gravity left
            for (int i = 0; i < landscape.length; i++) {
                
                // Gravity on right: Reorder chars
                Arrays.sort(landscape[i]);
                
                // Gravity on left: Flip vertically
                for(int j = 0; j < landscape[i].length / 2; j++)
                {
                    char temp = landscape[i][j];
                    landscape[i][j] = landscape[i][landscape[i].length - j - 1];
                    landscape[i][landscape[i].length - j - 1] = temp;
                }
            }

            // Rotate landscape (left side to bottom)
            char[][] old_landscape =  landscape;  
            landscape =  new char[old_landscape[0].length][old_landscape.length];
            for (int x = 0; x < landscape.length; x++)
                for (int y = 0; y < landscape[x].length; y++)
                    landscape[x][y] = old_landscape[y][x];
        }

        // Print landscape
        for (int i = 0; i < landscape.length; i++)
             System.out.println(landscape[i]);
    }
}
