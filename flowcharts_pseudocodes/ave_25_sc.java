//! average of sumations of given number Scores.
import java.util.*;
public class ave_25_sc {
    static Scanner sc = new Scanner(System.in);
    static int s;//Scores
    static int c;// Sl numbers
    static int sum;
    static float ave;// Average of total sumation
    static int qty;// take the Qty of serial numbers.
    public static void main(String[] args) {
        qty = sc.nextInt();// take the Qty of serial numbers.
        sum = 0;
        int i = 0;
        for (;i<qty;i++) {
            System.out.println("enter your sl num :-");
            c = sc.nextInt();// Sl numbers
            System.out.println("type scores");
            s = sc.nextInt();//Scores
            //i++;
            sum=sum+s;
        }
        ave = sum /qty;
        System.out.println(ave+" is the average. ");
    }  
}
