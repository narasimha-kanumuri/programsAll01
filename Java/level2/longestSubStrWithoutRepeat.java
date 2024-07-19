import java.util.HashSet;

public class longestSubStrWithoutRepeat {
    public static void main(String[] args) {
        String str = "abcdefaghiabc";
        int ans = lenOfLongestSubStr(str);
        System.out.println(ans);
    }

    public static int lenOfLongestSubStr(String str) {
        String[] str1 = new String[10];
        HashSet<Character> set = new HashSet<>();

        int i = 0, j = 0;
        int maxLen = 0, start = 0, end = 0;
        while(j< str.length()){
            char ele = str.charAt(j);
            if(!set.contains(ele)){
                set.add(ele);
                maxLen = Math.max(maxLen,j-i+1);
                //start = i;end = j;
                j++;
            } else {
                set.remove(str.charAt(j));
                i++;
            }
        }
        return maxLen;
    }
}
