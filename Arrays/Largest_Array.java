package Arrays;
public class Largest_Array {
    public static void Largest(int marks[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0;i< marks.length;i++) {
            if (largest < marks[i]){
                largest = marks[i];
            }
            if (smallest > marks[i]) {
                smallest = marks[i];
            }
        }
        System.out.println("Largest = "+largest);
        System.out.println("Smallest = "+smallest);
    }
    public static void main(String[] args) {
        int marks[] = {-111,-113,6,7,4,9,8};
        Largest(marks);
    }
}
