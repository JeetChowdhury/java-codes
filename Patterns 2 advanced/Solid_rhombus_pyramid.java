class Solid_rhombus_pyramid {
    public static void main(String[] args) {
        Pyramid(4);
    }
    public static void Pyramid(int TotRows) {
        //outer loop
        for (int i = 1; i <= TotRows; i++) {
            //inner loop
            //space[TotRows-i]
            for (int s = 1; s <= (TotRows-i); s++) {
                System.out.print(" ");
            }
            //star
            for (int st = 1; st <= TotRows; st++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}