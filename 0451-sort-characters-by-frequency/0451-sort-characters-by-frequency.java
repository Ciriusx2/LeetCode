class Solution {
    class Pair{
        int count;
        char ch;
        Pair(char ch,int count){
            this.ch=ch;
            this.count=count;
        }
    }
    public String frequencySort(String s) {
        int[]arr=new int[125];
        for(char ch:s.toCharArray()){
            arr[ch]++;
        }
        LinkedList<Pair> Freq_list=new LinkedList<>();
        for(int i=48;i<=122;i++){
            if(arr[i]>0){
                Freq_list.add(new Pair((char)i,arr[i]));
            }
        }
        Collections.sort(Freq_list,new Comparator<Pair>(){
            public int compare(Pair a,Pair b){
                return b.count-a.count;
            }
        });
        StringBuilder sb=new StringBuilder();
        for(Pair p:Freq_list){
            int count=p.count;
            while(count-->0){
                sb.append(p.ch);
            }
        }
        return sb.toString();
    }
}