import java.util.Scanner;
public class income_tax_calculator {
    static Scanner sc = new Scanner(System.in);
    static int a;
    public static void main(String[] args) {
        System.out.print("enter Your income : ");
        a = sc.nextInt();// taken income number from user
        if (a<500000) {
            System.out.println("your tax is 0%.");  
        }else if (a<1000000) {
            System.out.println("you have to give 20% tax.");
        } else {
            System.out.println("You have to give 30% tax");
        }
    }
}
