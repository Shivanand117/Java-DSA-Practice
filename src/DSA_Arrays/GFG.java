package src.DSA_Arrays;

import java.util.ArrayList;
import java.util.List;

public class GFG {
    public static List<String> findSubstrings(String s) {
        
        // to store all substrings
        List<String> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                
                // substr function takes starting index
                // and ending index + 1 as parameters
                res.add(s.substring(i, j + 1));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> res = findSubstrings(s);
        for (String i : res) {
            System.out.print(i + " ");
        }
    }
}