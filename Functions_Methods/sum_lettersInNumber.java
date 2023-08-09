import java.util.Scanner;
public class sum_lettersInNumber {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        System.out.print("enter the number : ");
        n = sc.nextInt();
        SumLetter(n);
    }
    public static void SumLetter(int a){
        int sum = 0;
        while(a>0){
            int ld = a % 10;
            sum = sum + ld;
            a = a/10;
        }
        System.out.println(sum);
    }
}
