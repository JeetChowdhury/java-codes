import java.util.*;
public class calculator_Switch_statement {
    static Scanner sc = new Scanner(System.in);//Strings
    static Scanner ac = new Scanner(System.in);//Integers
    static String s;//Symbol
    static int a;//1st number
    static int b;//2nd number
    public static void main(String[] args) {
        System.out.print("Enter 1st number : ");
        a = ac.nextInt();// 1st number
        System.out.print("Enter 2nd number : ");
        b = ac.nextInt();// 2nd number
        System.out.print("Enter Symbol : ");
        s = sc.nextLine();// symbol
        switch (s) {
            case "+": System.out.println(a+b);
                break;
            case "-":System.out.println(a-b);
                break;
            case "*":System.out.println(a*b);
                break;
            case "/":System.out.println(a/b);
                break;
            case "%":System.out.println(a%b);
                break;
            default: System.out.println("invalid");
                break;
        }
        

    }
}
