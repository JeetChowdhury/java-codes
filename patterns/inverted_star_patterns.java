import java.util.*;
public class inverted_star_patterns {
    static Scanner sc = new Scanner(System.in);
    static int a;
    public static void main(String[] args) {
        a = sc.nextInt();
        for(int line = 1;line<=a;line++){
            for(int star = 1;star<=(a-line+1);star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




