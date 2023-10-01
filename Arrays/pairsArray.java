package codes;

public class pairsArray {
    public static void Pairs(int[] arr) {
        //outer loop
        for(int i = 0;i<arr.length;i++) {
            //inner loop
            for(int j = i+1;j<arr.length;j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,9,8};
        System.out.println("the Array is : ");
        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\n");
        Pairs(arr);
    }
}
