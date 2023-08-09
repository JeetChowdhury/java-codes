package practice;
import java.util.*;
public class practice_2 {
    static Scanner sc = new Scanner(System.in);
    static Scanner ac = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        String y = ac.nextLine();
        int b = sc.nextInt();
        switch (y) {
            case "+": System.out.println((a+y+b)+" = "+(a+b));
                break;
            case "-":System.out.println((a+y+b)+" = "+(a-b));
                break;
            case "*":System.out.println((a+y+b)+" = "+(a*b));
                break;
            case "/":System.out.println((a+y+b)+" = "+(a/b));
                break;
            case "%":System.out.println((a+y+b)+" = "+(a%b));
                break;
            default: System.out.println("invalid");
                break;
        }
    }
}
