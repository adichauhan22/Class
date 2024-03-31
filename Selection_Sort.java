import java.util.*;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Search(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] Search(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min_idx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = t;           
        }
        return arr;
    }
}
