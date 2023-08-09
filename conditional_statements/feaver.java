import java.util.*;
public class feaver {
    static Scanner sc = new Scanner(System.in);
    static double temp;
    public static void main(String[] args) {
        System.out.print("Enter your temprature : ");
        temp = sc.nextDouble();
        if (temp>100) {
            System.out.println("Feaver");
            
        } else{
            System.out.println("You don't have feaver.");
        }
    }
}
