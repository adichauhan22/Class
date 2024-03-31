import java.util.*;

public class Insert_an_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            System.out.println("Enter the element to be inserted: ");
            int ele = sc.nextInt();
            System.out.println("Enter the position where to insert the element: ");
            int pos = sc.nextInt();

            int[] arr = new int[n];
    
            System.out.println("Enter the elements of the array: ");
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            arr[pos] = ele;
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]);
            }
        }
}