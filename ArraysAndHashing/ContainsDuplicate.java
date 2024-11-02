package ArraysAndHashing;



class Solution{
    public boolean hasDuplicate(int [] nums){

        if(nums.length < 2){
            return false;
        }
        int duplicate = nums[0];

        for(int i = 1; i < nums.length; i++){
            if (duplicate == nums[i]){
                return true;

            }
            duplicate = nums[i];

        }

        return false;
    }
}

public class ContainsDuplicate {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 4};
        Solution soln = new Solution();
        System.out.println(soln.hasDuplicate(arr));
    }
}
