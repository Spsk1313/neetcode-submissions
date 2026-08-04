class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums)
            freqMap.merge(num, 1, Integer::sum);
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++)
            buckets.add(new ArrayList<>());
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets.get(freq).add(num);
        }

        int index = 0;
        int[] sol = new int[k];
        for (int i = buckets.size() - 1; i >= 0; i--) {
            for (int num : buckets.get(i)) {
                sol[index++] = num;
                if (index == k)
                    return sol;
            }
        }
        return sol;
    }
}
