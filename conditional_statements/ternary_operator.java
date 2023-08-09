/**
 * ternary_operator
 */
public class ternary_operator {
    
    public static void main(String[] args) {
        int a = 10,b = 12;
        String c = (b<a)? "larger":"lower";
        //! variable = (condition)? "1st statement" : "2nd statement"
        //! ':' this means "condition thik hole 1st statement print hobe na hole 2nd statement print hobe"
        System.out.println(c);
    }
}