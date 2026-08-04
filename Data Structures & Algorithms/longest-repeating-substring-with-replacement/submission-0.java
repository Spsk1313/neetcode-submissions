class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            freq[rightChar - 'A']++;

            int maxFreq = getMaxFreq(freq);

            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'A']--;
                left++;

                maxFreq = getMaxFreq(freq);
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    private static int getMaxFreq(int[] freq) {
        int max = 0;

        for (int count : freq) {
            max = Math.max(max, count);
        }

        return max;
    }
}
