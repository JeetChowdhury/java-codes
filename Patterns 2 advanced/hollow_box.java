import java.util.*;
/**
 * hollow_box
 */
public class hollow_box {
    static Scanner sc = new Scanner(System.in);
    static int x,y;
    public static void main(String[] args) {
        System.out.print("Enter Total Rows : ");
        x = sc.nextInt();
        System.out.print("Enter Total Columns : ");
        y = sc.nextInt();

        hollowBox(x, y);
    }
    public static void hollowBox(int totRows, int totCols){
        //* outer Loop
        for (int i = 1;i<= totRows;i++) {
            //* Inner Loop
            for(int j = 1;j <= totCols; j++) {
                //? we used to placeed '*' on border.
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}