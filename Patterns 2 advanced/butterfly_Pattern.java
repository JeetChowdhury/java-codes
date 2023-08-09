/**
 * butterfly_Pattern
 */
public class butterfly_Pattern {
    public static void butterfly(int row) {
        //Outer loop
        for(int i = 1;i<=row;i++) {
            //Inner loop
            //Star
            for(int j = 1; j<=i;j++) {
                System.out.print("*"+" ");
            }
            //space[s = row - i]
            for(int s = 1; s<= 2*(row-i);s++) {
                System.out.print("  ");
            }
            //star
            for(int j = 1; j<=i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i = row;i>=1;i--) {
            //Inner loop
            //Star
            for(int j = 1; j<=i;j++) {
                System.out.print("*"+" ");
            }
            //space[s = row - i]
            for(int s = 1; s<= 2*(row-i);s++) {
                System.out.print("  ");
            }
            //star
            for(int j = 1; j<=i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterfly(4);
    }
}