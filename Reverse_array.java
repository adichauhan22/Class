import java.util.*;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Reverse(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public static void Reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        int temp=0;
        while(i>j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
  