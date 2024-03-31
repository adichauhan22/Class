import java.util.*;

public class Linear_search {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           String str = sc.nextLine();
           char s = sc.next().charAt(0);
           int len = str.length();

           System.out.println(Search(str, s));
    }

          public static int Search(String str, char s){
            int count = 0;
            int index = 0;
            for(int i=0; i<str.length(); i++){
                count = 0;
                if(s==(str.charAt(i))){
                    count = count + 1;
                    index = i;
                }
                if(count == 1){
                    System.out.println("Charecter is available at index " + index);
                }
            }
            if(count == 0){
                System.out.println("not available");
            }
            return -1;
        }

    }

    //         System.out.println("Enter the size of array: ");
//         int n = sc.nextInt();
        
//         int[] arr = new int[n];

//         System.out.println("Enter the elements of the array: ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the elememt to be searched: ");
//         int temp = sc.nextInt();
//         System.out.println(Search(arr, temp));
//     }

//     public static int Search(int[] arr, int temp){
//         for(int i=0; i<arr.length; i++){
//             if(temp == arr[i]){
//                 return i;
//             }
//         }
//         return -1;

//     }

