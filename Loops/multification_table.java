import java.util.*;
public class multification_table {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        System.out.print("enter n");
        n = sc.nextInt();
        int i = 1;
        while (i<=10) {
            System.out.println("("+n+"*"+i+")"+"="+(n*i));//exm [(5*2)=10]
            i++;
        }
        }   
        

}
