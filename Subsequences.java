import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        subseq(nums);
    }

    public static List<List<Integer>> subseq(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        subsequence(nums, 0, list, ll);
        return list;
    }

    public static void subsequence(int[] nums, int idx, List<List<Integer>> list, List<Integer> ll){
        if(idx>=nums.length){
            list.add(new ArrayList<>(ll));
            return;
        }
        ll.add(nums[idx]);
        subsequence(nums, idx+1, list, ll);
        ll.remove(ll.size()-1);
        subsequence(nums, idx+1, list,ll);
    }
}
