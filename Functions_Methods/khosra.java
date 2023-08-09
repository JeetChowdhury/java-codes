import java.util.*;
/**
 * khosra
 */
public class khosra {
  static int x,y;
  static Scanner sc = new Scanner(System.in);
  public static int input(int a){
    System.out.println("enter 1st number : ");
    a = sc.nextInt();
    return a;
  }
  public static void main(String[] args) {
    int l = input(x);
    
    int o = input(y);
    int p = l+o;
    System.out.println(p);
  }
}