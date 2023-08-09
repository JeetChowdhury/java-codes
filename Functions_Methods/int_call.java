//! Here i write a code , which give a output of multification,addition,division etc
import java.util.*;
public class int_call{
    //@ Sum
    public static int sum(int x,int y){//* parameters or Formal parameters
        int sum = x+y;
        return sum;
    }
    //@ Multification
    public static int mul(int x,int y){//* parameters or Formal parameters
        int sum = x*y;
        return sum;
    }
    //@ division
    public static int div(int x,int y){//* parameters or Formal parameters
        int sum = x/y;
        return sum;
    }
    //@ module
    public static int mod(int x,int y){//* parameters or Formal parameters
        int sum = x%y;
        return sum;
    }
    //@ Suvtruction
    public static int sub(int x,int y){//* parameters or Formal parameters
        int sum = x-y;
        return sum;
    }
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("enter 2st number : ");
        int b = sc.nextInt();
        int x=sum(a, b);//*arguement or actual parameters
        int y=mul(a, b);//*arguement or actual parameters
        int z=div(a, b);//*arguement or actual parameters
        int m=mod(a, b);//*arguement or actual parameters
        int n=sub(a, b);//*arguement or actual parameters
        System.out.println("The answer is "+x);
        System.out.println("The answer is "+y);
        System.out.println("The answer is "+z);
        System.out.println("The answer is "+m);
        System.out.println("The answer is "+n);
        
    }
}