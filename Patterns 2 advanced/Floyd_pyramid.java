public class Floyd_pyramid {
    public static void main(String[] args) {
        FloydPyramid(5);
    }
    public static void FloydPyramid(int n){
        int counter = 1;
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            int j = 1;
            while (j <= i) {
                System.out.print(counter+" ");
                counter++;
                j++;
            }
            System.out.println();
        }
    }
}
