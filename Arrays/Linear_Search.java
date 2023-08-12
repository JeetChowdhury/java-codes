package Arrays;
import java.util.*;
public class Linear_Search {
    static Scanner sc = new Scanner(System.in);
    public  static int LinearSearch(int marks[], int key) {
        for(int i = 0; i< marks.length;i++) {
            if (marks[i]== key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[] = {2,5,6,8,7,9,3};
        System.out.print("Enter Key : ");
        int key = sc.nextInt();
        int index = LinearSearch(marks,key);
        if (index != -1) {
            System.out.println("the index number is "+index);
        } else {
            System.out.println("not found");
        }

    }
}
