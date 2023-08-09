import java.util.*;
/**
 * star_patterns
 */
public class star_patterns {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        n = sc.nextInt();
        for(int line = 1;line<=n;line++){
            for(int star = 1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
