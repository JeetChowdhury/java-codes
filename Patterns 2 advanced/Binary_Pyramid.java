//import java.util.*;
/**
 * Binary_Pyramid
 */
public class Binary_Pyramid {
    public static boolean IsEven(int n){
        int test = n % 2;
        if (test == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void BinPyramid(int totrows, int totcols){
        //outer loop
        for(int i=1;i <= totrows;i++) {
            //inner loop
            for(int j = 1;j <= i;j++) {
                if (IsEven(i+j)) {
                    System.out.print("1"+" ");
                } else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        BinPyramid(5, 5);
    }
}