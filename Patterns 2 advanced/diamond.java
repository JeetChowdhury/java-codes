public class diamond {
    public static void main(String[] args) {
        Diamond(4);
    }
    public static void Diamond(int totRows) {
        //outer loop
        for (int i = 1; i <= totRows; i++) {
            //inner loop
            //space [totRows-i]
            for (int s = 1; s <= (totRows-i);s++) {
                System.out.print("  ");
            }
            //star
            for (int st = 1; st <= (2*i)-1;st++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //mirror image
        for (int i = totRows ; i >= 1; i--) {
            //inner loop
            //space [totRows-i]
            for (int s = 1; s <= (totRows-i);s++) {
                System.out.print("  ");
            }
            //star
            for (int st = 1; st <= (2*i)-1;st++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
