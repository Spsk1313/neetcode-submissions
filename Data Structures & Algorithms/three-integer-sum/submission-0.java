class Solution {
    public List<List<Integer>> threeSum(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && numbers[i] == numbers[i - 1])
                continue;
            int fixed = numbers[i];
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int leftNum = numbers[left];
                int rightNum = numbers[right];
                if (fixed + leftNum + rightNum == 0) {
                    result.add(List.of(fixed, leftNum, rightNum));
                    while (left < right && numbers[left] == leftNum)
                        left++;
                    while (left < right && numbers[right] == rightNum)
                        right--;
                } else if (leftNum + rightNum < (-1 * fixed))
                    left++;
                else
                    right--;
            }
        }
        return result;
    }
}
