import java.util.*;
/**
 * function_overloading
 */
public class function_overloading {
    static float x,y,z,ans;
    static Scanner sc = new Scanner(System.in);
    public static int overloading(int a,int b){
        int multiply = a*b;
        return multiply;
    }
    public static float overloading(float a,float b){
        float multiply = a*b;
        return multiply;
    }
    public static double overloading(double a,double b){
        double multiply = a*b;
        return multiply;
    }
    public static float overloading(float a,int b){
        float multiply = a*b;
        return multiply;
    }
    public static float overloading(int a,float b){
        float multiply = a*b;
        return multiply;
    }
    public static int overloading(int a,int b,int c){
        int multiply = a*b*c;
        return multiply;
    }
    public static void main(String[] args) {
        System.out.print("Enter 1st number : ");
        x = sc.nextFloat();
        System.out.print("Enter 2nd number : ");
        y = sc.nextFloat();
        // System.out.println("Enter 3rd number : ");
        // z = sc.nextInt(); 
        ans= overloading(x, y);
        System.out.println(ans);

    }
}