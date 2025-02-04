public class Print_sub_ofSum_k {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int n = arr.length;
        int target = 2;
        Print_sub(arr, 0, "", 0, target , n);
        System.out.println();
        Print_one(arr, 0, "", 0, target, n);
        System.out.println(Count_subsequence(arr, 0, "", 0, target, n));
    }

    public static void Print_sub(int[] arr, int idx, String s, int sum, int target, int n){
        if(idx==n){
            if(sum==target){
                System.out.print(s+", ");
            }
            return;
        }
        s = s + arr[idx] + " ";
        sum = sum + arr[idx];
        Print_sub(arr, idx+1, s, sum, target, n);
        s = s.substring(0, s.length()-2);
        sum = sum - arr[idx];
        Print_sub(arr, idx+1, s, sum, target, n);
    }

    public static boolean Print_one(int[] arr, int idx, String s, int sum, int target, int n){
        if(idx==n){
            if(sum==target){
                System.out.println(s+" ");
                return true;
            }
            return false;
        }
        s = s + arr[idx] + " ";
        sum = sum + arr[idx];
        if(Print_one(arr, idx+1, s, sum, target, n)==true){
            return true;
        };
        s = s.substring(0, s.length()-2);
        sum = sum - arr[idx];
        if(Print_one(arr, idx+1, s, sum, target, n)==true){
            return true;
        };
        return false;
    }

    public static int Count_subsequence(int[] arr, int idx, String s, int sum, int target, int n){
        if(idx==n){
            if(sum==target){
                return 1;
            }
            return 0;
        }
        sum = sum + arr[idx];
        int l = Count_subsequence(arr, idx+1, s, sum, target, n);
        sum = sum - arr[idx];
        int r = Count_subsequence(arr, idx+1, s, sum, target, n);
        return l + r;
    }
}
