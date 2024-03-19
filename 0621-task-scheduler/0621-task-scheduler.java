class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> mp=new HashMap();
        for(char t: tasks){
            mp.put(t, mp.getOrDefault(t,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue(mp.size(),Collections.reverseOrder());
        pq.addAll(mp.values());
        int result=0;
        while(!pq.isEmpty()){
            int time=0;
            List<Integer> tmp=new ArrayList();
            for(int i=0;i<n+1;i++){
                if(!pq.isEmpty()){
                    tmp.add(pq.remove()-1);
                    time++;
                }
            }
            for(int t:tmp){
                if(t>0) pq.add(t);
            }
            result+=pq.isEmpty()?time:n+1;
        }
        return result;
    }
}