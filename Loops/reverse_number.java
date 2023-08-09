/**
 * reverse_number
 */
public class reverse_number {
    static int div;
    public static void main(String[] args) {
        int n = 17092004;
        while (n>0) {
            div = n%10;
            System.out.print(div);
            n=n/10;
        }
    }
}
