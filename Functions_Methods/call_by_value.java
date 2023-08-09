/**
 * call_by_value
 */
public class call_by_value {
    public static void swap(int y,int z){
        int x;
        x=y;
        y=z;
        z=x;
        System.out.println("new "+y);
        System.out.println("new "+z);
        return;
    }
    public static void main(String[] args) {
        int a,b;
        a= 10;
        b= 15;
        System.out.println("old "+a);
        System.out.println("old "+b);
        swap(a, b);
    }
}