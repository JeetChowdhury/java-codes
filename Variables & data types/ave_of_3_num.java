import java.util.*;

public class ave_of_3_num {
    static Scanner sc = new Scanner(System.in);
    static int s;//Scores
    static int c;//Serial number
    static int sum;//sum the inputs
    static float ave;// average the inputs
    
    static int tn;//total qty of typing scores
    public static void main(String[] args) {
        System.out.print("total qty of typing scores :- ");
        tn = sc.nextInt();
        sum = 0;
        int i = 0;
        while (i<tn) {
            System.out.println("enter your sl num :-");
            c = sc.nextInt();
            System.out.println("type scores");
            s = sc.nextInt();
            i++;
            sum=sum+s;
            
        }
        ave = sum /tn;
        System.out.println(ave+" is the average. ");
        
        
    }  
}
