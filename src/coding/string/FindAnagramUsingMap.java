package coding.string;
import java.util.*;

public class FindAnagramUsingMap {

    public static boolean isAnagram(String s1, String s2) {

        Map<Character,Integer> s1_m1 = new HashMap<>();
        Map<Character,Integer> s2_m2 = new HashMap<>();

        if(s1.length() != s2.length()) return false;

        for (int i=0;i<s1.length();i++) {
            s1_m1.put(s1.charAt(i),s1_m1.getOrDefault(s1.charAt(i),0)+1);
            s2_m2.put(s2.charAt(i),s2_m2.getOrDefault(s2.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> en : s1_m1.entrySet()) {
            char key = en.getKey();
            int val1 = en.getValue();
            int val2 = s2_m2.getOrDefault(key,0);
            if (val1!=val2) return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
