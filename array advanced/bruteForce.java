public class bruteForce {
    public static void Brute(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        // ? Outer loop
        for(int i = 0;i < arr.length;i++) {
            curSum = 0;
            // ? Inner loop
            for(int j = i;j<arr.length;j++) {
                curSum = curSum + arr[j];
                System.out.print(arr[j]+" ");         
            }
            System.out.println();
            System.out.println("Total is : "+curSum);
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            System.out.println();
        }
        System.out.println("The max Sum is : "+maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        Brute(arr);
    }
}
