class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int s=0;
        int pr=1;
      while(temp!=0){
        int r=temp%10;
        s+=r;
        pr*=r;
        temp=temp/10;
      }
     return n % (s + pr) == 0;
    }
}