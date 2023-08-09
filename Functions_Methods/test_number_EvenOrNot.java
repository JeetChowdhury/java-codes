import java.util.Scanner;
public class test_number_EvenOrNot {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("enter the number : ");
        int a = sc.nextInt();
        if (TestEven(a)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    public static boolean TestEven(int a){
        if (a%2==0) {
            return true;
        } else {
            return false;
        }
    }
}
