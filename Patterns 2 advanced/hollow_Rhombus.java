public class hollow_Rhombus {
    public static void main(String[] args) {
        Pyramid(5);
    }
    public static void Pyramid(int TotRows) {
        //outer loop
        for (int i = 1; i <= TotRows; i++) {
            //inner loop
            //space[TotRows-i]
            for (int s = 1; s <= (TotRows-i); s++) {
                System.out.print(" ");
            }
            for(int j = 1;j <= TotRows; j++) {
                //? we used to placeed '*' on border.
                if (i == 1 || i == TotRows || j == 1 || j == TotRows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
