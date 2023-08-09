// import java.util.*;

// public class Area_of_Square {
//     static Scanner sc = new Scanner(System.in);
//     static int s;//input for chousing type
//     static int a;//input for side of Sqare
//     static int l;//input for leanth of Rectangle
//     static int w;//input for width of rectangle
//     static int areaspuare;
//     static int arearectangle;
    
//     public static void main(String[] args) {
//         System.out.print("Type 1 for square or 2 for Rectangle : -");
//         s = sc.nextInt();
//         // square
//         if (s==1) {
//             System.out.print("Type the side :- ");
//             a = sc.nextInt();
//             areaspuare = a*a;
//             System.out.println("Area of the Square is "+areaspuare);            
//         }
//         //rectangle
//         else if (s==2) {
//             System.out.print("type leanth :- ");
//             l = sc.nextInt();
//             System.out.print("Type Width :- ");
//             w = sc.nextInt();
//             arearectangle = l*w;
//             System.out.println("Area of the Rectangle is "+ arearectangle);
//         }
//         else{
//             System.out.println("Invalid");
//         }
//     }
// }



import java.util. *;
/**
 * Area_of_Square
 */
public class Area_of_Square {
    static Scanner sc = new Scanner(System.in);
    static int side,side_2;
    static int areasquare,rectangle;
    public static void main(String[] args) {
        System.out.print("Enter the number : ");    
        side = sc.nextInt();
        System.out.print("Enter the another number : ");
        side_2 = sc.nextInt();
        if (side == side_2) {
            areasquare = side * side;
            System.out.println("The area of square is "+areasquare);           
        } else {
            rectangle = side * side_2;
            System.out.println("The area of rectangle is "+rectangle);
        }
    }
}