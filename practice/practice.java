package practice;

import java.util.Scanner;
public class practice{
    public static void main(String[] args) {
    try (Scanner sc = new Scanner (System.in)) {
        int num;// To hold number
        int fact=1;// To hold factorial
        System.out.print("Enter any positive integer:");
        num=sc.nextInt();
        for(int i=1;i<=num;i++) {
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
    }}}