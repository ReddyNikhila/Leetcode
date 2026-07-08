class Solution {
    public int singleNumber(int[] nums) {
         HashMap<Integer,Integer> ans=new HashMap<>();
         for(int num:nums){
            ans.put(num,ans.getOrDefault(num,0)+1);

         }
         for(int val:ans.keySet()){
            if(ans.get(val)==1){
                return val;
            }
         }
         return -1;
         
    }
}