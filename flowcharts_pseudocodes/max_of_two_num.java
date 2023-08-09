import java.util.*;
class max_of_two_num{
    static Scanner sc = new Scanner(System.in);
    static int a;
    static int b;
    public static void main(String[] args) {
        System.out.print("enter your first number :- ");
        a = sc.nextInt();
        System.out.print("Enter your secend number :- ");
        b = sc.nextInt();
        if (a>b) {
            System.out.println(a+" is greater");
            
        }
        else{
            System.out.println(b+" is greater");
        }
    }
}
