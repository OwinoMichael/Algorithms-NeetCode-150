package ArraysAndHashing;


import java.util.HashSet;

class Solution1{
    public boolean hasDuplicate(int [] nums){

        if(nums.length < 2){
            return false;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums){
            if(set.contains(nums[num])){
                return true;
            }

            set.add(num);
        }

        return false;

    }
}

public class ContainsDuplicate2 {

    public static void main(String[] args) {

        int [] nums = {1, 2, 4, 3, 4};
        Solution1 soln = new Solution1();
        System.out.println(soln.hasDuplicate(nums));
    }
}
