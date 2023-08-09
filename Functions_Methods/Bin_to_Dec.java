import java.util.*;

/**
 * Bin_to_Dec
 */
public class Bin_to_Dec {
    static int i;
    static Scanner sc = new Scanner(System.in);
    public static int UserInput(int i){
        i = sc.nextInt();
        return i;
    }
    public static int Dec(int Bin){
        int pow = 0;
        int decimal = 0;
        while(Bin>0){
            int last_digit = Bin % 10;
            decimal = decimal + (last_digit * (int)Math.pow(2, pow));
            pow++;
            Bin = Bin / 10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.print("enter the number : ");
        i = UserInput(0);
        System.out.println(i);
        
    }
}