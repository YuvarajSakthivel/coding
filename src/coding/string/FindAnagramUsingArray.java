package coding.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindAnagramUsingArray {

    public static boolean isAnagram(String s1, String s2) {

        if(s1.length() != s2.length()) return false;
        int[] counter = new int[26];
        for (int i=0;i<=s1.length()-1;i++) {
            counter[s1.charAt(i)-'a']++;
        }
        for (int i=0;i<=s2.length()-1;i++) {
            counter[s2.charAt(i)-'a']--;
            if(counter[s2.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
