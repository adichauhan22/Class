import java.util.*;

public class Delete_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of the element to delete: ");
        int pos = sc.nextInt();
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i++){
            if(pos <= i){
                arr[i] = arr[i+1];
            }
        }

        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}
