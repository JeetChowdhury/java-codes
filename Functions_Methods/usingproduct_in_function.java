import java.util.*;
public class usingproduct_in_function {
    static Scanner sc = new Scanner(System.in);
    static int a,b,pro;
    public static int products(int x,int y){
        pro = x*y;
        return pro;
        }
    public static void main(String[] args) {
        //int x,y,pro;
        System.out.print("enter your number : ");
        a = sc.nextInt();
        System.out.print("enter your number : ");
        b = sc.nextInt();
        products(a, b);
        System.out.println(products(a, b));
    }
}
