

public class Question_4 {
    static byte a;
    static char b;
    static short c;
    static int d;
    static float e;
    static double f;
    
    public static void main(String[] args) {
        a = 4;
        b = 'a';
        c = 512;
        d = 1000;
        e = 3.14f;
        f = 99.9954;
        
        double Result = (f*b) + (d/b) - (c*f);
        System.out.println(Result);

        
    }
}
