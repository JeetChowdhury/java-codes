import java.util.*;
public class another_inverted_half_pyramid {
    static Scanner sc = new Scanner(System.in);
    static int Rows;
    public static void main(String[] args) {
        System.out.print("enter the number : ");
        Rows = sc.nextInt();
        number_pyramid(Rows);
    }
    public static void number_pyramid(int r){
        //outer loop
        for (int i = 1;i <= r; i++) {
            //inner loop
            for (int j = 1; j <= r-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
