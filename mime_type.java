import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int n_association = in.nextInt(); 
        int n_analyzed = in.nextInt();  
        HashMap<String, String> mine_map = new HashMap<String, String>();
        for (int i = 0; i < n_association; i++) {
            String extension = in.next().toLowerCase();
            String mine = in.next(); 
            mine_map.put(extension, mine);
            System.err.println("Add entry: "+ extension +" -> " + mine);
        }
        
        in.nextLine();
        for (int i = 0; i < n_analyzed; i++) {
            String extension = in.nextLine();
            System.err.println("Input name: "+ extension);
            
            if  (extension.lastIndexOf(".") == -1)
                extension = "";
            else
                extension = extension.substring(extension.lastIndexOf(".")+1).toLowerCase();
            System.out.println(mine_map.containsKey(extension) ? mine_map.get( extension ) : "UNKNOWN" );
        } 
        
    }
    
}
