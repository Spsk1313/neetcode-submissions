class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            left[i + 1] = nums[i] * left[i];
        }

        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            left[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return left;
    }
}  
