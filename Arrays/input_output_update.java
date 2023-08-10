package Arrays;
import java.util.*;
public class input_output_update {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numbers[] = new int[100];
        System.out.print("Enter 1st number : ");
        numbers[0] = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        numbers[1] = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        numbers[2] = sc.nextInt();
        System.out.print("Enter 4th number : ");
        numbers[3] = sc.nextInt();
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println("After recovery.");
        numbers[3] = 50;
        System.out.println(numbers[3]);

    }
}

