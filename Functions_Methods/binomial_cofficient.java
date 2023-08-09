import java.util.*;
/**
 * binomial_cofficient
 */
public class binomial_cofficient {
    static Scanner sc = new Scanner(System.in);
    static int fact,n,r;
    //factorial
    public static int factorial(int n){
        fact = 1;
        for(int i = 1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    //binomial_officient
    public static int binocoff(int n,int r){
        int a = factorial(n);//a!
        int b = factorial(r);//a!
        int amb = factorial(n-r);//(a-b)!
        int bino = a/(b*amb);//*  a!/{a!*(a-b)!}
        return bino;
    }
    public static void main(String[] args) {
        System.out.print("Enter 1st number : ");
        n = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        r = sc.nextInt();
        int binomial_cofficient = binocoff(n, r);
        System.out.println(binomial_cofficient);
        
    }
}