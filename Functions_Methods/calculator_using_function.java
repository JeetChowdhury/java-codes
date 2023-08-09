import java.util.*;
public class calculator_using_function {
    static int a,b,total;
    static String z;
    static Scanner sc = new Scanner(System.in);//* Take number from user 
    static Scanner ac = new Scanner(System.in);//* take symbol from user
    
    public static void main(String[] args) {
        do {
            System.out.print("here type your numbers : ");
            a = sc.nextInt();
            z = ac.nextLine();
            b = sc.nextInt();
            if (z=="=") {
                switch (z) {
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
            // @total = x+y;
        } while (true);
        // System.out.println(total);
    }
}



// /**
//  * calculator_using_function
//  */
// public class calculator_using_function {

//     public static void main(String[] args) {
//         String flag = "=";
//         System.out.println(flag);
//     }
// }