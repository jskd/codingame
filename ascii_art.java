import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        
        List<String[]> letters = new ArrayList<String[]>();
        
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
             
            letters.add(ROW.split("(?<=\\G.{" + L +"})"));
        }
        
        for(int line=0; line<H; line++)
        {
            String p_line = "";
            for(char ch: T.toCharArray()) {
                int letter_number = Character.getNumericValue(ch) - Character.getNumericValue('A');
                letter_number = letter_number >= 0 && letter_number <= 25 ?   letter_number : 26 ;
                p_line += letters.get(line)[letter_number];
            }

            System.out.println(p_line);
        }
    }
    
}
