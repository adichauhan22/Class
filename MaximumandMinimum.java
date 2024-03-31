import java.util.*;

public class MaximumandMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
                if(max < arr[i]){
                    max = arr[i];
                }
            }
        System.out.println("Maximum value in the array" + max);

        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum value in the array" + min);
   }
}

