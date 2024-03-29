class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                res[0]=map.get(nums[i]);
                res[1]=i;
            }
            map.put(target-nums[i],i);
        }
        return res;
    }
}
