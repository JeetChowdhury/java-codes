import java.util.*;
/**
 * sum_of_even_and_odd
 */
public class sum_of_even_and_odd {
    static Scanner sc = new Scanner(System.in);
    static int en;
    static int even;
    static int odd;
    public static void main(String[] args) {
        System.out.print("enter your numbers : ");//here i can take number
        en = sc.nextInt();
        for(int i = 1;i<=en;i++){
            if (i%2==0) {
                System.out.println("even number is : "+i+" ");
                even += i;    
            }else if (i%2!=0) {
                System.out.print("odd numbers is : "+i+" ");
                odd += i;
            }
        }
        System.out.println("sum of total even numbers : "+even);
        System.out.println("sum of total odd numbers : "+odd);   
    }
}
