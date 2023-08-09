import java.util.Scanner;

public class largest_two_number {
    static Scanner sc = new Scanner(System.in);
    static int a;
    static int b;
    
    
    public static void main(String[] args) {
        System.out.print("Enter 1st num : ");
        a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        b = sc.nextInt();
        
        if (a<b) {
            System.out.println("Biggest is "+b);
            
        } else if (a>b) {
            System.out.println("Biggest is "+a);
        }
        else{
            System.out.println("equal");
        }
        
    }
}
