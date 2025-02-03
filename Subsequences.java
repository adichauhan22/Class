import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        subsets(nums);
    }

    public static  void subsets(int[] nums) {
        String s = "";
        subsequence(nums, 0, s);
        return ;
    }

    public static void subsequence(int[] nums, int idx, String s){
        if(idx>=nums.length){
            System.out.print(s+ ",");
            return;
        }
        s = s + nums[idx];
        subsequence(nums, idx+1, s);
        s = s.substring(0, s.length()-1);
        subsequence(nums, idx+1, s);
    }
}