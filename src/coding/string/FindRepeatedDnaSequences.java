package coding.string;

import java.util.*;

public class FindRepeatedDnaSequences {
    public static List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<=s.length()-10;i++) {
            String substring = s.substring(i,i+10);
            map.put(substring,map.getOrDefault(substring,0)+1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }
        return list;

//        [AAAAACCCCC, CCCCCAAAAA]
//        [AAAAAAAAAA]
    }

    public static void main(String[] args) {
        System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
      //  System.out.println(findRepeatedDnaSequences("AAAAAAAAAAAAA"));

    }
}
