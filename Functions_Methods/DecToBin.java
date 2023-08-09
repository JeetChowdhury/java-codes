import java.util.*;

/**
 * DecToBin
 */
public class DecToBin {
    static int i;
    static Scanner sc = new Scanner(System.in);
    public static int UserInput(int n){
        n = sc.nextInt();
        return n;
    }
    public static int DTB(int n){
        int Bin = 0;
        int re;
        int pow = 0;
        while(n>0){
            re = n%2;
            Bin = Bin + (re * (int) Math.pow(10, pow));
            n = n/2;
            pow++;
        }
        return Bin;
    }
    public static void main(String[] args) {
        System.out.print("Enter The Number : ");
        
        int Binary = DTB(UserInput(0));
        System.out.println(Binary);
    }
}