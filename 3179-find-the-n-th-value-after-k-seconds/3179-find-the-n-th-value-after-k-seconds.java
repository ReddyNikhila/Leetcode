class Solution {
    public int valueAfterKSeconds(int n, int k) {
           int mod = 1_000_000_007;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(1);
        }
        int[] presum=new int[n];
        int c=0;
        while(c<k){
        presum[0]=1;
        for(int i=1;i<n;i++){
          presum[i]=(int)((long)presum[i-1]+ans.get(i))%mod;
        }
        for(int i = 0; i < n; i++){
             ans.set(i, presum[i]);
           }
         c++;
        }
        
        return ans.get(n-1);

    }
}