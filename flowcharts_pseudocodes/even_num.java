import java.util.*;;
public class even_num {
    static Scanner sc = new Scanner(System.in);
    static long n;
    public static void main(String[] args) {
        System.out.print("Enter your number which you wanna know even or not :- ");
        n = sc.nextLong();
        if (n%2==0) {
            System.out.println(n+" is a even.");
        }
        else{
            System.out.println(n+" this is not even.");
        }
    }
}
