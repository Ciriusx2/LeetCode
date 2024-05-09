class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        
        int n = happiness.length;
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((x, y) -> (y-x));
        
        for (int i = 0 ; i < n ; i++) maxheap.add(happiness[i]);
        
        long maxHappiness = 0;
        
        for (int i = 0 ; i < k ; i++) {
            maxHappiness += Math.max(maxheap.poll()-i, 0);
        }
        
        return maxHappiness;
    }
}