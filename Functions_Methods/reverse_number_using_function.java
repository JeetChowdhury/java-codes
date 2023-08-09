/**
 * reverse_number_using_function
 */
public class reverse_number_using_function {
    static int rv_number;
    public static void rv(int n){
        while (n>0) {
            rv_number = n%10;
            System.out.print(rv_number);
            n = n/10;
        }
    }
    public static void main(String[] args) {
        rv(17092004);
    }
}