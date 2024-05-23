class Solution {
    public int countBeautifulSubsets(int[] nums, int difference, int index, int mask) {
        
        if (index == nums.length) 
            return mask > 0 ? 1 : 0;

        boolean isBeautiful = true;

        
        for (int j = 0; j < index && isBeautiful; ++j)
            isBeautiful = ((1 << j) & mask) == 0 || Math.abs(nums[j] - nums[index]) != difference;

        int skip = countBeautifulSubsets(nums, difference, index + 1, mask);
        int take = isBeautiful ? countBeautifulSubsets(nums, difference, index + 1, mask + (1 << index)) : 0;
        
        return skip + take;
    }

    public int beautifulSubsets(int[] nums, int difference) {
        return countBeautifulSubsets(nums, difference, 0, 0);
    }
}