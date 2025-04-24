class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        longest(nums,new ArrayList<>(), result,new boolean[nums.length]);
        return result;
    }
    public void longest(int[] nums , List<Integer> newstr,List<List<Integer>> result,boolean[] isused){
        if(newstr.size() == nums.length){
            result.add(new ArrayList<>(newstr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(isused[i]) continue;
            isused[i] = true;
            newstr.add(nums[i]);
            longest(nums,newstr,result,isused);
            isused[i] = false;
            newstr.remove(newstr.size() - 1);
        }
    }
}