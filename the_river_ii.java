import java.util.*;

class Solution{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        for(int search=target-1; search>0; search--) {
            if(next_river(search) == target) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    public static int next_river(int value) {
        for(Character ch : String.valueOf(value).toCharArray())
            value +=  Character.digit(ch, 10);
        return value; 
    }
}
