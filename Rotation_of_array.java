import java.util.*;

public class Rotation_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number such times we have to rotate the elements: ");
        int k = sc.nextInt();

        Rotate(arr, k);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void Rotate(int[] arr, int k){
        k = k % arr.length;
        int n = arr.length;
        Reverse(arr, 0, n-k-1);
        Reverse(arr, n-k, n-1);
        Reverse(arr, 0, n-1);
    }

    public static void Reverse(int[] arr, int i, int j){
        int temp =0;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
