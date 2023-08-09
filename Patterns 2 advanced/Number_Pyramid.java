//public class Number_Pyramid {
//    static int n;
//    public static void main(String[] args) {
//        numpyramid(4);
//    }
//    public static void numpyramid(int totRows) {
//
//        //outer loop
//        for (int i = 1;i <= totRows; i++) {
//            //inner loop
//            //space [totRows -i]
//
//            for (int s = 1; s <= (totRows-i);s++) {
//                System.out.print(" ");
//            }
//            //star
//            for (int st = 1; st <= (2*i)-1; st++) {
//                System.out.print(i+"");
//
//
//            }
//
//            System.out.println();
//
import java.util.*;
public class Number_Pyramid {
    public static void main(String[] nt) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int x=in.nextInt();
        int a=x+5;
        //System.out.println("Pattern is");
        //outer loop
        for(int i=1;i<=x;i++) {
            //inner loop
            // space 95
            for(int j=a;j!=0;j--) {
            System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
            a--;
        }
    }
}