package coding.string;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String oddPalindrome = expandAroundCenter(s,i,i);
            String evenPalindrome = expandAroundCenter(s,i,i+1);
            if(oddPalindrome.length()>longest.length())
                longest = oddPalindrome;
            if(evenPalindrome.length()>longest.length())
                longest = evenPalindrome;
        }
        return longest;

    }
    private static String expandAroundCenter(String s,int left,int right) {
        while(left >=0 && right < s.length() && s.charAt(left)==s.charAt(right)) {
            left --;
            right ++;
        }
        return s.substring(left+1,right);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
