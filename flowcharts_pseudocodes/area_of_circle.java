import java.util.*;

public class area_of_circle {
    static Scanner ac = new Scanner(System.in);
    static int r = ac.nextInt();
    // static float Pi = (float) 3.14;
    public static void main(String[] args) {
        float Pi = 3.14f;//! When you type a float value, you have to put 'f' after the floating number. like- 3.14f
        int R = r*r;
        float area = R * Pi;
        
        System.out.println(area);
        
    }
}
