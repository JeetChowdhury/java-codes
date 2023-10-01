package codes;
//! using for loop
public class reverseArray {
    public static void reverse(int[] arr) {
        for(int i = arr.length-1;i>=0;i--) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,6,2,9,8,10};
        System.out.println("before reversing");
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After reversing : ");
        reverse(arr);

    }
}
//! using swap
// package codes;

// /**
//  * reverseArray
//  */
// public class reverseArray {
//     public static void reverse(int[] arr){
//         int start = 0;
//         int end=arr.length-1;
//         while(start<end) {
//             if (start<end ) {
//                 int temp = arr[start];
//                 arr[start] = arr[end];
//                 arr[end] = temp;
//                 start++;
//                 end--;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {3,6,2,9,8,10};
//         reverse(arr);
//         for(int i = 0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }