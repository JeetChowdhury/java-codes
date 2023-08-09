import java.util.*;
public class positive_nagative {
    static Scanner sc = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        n = sc.nextInt();
        if (n<0) {
            System.out.println("nagative");
        }
        else{
            System.out.println("positive");
        }
    }
}
