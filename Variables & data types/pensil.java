import java.util.*;

public class pensil {
    static Scanner sc = new Scanner(System.in);
    static float p;//pencil
    static float pe;//pen
    static float e;//eraser
    static float cost;//total cost
    public static void main(String[] args) {
        System.out.print("Type price of the pencil :- ");
        p=sc.nextFloat();
        System.out.print("Type price of the pen :- ");
        pe=sc.nextFloat();
        System.out.print("Type price of the eraser :- ");
        e=sc.nextFloat();
        cost = (p + pe + e);
        System.out.println("Total cost of these things is "+cost+"rupees[Without GST]");
        //with gst
        float gst = (cost*18)/100;
        System.out.println("With GST : "+(gst+cost));
         
    }

}
