class Solution {
    public List<Integer> majorityElement(int[] nums) {
          int c=nums.length/3;
          HashMap<Integer,Integer> ans =new HashMap<>();
          List<Integer> res=new ArrayList<>();
          for(int num:nums){
            ans.put(num,ans.getOrDefault(num,0)+1);
          }
          for(int val:ans.keySet()){
            if(ans.get(val)>c){
                res.add(val);
            }
          }
          return res;
    }
}