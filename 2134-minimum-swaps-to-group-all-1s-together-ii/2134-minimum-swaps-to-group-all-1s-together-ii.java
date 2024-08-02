class Solution {
    public int minSwaps(int[] a) {
	int windowSize = 0;
	for(int x : a){
		windowSize = x == 1 ? windowSize+1 : windowSize; 
	} 
	if (windowSize ==a.length)return 0;

	int back= 0 ;int front=windowSize - 1 ;
	int initialCount =0;
	for(int i =0 ; i<= front; i++){
	   if(a[i]==0) initialCount++;
	}
	back++;
	front++; 
	int ans = initialCount;
	while(back<a.length){
		 if(front==a.length)front=0;
		initialCount = giveMeCounts(a,back,front,initialCount);
		 ans = Math.min(ans , initialCount);
		back++; front++;
	}
	return ans;
}  
public int giveMeCounts(int []a , int b, int f,int initialCount){

	initialCount = a[b-1]==0 ? initialCount - 1 :initialCount;
	initialCount = a[f]== 0 ? initialCount+1:initialCount;
   //  System.out.println(b + " "+ f + "-" + initialCount);
	 return initialCount;
}
}
