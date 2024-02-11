class Solution {
    private static void reverse(int[] array, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            // Swap elements at startIndex and endIndex
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;

            // Move indices towards each other
            startIndex++;
            endIndex--;
        }
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            // If the array is in descending order, reverse the whole array
            reverse(nums, 0, n - 1);
            return;
        }
        for (int i = n - 1; i >= index; i--) {
            if (nums[i] > nums[index]) {
                // Swap the elements at index and i
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        // Reverse the portion of the array to the right of the index
        reverse(nums, index + 1, n - 1);
    }
}
