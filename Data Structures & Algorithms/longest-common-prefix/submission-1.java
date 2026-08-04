class Solution {
    public String longestCommonPrefix(String[] strs) {
       int min = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[min].length() >= strs[i].length())
                min = i;
        }
        String s = strs[min];
        int count = 0;
        outer: for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (s.charAt(i) != strs[j].charAt(i))
                    break outer;
            }
            count++;
        }
        return s.substring(0, count);
    }
}