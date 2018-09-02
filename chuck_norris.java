import java.util.*;
import java.io.*;

class Solution {

    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        char previous_digit = ' ';
        for(char letter : message.toCharArray()) {
            char[] binary = String.format("%7s", Integer.toBinaryString(letter))
                                .replace(' ', '0').toCharArray();
            for(char digit : binary) {
                if(previous_digit != digit) {
                    if(previous_digit != ' ')
                        System.out.print(" ");
                    if(digit == '1')
                        System.out.print("0 ");
                    else
                        System.out.print("00 ");
                }
                previous_digit = digit;
                System.out.print("0");
            }
        }
        
    }
}
