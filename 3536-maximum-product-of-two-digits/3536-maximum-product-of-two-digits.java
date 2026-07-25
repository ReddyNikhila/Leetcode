class Solution {
    public int maxProduct(int n) {
        int temp=n;
        int c=0;
        while(temp!=0){
            c++;
            temp=temp/10;
        }
        int[] ans=new int[c];
        int i=0;
        while(n!=0){
            int r=n%10;
             ans[i++]=r;
             n=n/10;
        }
        int max=0;
        for(int i1=0;i1<ans.length;i1++){
            for(int j=i1+1;j<ans.length;j++){
                max=Math.max(max,ans[i1]*ans[j]);
            }
        }
        return max;
    }
}