import java.util.*;

public class sum_n_of_natural_numbers {
    static Scanner aa = new Scanner(System.in);
    static int a = aa.nextInt();
    public static void main(String[] args) {
        int sum = 0;
        int val = 1;
        while (val<=a) {
            sum = sum + val;
            val++;
        }
        System.out.println(sum);
    }
    
}
