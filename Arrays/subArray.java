public class subArray {
    public static void Subarray(int[] arr) {
        // ? Outer loop
        for(int i = 0;i < arr.length;i++) {
            // ? Inner loop
            for(int j = i;j<arr.length;j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
          int[] arr = {2,4,6,8,10};
        Subarray(arr);
    }
}
